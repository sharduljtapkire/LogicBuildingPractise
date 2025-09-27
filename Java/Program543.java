/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program543.java
//  Description : Marvellous CVFS - Custom Virtual File System in Java
//                Supports commands: exit, help, clear, man, creat, unlink, ls, stat
//                Implements file creation, deletion, listing, and stat simulation.
//  Author      : Shardul Tapkire 
//  Date        : 27/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

///////////////////////////////////////////////////////////////////////
//
//  Class Name :     BootBlock 
//  Description :     Holds information to boot the operating system
//
///////////////////////////////////////////////////////////////////////
class BootBlock
{
    public String Information;

    public BootBlock()
    {
        this.Information = "";
    }
}

///////////////////////////////////////////////////////////////////////
//
//  Class Name :     SuperBlock 
//  Description :     Holds information about the file system
//
///////////////////////////////////////////////////////////////////////
class SuperBlock
{
    public int TotalInodes;
    public int FreeInodes;

    public SuperBlock()
    {
        this.TotalInodes = 0;
        this.FreeInodes = 0;
    }
}

///////////////////////////////////////////////////////////////////////
//
//  Class Name :     Inode 
//  Description :     Holds information about the file
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
        this.FileName = "";
        this.InodeNumber = 0;
        this.FileSize = 0;
        this.ActualFileSize = 0;
        this.FileType = 0;
        this.ReferenceCount = 0;
        this.LinkCount = 0;
        this.Permission = 0;
        this.Buffer = null;
        this.next = null;
    }
}

///////////////////////////////////////////////////////////////////////
//
//  Class Name :     FileTable 
//  Description :     Holds information about the opened file
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
        this.ReadOffset = 0;
        this.WriteOffset = 0;
        this.Count = 0;
        this.Mode = 0;
        this.ptrinode = null;
    }
}

///////////////////////////////////////////////////////////////////////
//
//  Class Name :     UAREA 
//  Description :     Holds information about the process
// 
///////////////////////////////////////////////////////////////////////
class UAREA
{
    public String ProcessName;
    public FileTable[] UFDT;

    public UAREA(int maxFiles)
    {
        this.ProcessName = "";
        this.UFDT = new FileTable[maxFiles];
    }
}

public class Program543
{
    ///////////////////////////////////////////////////////////////////////
    //
    //  User defined Macros (as static final variables)
    //
    ///////////////////////////////////////////////////////////////////////
    public static final int MAXFILESIZE = 100;
    public static final int MAXOPENEDFILES = 20;
    public static final int MAXINODE = 5;
    public static final int READ = 1;
    public static final int WRITE = 2;
    public static final int EXECUTE = 4;
    public static final int REGULARFILE = 1;
    public static final int SPECIALFILE = 2;
    public static final int START = 0;
    public static final int CURRENT = 1;
    public static final int END = 2;
    public static final int EXECUTE_SUCCESS = 0;

    ///////////////////////////////////////////////////////////////////////
    //
    //  User defined Macros for error handling
    //
    ///////////////////////////////////////////////////////////////////////
    public static final int ERR_INVALID_PARAMETER = -1;
    public static final int ERR_NO_INODES = -2;
    public static final int ERR_FILE_ALREADY_EXIST = -3;
    public static final int ERR_FILE_NOT_EXIST = -4;

    ///////////////////////////////////////////////////////////////////////
    //
    //  Global variables or objects used in the project
    //
    ///////////////////////////////////////////////////////////////////////
    static BootBlock bootobj = new BootBlock();
    static SuperBlock superobj = new SuperBlock();
    static Inode head = null;
    static UAREA uareaobj = new UAREA(MAXOPENEDFILES);

    ///////////////////////////////////////////////////////////////////////
    //
    //  Function Name :     InitialiseUAREA
    //  Description :       It is used to intialise the contents UAREA
    //  Author :            Shardul Tapkire
    //  Date :              27/09/2025
    //
    ///////////////////////////////////////////////////////////////////////
    public static void InitialiseUAREA()
    {
        uareaobj.ProcessName = "Myexe";
        int i = 0;
        while (i < MAXOPENEDFILES)
        {
            uareaobj.UFDT[i] = null;
            i++;
        }
        System.out.println("Marvellous CVFS : UAREA initialised succesfully");
    }

    ///////////////////////////////////////////////////////////////////////
    //
    //  Function Name :     InitialiseSuperblock
    //  Description :       It is used to intialise the contents of super block
    //  Author :            Shardul Tapkire
    //  Date :              27/09/2025
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
    //  Function Name :     CreateDILB
    //  Description :       It is used to create Linked List of Inodes
    //  Author :            Shardul Tapkire
    //  Date :              27/09/2025
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
            // Other members are initialized to 0/null by the constructor

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
    //  Function Name :     StartAuxilaryDataInitialisation
    //  Description :       It is used to intialise the Auxilary data
    //  Author :            Shardul Tapkire
    //  Date :              27/09/2025
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
    //  Function Name :     DisplayHelp
    //  Description :       It is used to Display the information about commands
    //  Author :            Shardul Tapkire
    //  Date :              27/09/2025
    //
    ///////////////////////////////////////////////////////////////////////
    public static void DisplayHelp()
    {
        System.out.println("---------------------------------------------------------");
        System.out.println("----------- Command Manual of Marvellous CVFS -----------");
        System.out.println("---------------------------------------------------------");
        System.out.println("man <CommandName> : It is used to display the specific manual page of command");
        System.out.println("exit : It is used to terminate the shell of Marvellous CVFS");
        System.out.println("clear : It is used to clear the console of Marvellous CVFS");
        System.out.println("creat <FileName> <Permission> : It is used to create new regular file");
        System.out.println("unlink <FileName> : It is used to delete existing file");
        System.out.println("stat <FileName> : It is used to display statistical information about file");
        System.out.println("ls : It is used to list all files of the directory");
        System.out.println("---------------------------------------------------------");
    }

    ///////////////////////////////////////////////////////////////////////
    //
    //  Function Name :     ManPage
    //  Description :       It is used to Display the manual page of the command
    //  Input :             It accepts the command name
    //  Output :            Displays the manual details of the command
    //  Author :            Shardul Tapkire
    //  Date :              27/09/2025
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
        else if (name.equals("unlink"))
        {
            System.out.println("Description : This command is used to delete regular file from our file system");
            System.out.println("Usage : unlink File_name");
            System.out.println("File_name : The name of file that you want to delete");
        }
        else if (name.equals("stat"))
        {
            System.out.println("Description : This command is used to display statistical information about the file");
            System.out.println("Usage : stat File_name");
            System.out.println("File_name : The name of file whose information you want to display");
        }
        else if (name.equals("ls"))
        {
            System.out.println("Description : This command is used to list all file names form directory");
            System.out.println("Usage : ls");
        }
        else
        {
            System.out.println("No manual entry for " + name);
        }
    }

    ///////////////////////////////////////////////////////////////////////
    //
    //  Function Name :     IsFileExists
    //  Description :       It is used to check whether the given file name is exist or not
    //  Input :             It accepts the file name
    //  Output :            It returns boolean value (True : if present False : if not present)
    //  Author :            Shardul Tapkire
    //  Date :              27/09/2025
    //
    ///////////////////////////////////////////////////////////////////////
    public static boolean IsFileExists(String name) // Name of file that we want to check
    {
        Inode temp = head;
        while (temp != null)
        {
            if (temp.FileType == REGULARFILE && temp.FileName.equals(name))
            {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    ///////////////////////////////////////////////////////////////////////
    //
    //  Function Name :     GetInode
    //  Description :       Helper function to get the Inode reference by file name
    //  Input :             It accepts the file name
    //  Output :            It returns the Inode reference or null
    //
    ///////////////////////////////////////////////////////////////////////
    public static Inode GetInode(String name)
    {
        Inode temp = head;
        while (temp != null)
        {
            if (temp.FileType != 0 && temp.FileName.equals(name))
            {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    ///////////////////////////////////////////////////////////////////////
    //
    //  Function Name :     CreateFile
    //  Description :       It is used to create a new regular file
    //  Input :             It accepts the file name and permission
    //  Output :            It returns the file descriptor
    //  Author :            Shardul Tapkire
    //  Date :              27/09/2025
    //
    ///////////////////////////////////////////////////////////////////////
    public static int CreateFile(String name, int permission) // Name of file, Permission to create file
    {
        Inode temp = head;
        int i = 0;

        System.out.println("Current Inodes remaining : " + superobj.FreeInodes);

        // Filters
        // If file name is missing
        if (name == null || name.isEmpty())
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

        // Search first empty slot from UFDT (Note: C++ uses MAXINODE here, which is a bug if it's smaller than MAXOPENEDFILES)
        for (i = 0; i < MAXOPENEDFILES; i++)
        {
            if (uareaobj.UFDT[i] == null)
            {
                break;
            }
        }

        // If the C++ logic of checking only up to MAXINODE for UFDT is strictly required,
        // change the loop above and the check below to use MAXINODE instead of MAXOPENEDFILES.
        // For correctness, we keep MAXOPENEDFILES here.
        if (i == MAXOPENEDFILES) 
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
    //  Function Name :     UnlinkFile
    //  Description :       It is used to delete a regular file
    //  Input :             It accepts the file name
    //  Output :            It returns an integer status
    //  Author :            Shardul Tapkire
    //  Date :              27/09/2025
    //
    ///////////////////////////////////////////////////////////////////////
    public static int UnlinkFile(String name) // Name of file
    {
        Inode inodeToDelete = null;

        if (name == null || name.isEmpty())
        {
            return ERR_INVALID_PARAMETER;
        }
        
        if (!IsFileExists(name))
        {
            return ERR_FILE_NOT_EXIST;
        }

        // 1. Check if the file is currently open (exists in UFDT)
        // Note: C++ uses MAXINODE here, which is a bug/limitation. We use MAXOPENEDFILES for correctness.
        for (int i = 0; i < MAXOPENEDFILES; i++) 
        {
            if (uareaobj.UFDT[i] != null && uareaobj.UFDT[i].ptrinode.FileName.equals(name))
            {
                inodeToDelete = uareaobj.UFDT[i].ptrinode;

                // Deallocate file table slot (by setting to null for GC)
                uareaobj.UFDT[i] = null;
                
                // Decrement reference count on Inode
                inodeToDelete.ReferenceCount--;
                
                // For the C++ equivalent, we only delete from UFDT if open,
                // and then proceed to clean up the inode based on its link count.
                // Since ReferenceCount is 0 immediately after freeing the slot, we break here.
                break;
            }
        }
        
        // 2. Find the Inode to delete from the DILB (if not found in the loop above, find it now)
        if (inodeToDelete == null)
        {
            inodeToDelete = GetInode(name);
        }
        
        // 3. Clean up the Inode and free the space (assuming link count is 1 for a simple file system)
        if (inodeToDelete != null)
        {
            // Decrement link count (equivalent to unlinking from directory)
            inodeToDelete.LinkCount--;
            
            // If LinkCount and ReferenceCount are zero, truly delete the file
            // For this simple model, we delete the file once unlink is called and it's not open.
            // Since the C++ code *always* deletes the file after finding it in UFDT (even if LinkCount > 1), we follow its logic.
            // If the file was not open, the following block executes immediately:
            if (inodeToDelete.LinkCount == 0 && inodeToDelete.ReferenceCount == 0) // C++ essentially ignores ReferenceCount
            {
                inodeToDelete.Buffer = null; // Deallocate the memory of buffer
                inodeToDelete.FileName = "";
                inodeToDelete.FileSize = 0;
                inodeToDelete.ActualFileSize = 0;
                inodeToDelete.Permission = 0;
                inodeToDelete.FileType = 0;
                
                // Increment the value of free inodes count
                superobj.FreeInodes++;
            }
            
            return EXECUTE_SUCCESS;
        }

        return ERR_FILE_NOT_EXIST; 
    }

    ///////////////////////////////////////////////////////////////////////
    //
    //  Function Name :     ls_file
    //  Description :       It is used to diplsy the information about all files in the directory
    //  Input :             Nothing
    //  Output :            Nothing
    //  Author :            Shardul Tapkire
    //  Date :              27/09/2025
    //
    ///////////////////////////////////////////////////////////////////////
    public static void ls_file()
    {
        Inode temp = head;

        while (temp != null)
        {
            if (temp.FileType != 0)
            {
                System.out.println(temp.FileName);
            }
            temp = temp.next;
        }
    }

    ///////////////////////////////////////////////////////////////////////
    //
    //  Function Name :     stat_file
    //  Description :       It is used to diplsy the information about the given files
    //  Input :             file name
    //  Output :            Nothing
    //  Author :            Shardul Tapkire
    //  Date :              27/09/2025
    //
    ///////////////////////////////////////////////////////////////////////
    public static int stat_file(String name) // Name of file
    {
        if (name == null || name.isEmpty())
        {
            return ERR_INVALID_PARAMETER;
        }

        Inode temp = GetInode(name);
        
        if (temp == null)
        {
            return ERR_FILE_NOT_EXIST;
        }

        System.out.println("------------ Statistical Information of file -----------");
        
        System.out.println("File name : " + temp.FileName);
        System.out.println("File size on Disk : " + temp.FileSize);
        System.out.println("Actual File size : " + temp.ActualFileSize);
        System.out.println("Link count : " + temp.LinkCount);
        
        System.out.print("File permission : ");
        if (temp.Permission == READ)
        {
            System.out.println("Read");
        }
        else if (temp.Permission == WRITE)
        {
            System.out.println("Write");
        }
        else if (temp.Permission == READ + WRITE)
        {
            System.out.println("Read + Write");
        }
        
        System.out.print("File type : ");
        if (temp.FileType == REGULARFILE)
        {
            System.out.println("Regular file");
        }
        else if (temp.FileType == SPECIALFILE)
        {
            System.out.println("Special file");
        }

        System.out.println("--------------------------------------------------------");

        return EXECUTE_SUCCESS;
    }


    ///////////////////////////////////////////////////////////////////////
    //
    //  Entry point function of project (main)
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
            // Trim leading/trailing whitespace and split by one or more spaces
            String[] Command = str.trim().split("\\s+");
            int iCount = Command[0].isEmpty() ? 0 : Command.length;

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
                // Marvellous CVFS > ls
                else if (Command[0].equals("ls"))
                {
                    ls_file();
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
                // Marvellous CVFS > unlink Demo.txt
                else if (Command[0].equals("unlink"))
                {
                    iRet = UnlinkFile(Command[1]);
                    if (iRet == EXECUTE_SUCCESS)
                    {
                        System.out.println("Unlink Operation is succesfully performed");
                    }
                    else if (iRet == ERR_FILE_NOT_EXIST)
                    {
                        System.out.println("Error : Unable to do unlink activity as file is not present");
                    }
                    else if (iRet == ERR_INVALID_PARAMETER)
                    {
                        System.out.println("Error : Invalid parameters for the function");
                        System.out.println("Please check Man page for more details");
                    }
                }
                // Marvellous CVFS > stat Demo.txt
                else if (Command[0].equals("stat"))
                {
                    iRet = stat_file(Command[1]);

                    if (iRet == ERR_FILE_NOT_EXIST)
                    {
                        System.out.println("Error : Unable to display statistics as file is not present");
                    }
                    else if (iRet == ERR_INVALID_PARAMETER)
                    {
                        System.out.println("Error : Invalid parameters for the function");
                        System.out.println("Please check Man page for more details");
                    }
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
                        if (iRet >= 0)
                        {
                            System.out.println("File is succesfully created with FD : " + iRet);
                        }
                        else if (iRet == ERR_INVALID_PARAMETER)
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
            else if (iCount >= 4)
            {
                System.out.println("Command not found or too many arguments...");
                System.out.println("Please refer Help option or use man command");
            }
            // case for iCount == 0 (empty input) is implicitly ignored.
        } // End of while (Custom Shell)

        sobj.close();
    } // End of main
}