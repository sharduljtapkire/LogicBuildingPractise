/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program541.java
//  Description : Marvellous CVFS - Custom Virtual File System in Java
//                Supports commands: exit, help, clear, man, creat
//                Implements inode management and file creation simulation
//  Author      : Shardul Tapkire
//  Date        : 27/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

///////////////////////////////////////////////////////////////////////
//
//  Class Name :     BootBlock 
//  Description :    Holds information to boot the operating system
//
///////////////////////////////////////////////////////////////////////
class BootBlock
{
    public String Information;

    public BootBlock()
    {
        Information = "";
    }
}

///////////////////////////////////////////////////////////////////////
//
//  Class Name :     SuperBlock 
//  Description :    Holds information about the file system
//
///////////////////////////////////////////////////////////////////////
class SuperBlock
{
    public int TotalInodes;
    public int FreeInodes;

    public SuperBlock()
    {
        TotalInodes = 0;
        FreeInodes = 0;
    }
}

///////////////////////////////////////////////////////////////////////
//
//  Class Name :     Inode 
//  Description :    Holds information about the file
// 
///////////////////////////////////////////////////////////////////////
class Inode
{
    public String FileName;
    public int InodeNumber;
    public int FileSize;
    public int ActualFileSize;
    public int FileType;
    public int ReferenceCount;
    public int LinkCount;
    public int Permission;
    public byte[] Buffer; // Instead of char*
    public Inode next;

    public Inode()
    {
        FileName = "";
        InodeNumber = 0;
        FileSize = 0;
        ActualFileSize = 0;
        FileType = 0;
        ReferenceCount = 0;
        LinkCount = 0;
        Permission = 0;
        Buffer = null;
        next = null;
    }
}

///////////////////////////////////////////////////////////////////////
//
//  Class Name :     FileTable 
//  Description :    Holds information about the opened file
// 
///////////////////////////////////////////////////////////////////////
class FileTable
{
    public int ReadOffset;
    public int WriteOffset;
    public int Count;
    public int Mode;
    public Inode ptrinode;

    public FileTable()
    {
        ReadOffset = 0;
        WriteOffset = 0;
        Count = 0;
        Mode = 0;
        ptrinode = null;
    }
}

///////////////////////////////////////////////////////////////////////
//
//  Class Name :     UAREA 
//  Description :    Holds information about the process
// 
///////////////////////////////////////////////////////////////////////
class UAREA
{
    public String ProcessName;
    public FileTable[] UFDT;

    public UAREA(int maxInodes)
    {
        ProcessName = "";
        UFDT = new FileTable[maxInodes];
    }
}

public class Program541
{
    ///////////////////////////////////////////////////////////////////////
    //
    //  User defined Macros (as static final variables)
    //
    ///////////////////////////////////////////////////////////////////////
    public static final int MAXFILESIZE = 100;
    public static final int MAXINODE = 5;
    public static final int READ = 1;
    public static final int WRITE = 2;
    public static final int EXECUTE = 4;
    public static final int REGULARFILE = 1;
    public static final int SPECIALFILE = 2;
    public static final int START = 0;
    public static final int CURRENT = 1;
    public static final int END = 2;

    ///////////////////////////////////////////////////////////////////////
    //
    //  User defined Macros for error handling
    //
    ///////////////////////////////////////////////////////////////////////
    public static final int ERR_INVALID_PARAMETER = -1;
    public static final int ERR_NO_INODES = -2;
    public static final int ERR_FILE_ALREADY_EXIST = -3;

    ///////////////////////////////////////////////////////////////////////
    //
    //  Global variables or objects used in the project
    //
    ///////////////////////////////////////////////////////////////////////
    static BootBlock bootobj = new BootBlock();
    static SuperBlock superobj = new SuperBlock();
    static Inode head = null;
    static UAREA uareaobj = new UAREA(MAXINODE);

    ///////////////////////////////////////////////////////////////////////
    //
    //  Function Name :     InitialiseUAREA
    //  Description :       It is used to intialise the contents UAREA
    //  Author :            Shardul Tapkire
    //  Date :              27/09/2025
    //
    ///////////////////////////////////////////////////////////////////////
    public static void InitialiseUAREA()
    {
        uareaobj.ProcessName = "Myexe";
        int i = 0;
        while (i < MAXINODE)
        {
            uareaobj.UFDT[i] = null;
            i++;
        }
        System.out.println("Marvellous CVFS : UAREA initialised succesfully");
    }

    ///////////////////////////////////////////////////////////////////////
    //
    //  Function Name :     InitialiseSuperblock
    //  Description :       It is used to intialise the contents of super block
    //  Author :            Shardul Tapkire
    //  Date :              27/09/2025
    //
    ///////////////////////////////////////////////////////////////////////
    public static void InitialiseSuperblock()
    {
        superobj.TotalInodes = MAXINODE;
        superobj.FreeInodes = MAXINODE;
        System.out.println("Marvellous CVFS : Superblock initialised succesfully");
    }

    ///////////////////////////////////////////////////////////////////////
    //
    //  Function Name :     CreateDILB
    //  Description :       It is used to create Linked List of Inodes
    //  Author :            Shardul Tapkire
    //  Date :              27/09/2025
    //
    ///////////////////////////////////////////////////////////////////////
    public static void CreateDILB()
    {
        int i = 1;
        Inode newn = null;
        Inode temp = head;

        while (i <= MAXINODE)
        {
            newn = new Inode();
            newn.InodeNumber = i;
            // Other members are already initialized to 0/null by the constructor

            if (temp == null)
            {
                head = newn;
                temp = head;
            }
            else
            {
                temp.next = newn;
                temp = temp.next;
            }
            i++;
        }
        System.out.println("Marvellous CVFS : DILB created succesfully");
    }

    ///////////////////////////////////////////////////////////////////////
    //
    //  Function Name :     StartAuxilaryDataInitialisation
    //  Description :       It is used to intialise the Auxilary data
    //  Author :            Shardul Tapkire
    //  Date :              27/09/2025
    //
    ///////////////////////////////////////////////////////////////////////
    public static void StartAuxilaryDataInitialisation()
    {
        bootobj.Information = "Boot process of Opertaing System done";
        System.out.println(bootobj.Information);
        InitialiseSuperblock();
        CreateDILB();
        InitialiseUAREA();
        System.out.println("Marvellous CVFS : Auxilary data initalised succesfully");
    }

    ///////////////////////////////////////////////////////////////////////
    //
    //  Function Name :     DisplayHelp
    //  Description :       It is used to Display the information about commands
    //  Author :            Shardul Tapkire
    //  Date :              27/09/2025
    //
    ///////////////////////////////////////////////////////////////////////
    public static void DisplayHelp()
    {
        System.out.println("---------------------------------------------------------");
        System.out.println("----------- Command Manual of Marvellous CVFS -----------");
        System.out.println("---------------------------------------------------------");
        System.out.println("exit : It is used to terminate the shell of Marvellous CVFS");
        System.out.println("clear : It is used to clear the console of Marvellous CVFS");
        System.out.println("creat <FileName> <Permission> : Create a new file");
        System.out.println("man <CommandName> : Display manual page for a command");
        // Add more options here
        System.out.println("---------------------------------------------------------");
    }

    ///////////////////////////////////////////////////////////////////////
    //
    //  Function Name :     ManPage
    //  Description :       It is used to Display the manual page of the command
    //  Input :             It accepts the command name
    //  Output :            Displays the manual details of the command
    //  Author :            Shardul Tapkire
    //  Date :              27/09/2025
    //
    ///////////////////////////////////////////////////////////////////////
    public static void ManPage(String name) // Name of command
    {
        if (name.equals("creat"))
        {
            System.out.println("Description : This command is used to create new regular file on our file system");
            System.out.println("Usage : creat File_name Permissions");
            System.out.println("File_name : The name of file that you want to create");
            System.out.println("Permissions : \n1 : Read \n2 : Write \n3 : Read + Write");
        }
        else if (name.equals("exit"))
        {
            System.out.println("Description : This command is used to terminate the Marvellous CVFS");
            System.out.println("Usage : exit");
        }
        // Add more options here
        else
        {
            System.out.println("No manual entry for " + name);
        }
    }

    ///////////////////////////////////////////////////////////////////////
    //
    //  Function Name :     IsFileExists
    //  Description :       It is used to check whether the given file name is exist or not
    //  Input :             It accepts the file name
    //  Output :            It returns boolean value (True : if present False : if not present)
    //  Author :            Shardul Tapkire
    //  Date :              27/09/2025
    //
    ///////////////////////////////////////////////////////////////////////
    public static boolean IsFileExists(String name) // Name of file that we want to check
    {
        Inode temp = head;
        boolean bFlag = false;

        while (temp != null)
        {
            if (name.equals(temp.FileName) && (temp.FileType == REGULARFILE))
            {
                bFlag = true;
                break;
            }
            temp = temp.next;
        }
        return bFlag;
    }

    ///////////////////////////////////////////////////////////////////////
    //
    //  Function Name :     CreateFile
    //  Description :       It is used to create a new regular file
    //  Input :             It accepts the file name and permission
    //  Output :            It returns the file descriptor
    //  Author :            Shardul Tapkire
    //  Date :              27/09/2025
    //
    ///////////////////////////////////////////////////////////////////////
    public static int CreateFile(String name, int permission) // Name of file, Permission to create file
    {
        Inode temp = head;
        int i = 0;

        System.out.println("Current Inodes remaining : " + superobj.FreeInodes);

        // Filters
        // If file name is missing
        if (name == null)
        {
            return ERR_INVALID_PARAMETER;
        }

        // If entered permission is invalid
        if (permission < 1 || permission > 3)
        {
            return ERR_INVALID_PARAMETER;
        }

        // Check whether empty inode is there or not
        if (superobj.FreeInodes == 0)
        {
            return ERR_NO_INODES;
        }

        // Check whether file is already exist or not
        if (IsFileExists(name))
        {
            return ERR_FILE_ALREADY_EXIST;
        }

        // Loop to search free Inode
        while (temp != null)
        {
            if (temp.FileType == 0)
            {
                break;
            }
            temp = temp.next;
        }

        // Inode not found (should not happen if FreeInodes > 0)
        if (temp == null)
        {
            System.out.println("Inode not found");
            return ERR_NO_INODES;
        }

        // Search first empty slot from UFDT
        for (i = 0; i < MAXINODE; i++)
        {
            if (uareaobj.UFDT[i] == null)
            {
                break;
            }
        }

        if (i == MAXINODE)
        {
            System.out.println("Unable to create file as MAX OPENED FILE LIMIT REACHED");
            return -1;
        }

        // Allocate memory for file table
        uareaobj.UFDT[i] = new FileTable();

        // Initialise elements of File table
        uareaobj.UFDT[i].ReadOffset = 0;
        uareaobj.UFDT[i].WriteOffset = 0;
        uareaobj.UFDT[i].Count = 1;
        uareaobj.UFDT[i].Mode = permission;

        // Connect file table with Inode
        uareaobj.UFDT[i].ptrinode = temp;

        uareaobj.UFDT[i].ptrinode.FileName = name;
        uareaobj.UFDT[i].ptrinode.FileSize = MAXFILESIZE;
        uareaobj.UFDT[i].ptrinode.ActualFileSize = 0;
        uareaobj.UFDT[i].ptrinode.FileType = REGULARFILE;
        uareaobj.UFDT[i].ptrinode.ReferenceCount = 1;
        uareaobj.UFDT[i].ptrinode.LinkCount = 1;
        uareaobj.UFDT[i].ptrinode.Permission = permission;

        // Allocate memory for Buffer
        uareaobj.UFDT[i].ptrinode.Buffer = new byte[MAXFILESIZE];

        // Decrement the number of free inodes by 1
        superobj.FreeInodes--;

        return i; // Return file descriptor
    }

    ///////////////////////////////////////////////////////////////////////
    //
    //  Entry point function of project (main)
    //
    ///////////////////////////////////////////////////////////////////////
    public static void main(String arg[])
    {
        String str;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        StartAuxilaryDataInitialisation();

        System.out.println("---------------------------------------------------------");
        System.out.println("--------- Marvellous CVFS Started Succesfully -----------");
        System.out.println("---------------------------------------------------------");

        while (true)
        {
            System.out.print("\nMarvellous CVFS > ");
            str = sobj.nextLine();
            String[] Command = str.split(" ");
            int iCount = Command.length;

            if (iCount == 1)
            {
                // Marvellous CVFS > exit
                if (Command[0].equals("exit"))
                {
                    System.out.println("Thank you for using Marvellous CVFS");
                    System.out.println("Deallocating all resources...");
                    break;
                }
                // Marvellous CVFS > help
                else if (Command[0].equals("help"))
                {
                    DisplayHelp();
                }
                // Marvellous CVFS > clear
                else if (Command[0].equals("clear"))
                {
                    // ANSI escape code to clear console screen
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                }
                else
                {
                    System.out.println("Command not found...");
                    System.out.println("Please refer Help option or use man command");
                }
            } // End of if iCount == 1
            else if (iCount == 2)
            {
                // Marvellous CVFS > man creat
                if (Command[0].equals("man"))
                {
                    ManPage(Command[1]);
                }
                else
                {
                    System.out.println("Command not found...");
                    System.out.println("Please refer Help option or use man command");
                }
            } // End of if iCount == 2
            else if (iCount == 3)
            {
                // Marvellous CVFS > creat Ganesh.txt 3
                if (Command[0].equals("creat"))
                {
                    try
                    {
                        iRet = CreateFile(Command[1], Integer.parseInt(Command[2]));
                        if (iRet == ERR_INVALID_PARAMETER)
                        {
                            System.out.println("Error : Invalid parameters for the function");
                            System.out.println("Please check Man page for more details");
                        }
                        else if (iRet == ERR_NO_INODES)
                        {
                            System.out.println("Error : Unable to create file as there is no Inodes");
                        }
                        else if (iRet == ERR_FILE_ALREADY_EXIST)
                        {
                            System.out.println("Error : Unable to create file as file is already existing");
                        }
                        else
                        {
                            System.out.println("File is succesfully created with FD : " + iRet);
                        }
                    }
                    catch (NumberFormatException e)
                    {
                        System.out.println("Error: Invalid permission. Please provide a number.");
                    }
                }
                else
                {
                    System.out.println("Command not found...");
                    System.out.println("Please refer Help option or use man command");
                }
            } // End of if iCount == 3
            else if (iCount == 4)
            {
                // Future commands with 4 parts can be handled here.
            } // End of if iCount == 4
            else
            {
                if(!str.trim().isEmpty()) // Avoid printing error for empty input
                {
                    System.out.println("Command not found...");
                    System.out.println("Please refer Help option or use man command");
                }
            } // End of invalid command part
        } // End of while (Custom Shell)

        sobj.close();
    } // End of main
}