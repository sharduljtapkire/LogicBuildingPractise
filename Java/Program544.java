/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program544.java
//  Description : Marvellous CVFS - Custom Virtual File System in Java
//                Supports commands: exit, help, clear, man, creat, unlink, ls, stat, write
//                Implements file system simulation with statistical display.
//  Author      : Shardul Tapkire 
//  Date        : 27/09/2025 
//
/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
import java.util.Arrays; // Needed for byte array manipulation

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
    public byte[] Buffer; // Stores file data
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

public class Program544
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
    public static final int ERR_PERMISSION_DENIED = -5;
    public static final int ERR_INSUFFICIENT_SPACE = -6;

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
    //
    ///////////////////////////////////////////////////////////////////////
    public static void InitialiseUAREA()
    {
        uareaobj.ProcessName = "Myexe";
        for (int i = 0; i < MAXOPENEDFILES; i++)
        {
            uareaobj.UFDT[i] = null;
        }
        System.out.println("Marvellous CVFS : UAREA initialised succesfully");
    }

    ///////////////////////////////////////////////////////////////////////
    //
    //  Function Name :     InitialiseSuperblock
    //  Description :       It is used to intialise the contents of super block
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
    //
    ///////////////////////////////////////////////////////////////////////
    public static void DisplayHelp()
    {
        System.out.println("---------------------------------------------------------");
        System.out.println("----------- Command Manual of Marvellous CVFS -----------");
        System.out.println("---------------------------------------------------------");
        System.out.println("man    : It is used to display the specific manual page of command");
        System.out.println("exit   : It is used to terminate the shell of Marvellous CVFS");
        System.out.println("clear  : It is used to clear the console of Marvellous CVFS");
        System.out.println("creat  : It is used to create new regular file");
        System.out.println("unlink : It is used to delete existing file");
        System.out.println("stat   : It is used to display statistical information about file");
        System.out.println("ls     : It is used to list out all files from the directory");
        System.out.println("write  : It is used to write the data into the file");
        System.out.println("---------------------------------------------------------");
    }

    ///////////////////////////////////////////////////////////////////////
    //
    //  Function Name :     ManPage
    //  Description :       It is used to Display the manual page of the command
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
        else if (name.equals("write"))
        {
            System.out.println("Description : This command is used to write the data into the file");
            System.out.println("Usage : write File_Descriptor");
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
    //  Function Name :     CreateFile
    //  Description :       It is used to create a new regular file
    //
    ///////////////////////////////////////////////////////////////////////
    public static int CreateFile(String name, int permission) // Name of file, Permission to create file
    {
        Inode temp = head;
        int i = 0;

        System.out.println("Current Inodes remaining : " + superobj.FreeInodes);

        // Filters
        if (name == null || name.isEmpty() || permission < 1 || permission > 3)
        {
            return ERR_INVALID_PARAMETER;
        }
        if (superobj.FreeInodes == 0)
        {
            return ERR_NO_INODES;
        }
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

        if (temp == null)
        {
            System.out.println("Inode not found");
            return ERR_NO_INODES; 
        }

        // Search first empty slot from UFDT
        // Correctly uses MAXOPENEDFILES as limit
        for (i = 0; i < MAXOPENEDFILES; i++)
        {
            if (uareaobj.UFDT[i] == null)
            {
                break;
            }
        }

        if (i == MAXOPENEDFILES)
        {
            System.out.println("Unable to create file as MAX OPENED FILE LIMIT REACHED");
            return ERR_INVALID_PARAMETER; // Using generic error for FD limit
        }

        // Allocate and initialise file table
        uareaobj.UFDT[i] = new FileTable();
        uareaobj.UFDT[i].ReadOffset = 0;
        uareaobj.UFDT[i].WriteOffset = 0;
        uareaobj.UFDT[i].Count = 1;
        uareaobj.UFDT[i].Mode = permission;
        uareaobj.UFDT[i].ptrinode = temp;

        // Update Inode information
        temp.FileName = name;
        temp.FileSize = MAXFILESIZE;
        temp.ActualFileSize = 0;
        temp.FileType = REGULARFILE;
        temp.ReferenceCount = 1;
        temp.LinkCount = 1;
        temp.Permission = permission;
        temp.Buffer = new byte[MAXFILESIZE];

        superobj.FreeInodes--;

        return i; // Return file descriptor
    }

    ///////////////////////////////////////////////////////////////////////
    //
    //  Function Name :     UnlinkFile
    //  Description :       It is used to delete a regular file
    //
    ///////////////////////////////////////////////////////////////////////
    public static int UnlinkFile(String name) // Name of file
    {
        if (name == null)
        {
            return ERR_INVALID_PARAMETER;
        }

        if (!IsFileExists(name))
        {
            return ERR_FILE_NOT_EXIST;
        }
        
        // First, check the UFDT to see if it's currently open.
        Inode inodeToDelete = null;

        for (int i = 0; i < MAXOPENEDFILES; i++)
        {
            if (uareaobj.UFDT[i] != null && uareaobj.UFDT[i].ptrinode.FileName.equals(name))
            {
                inodeToDelete = uareaobj.UFDT[i].ptrinode;
                uareaobj.UFDT[i] = null; // Deallocate file table entry
                break;
            }
        }
        
        // If not found in UFDT, find it in DILB. This handles files that were closed.
        if (inodeToDelete == null)
        {
            Inode temp = head;
            while(temp != null)
            {
                if(temp.FileName.equals(name) && temp.FileType != 0)
                {
                    inodeToDelete = temp;
                    break;
                }
                temp = temp.next;
            }
        }

        if (inodeToDelete == null)
        {
            return ERR_FILE_NOT_EXIST; // Should be impossible due to IsFileExists check
        }

        // Reset all values of Inode
        inodeToDelete.FileName = "";
        inodeToDelete.FileSize = 0;
        inodeToDelete.ActualFileSize = 0;
        inodeToDelete.LinkCount = 0;
        inodeToDelete.Permission = 0;
        inodeToDelete.FileType = 0;
        inodeToDelete.ReferenceCount = 0;
        inodeToDelete.Buffer = null; // Mark buffer for GC

        superobj.FreeInodes++;
        return EXECUTE_SUCCESS;
    }

    ///////////////////////////////////////////////////////////////////////
    //
    //  Function Name :     ls_file
    //  Description :       It is used to diplsy the information about all files in the directory
    //
    ///////////////////////////////////////////////////////////////////////
    public static void ls_file()
    {
        Inode temp = head;
        boolean filesFound = false;
        while (temp != null)
        {
            if (temp.FileType != 0)
            {
                System.out.println(temp.FileName);
                filesFound = true;
            }
            temp = temp.next;
        }
        if (!filesFound)
        {
            System.out.println("No files found.");
        }
    }

    ///////////////////////////////////////////////////////////////////////
    //
    //  Function Name :     stat_file
    //  Description :       It is used to diplsy the information about the given files
    //
    ///////////////////////////////////////////////////////////////////////
    public static int stat_file(String name) // Name of file
    {
        if (name == null)
        {
            return ERR_INVALID_PARAMETER;
        }
        if (!IsFileExists(name))
        {
            return ERR_FILE_NOT_EXIST;
        }

        Inode temp = head;
        while (temp != null)
        {
            if (temp.FileName.equals(name) && temp.FileType != 0)
            {
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
                break; // File found, no need to continue loop
            }
            temp = temp.next;
        }

        return EXECUTE_SUCCESS;
    }

    ///////////////////////////////////////////////////////////////////////
    //
    //  Function Name :     write_file
    //  Description :       It is used to write the contents into the file
    //
    ///////////////////////////////////////////////////////////////////////
    public static int write_file(int fd, String data, int size)
    {
        // Invalid value of fd
        if (fd < 0 || fd >= MAXOPENEDFILES)
        {
            return ERR_INVALID_PARAMETER;
        }

        // File is not opened or created with the given fd
        if (uareaobj.UFDT[fd] == null)
        {
            return ERR_FILE_NOT_EXIST;
        }

        FileTable ftab = uareaobj.UFDT[fd];
        Inode tempInode = ftab.ptrinode;
        byte[] dataBytes = data.getBytes();
        int actualSizeToWrite = Math.min(size, dataBytes.length);

        // If there is no permission to wite the data into the file
        if ((tempInode.Permission & WRITE) != WRITE) // Check if WRITE bit is set
        {
            return ERR_PERMISSION_DENIED;
        }
        
        // Unable to write as there is no sufficient space
        if ((tempInode.FileSize - ftab.WriteOffset) < actualSizeToWrite)
        {
            return ERR_INSUFFICIENT_SPACE;
        }
        
        // Write the actual data
        System.arraycopy(dataBytes, 0, tempInode.Buffer, ftab.WriteOffset, actualSizeToWrite);

        // Update the write offset
        ftab.WriteOffset += actualSizeToWrite;

        // Update the actual size of file after writting the new data
        if (ftab.WriteOffset > tempInode.ActualFileSize)
        {
            tempInode.ActualFileSize = ftab.WriteOffset;
        }

        return actualSizeToWrite;
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
            
            // Handle empty input
            if (str.trim().isEmpty()) {
                continue;
            }

            // Split the command by whitespace
            String[] Command = str.trim().split("\\s+");
            int iCount = Command.length;

            if (iCount == 1)
            {
                if (Command[0].equals("exit"))
                {
                    System.out.println("Thank you for using Marvellous CVFS");
                    System.out.println("Deallocating all resources...");
                    break;
                }
                else if (Command[0].equals("help"))
                {
                    DisplayHelp();
                }
                else if (Command[0].equals("clear"))
                {
                    // ANSI escape codes for clearing the screen
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                }
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
                if (Command[0].equals("man"))
                {
                    ManPage(Command[1]);
                }
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
                    }
                }
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
                    }
                }
                else if (Command[0].equals("write"))
                {
                    try
                    {
                        int fd = Integer.parseInt(Command[1]);
                        System.out.println("Please enter the data that you want to write into the file : ");
                        // Use nextLine to read the entire line of data
                        String InputBuffer = sobj.nextLine();
                        int size = InputBuffer.getBytes().length;
                        
                        iRet = write_file(fd, InputBuffer, size);

                        if(iRet == ERR_INSUFFICIENT_SPACE)
                        {
                            System.out.println("Error : Insufficient space in the data block for the file");
                        }
                        else if(iRet == ERR_PERMISSION_DENIED)
                        {
                            System.out.println("Error : Unable to write as there is no write permission");
                        }
                        else if(iRet == ERR_INVALID_PARAMETER)
                        {
                            System.out.println("Error : Invalid parameters for the function");
                        }
                        else if(iRet == ERR_FILE_NOT_EXIST)
                        {
                            System.out.println("Error : FD is invalid or file is not open");
                        }
                        else if (iRet > 0)
                        {
                            System.out.printf("%d bytes gets succesfully written into the file\n",iRet);
                            // Optionally print data (for debug/demo)
                            // System.out.println("Data from file is : " + new String(uareaobj.UFDT[fd].ptrinode.Buffer, 0, uareaobj.UFDT[fd].ptrinode.ActualFileSize));
                        }
                    }
                    catch (NumberFormatException e)
                    {
                        System.out.println("Error: Invalid file descriptor. Please provide a number.");
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
                        }
                        else if (iRet == ERR_NO_INODES)
                        {
                            System.out.println("Error : Unable to create file as there are no free Inodes");
                        }
                        else if (iRet == ERR_FILE_ALREADY_EXIST)
                        {
                            System.out.println("Error : Unable to create file as it is already existing");
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
        } // End of while (Custom Shell)

        sobj.close();
    } // End of main
}