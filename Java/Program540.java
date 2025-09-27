/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program540.java
//  Description : Marvellous CVFS - Custom Virtual File System in Java
//                Supports commands: exit, help, clear, man, creat
//                Implements inode management and file creation simulation
//  Author      : Shardul Tapkire
//  Date        : 27/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
import java.util.Arrays;

public class Program540
{
    ///////////////////////////////////////////////////////////////////////////
    //
    //  User defined constants
    //
    ///////////////////////////////////////////////////////////////////////////
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

    public static final int ERR_INVALID_PARAMETER = -1;
    public static final int ERR_NO_INODES = -2;
    public static final int ERR_FILE_ALREADY_EXIST = -3;

    ///////////////////////////////////////////////////////////////////////////
    //
    //  BootBlock class
    //
    ///////////////////////////////////////////////////////////////////////////
    static class BootBlock
    {
        String Information;
    }

    ///////////////////////////////////////////////////////////////////////////
    //
    //  SuperBlock class
    //
    ///////////////////////////////////////////////////////////////////////////
    static class SuperBlock
    {
        int TotalInodes;
        int FreeInodes;
    }

    ///////////////////////////////////////////////////////////////////////////
    //
    //  Inode class
    //
    ///////////////////////////////////////////////////////////////////////////
    static class Inode
    {
        String FileName;
        int InodeNumber;
        int FileSize;
        int ActualFileSize;
        int FileType;
        int ReferenceCount;
        int LinkCount;
        int Permission;
        String Buffer;
        Inode next;

        public Inode()
        {
            FileName = "";
            Buffer = null;
            next = null;
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    //
    //  FileTable class
    //
    ///////////////////////////////////////////////////////////////////////////
    static class FileTable
    {
        int ReadOffset;
        int WriteOffset;
        int Count;
        int Mode;
        Inode ptrinode;
    }

    ///////////////////////////////////////////////////////////////////////////
    //
    //  UAREA class
    //
    ///////////////////////////////////////////////////////////////////////////
    static class UAREA
    {
        String ProcessName;
        FileTable[] UFDT = new FileTable[MAXINODE];

        public UAREA()
        {
            ProcessName = "";
            Arrays.fill(UFDT, null);
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    //
    //  Global objects
    //
    ///////////////////////////////////////////////////////////////////////////
    static BootBlock bootobj = new BootBlock();
    static SuperBlock superobj = new SuperBlock();
    static Inode head = null;
    static UAREA uareaobj = new UAREA();

    ///////////////////////////////////////////////////////////////////////////
    //
    //  InitialiseUAREA function
    //
    ///////////////////////////////////////////////////////////////////////////
    public static void InitialiseUAREA()
    {
        uareaobj.ProcessName = "Myexe";

        for(int i = 0; i < MAXINODE; i++)
        {
            uareaobj.UFDT[i] = null;
        }

        System.out.println("Marvellous CVFS : UAREA initialised succesfully");
    }

    ///////////////////////////////////////////////////////////////////////////
    //
    //  InitialiseSuperblock function
    //
    ///////////////////////////////////////////////////////////////////////////
    public static void InitialiseSuperblock()
    {
        superobj.TotalInodes = MAXINODE;
        superobj.FreeInodes = MAXINODE;

        System.out.println("Marvellous CVFS : Superblock initialised succesfully");
    }

    ///////////////////////////////////////////////////////////////////////////
    //
    //  CreateDILB function
    //
    ///////////////////////////////////////////////////////////////////////////
    public static void CreateDILB()
    {
        int i = 1;
        Inode temp = head;

        while(i <= MAXINODE)
        {
            Inode newn = new Inode();
            newn.InodeNumber = i;
            newn.FileSize = 0;
            newn.ActualFileSize = 0;
            newn.LinkCount = 0;
            newn.Permission = 0;
            newn.Buffer = null;
            newn.next = null;

            if(temp == null)
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

    ///////////////////////////////////////////////////////////////////////////
    //
    //  StartAuxilaryDataInitialisation function
    //
    ///////////////////////////////////////////////////////////////////////////
    public static void StartAuxilaryDataInitialisation()
    {
        bootobj.Information = "Boot process of Operating System done";

        System.out.println(bootobj.Information);

        InitialiseSuperblock();
        CreateDILB();
        InitialiseUAREA();

        System.out.println("Marvellous CVFS : Auxilary data initialised succesfully");
    }

    ///////////////////////////////////////////////////////////////////////////
    //
    //  DisplayHelp function
    //
    ///////////////////////////////////////////////////////////////////////////
    public static void DisplayHelp()
    {
        System.out.println("---------------------------------------------------------");
        System.out.println("----------- Command Manual of Marvellous CVFS -----------");
        System.out.println("---------------------------------------------------------");

        System.out.println("exit  : It is used to terminate the shell of Marvellous CVFS");
        System.out.println("clear : It is used to clear the console of Marvellous CVFS");

        System.out.println("---------------------------------------------------------");
    }

    ///////////////////////////////////////////////////////////////////////////
    //
    //  ManPage function
    //
    ///////////////////////////////////////////////////////////////////////////
    public static void ManPage(String name)
    {
        if(name.equalsIgnoreCase("creat"))
        {
            System.out.println("Description : This command is used to create new regular file on our file system");
            System.out.println("Usage       : creat File_name Permissions");
            System.out.println("File_name   : The name of file that you want to create");
            System.out.println("Permissions : 1 : Read  2 : Write  3 : Read + Write");
        }
        else if(name.equalsIgnoreCase("exit"))
        {
            System.out.println("Description : This command is used to terminate the Marvellous CVFS");
            System.out.println("Usage       : exit");
        }
        else
        {
            System.out.println("No manual entry for " + name);
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    //
    //  IsFileExists function
    //
    ///////////////////////////////////////////////////////////////////////////
    public static boolean IsFileExists(String name)
    {
        Inode temp = head;

        while(temp != null)
        {
            if(name.equals(temp.FileName) && temp.FileType == REGULARFILE)
            {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    ///////////////////////////////////////////////////////////////////////////
    //
    //  CreateFile function
    //
    ///////////////////////////////////////////////////////////////////////////
    public static int CreateFile(String name, int permission)
    {
        if(name == null || name.isEmpty())
        {
            return ERR_INVALID_PARAMETER;
        }

        if(permission < 1 || permission > 3)
        {
            return ERR_INVALID_PARAMETER;
        }

        if(superobj.FreeInodes == 0)
        {
            return ERR_NO_INODES;
        }

        if(IsFileExists(name))
        {
            return ERR_FILE_ALREADY_EXIST;
        }

        Inode temp = head;
        while(temp != null)
        {
            if(temp.FileType == 0)
            {
                break;
            }
            temp = temp.next;
        }

        if(temp == null)
        {
            System.out.println("Inode not found");
            return -1;
        }

        int i = 0;
        for(i = 0; i < MAXINODE; i++)
        {
            if(uareaobj.UFDT[i] == null)
            {
                break;
            }
        }

        if(i == MAXINODE)
        {
            System.out.println("Unable to create file as MAX OPENED FILE LIMIT REACHED");
            return -1;
        }

        uareaobj.UFDT[i] = new FileTable();
        uareaobj.UFDT[i].ReadOffset = 0;
        uareaobj.UFDT[i].WriteOffset = 0;
        uareaobj.UFDT[i].Count = 1;
        uareaobj.UFDT[i].Mode = permission;
        uareaobj.UFDT[i].ptrinode = temp;

        temp.FileName = name;
        temp.FileSize = MAXFILESIZE;
        temp.ActualFileSize = 0;
        temp.FileType = REGULARFILE;
        temp.ReferenceCount = 1;
        temp.LinkCount = 1;
        temp.Permission = permission;
        temp.Buffer = "";

        return i;
    }

    ///////////////////////////////////////////////////////////////////////////
    //
    //  Main function
    //
    ///////////////////////////////////////////////////////////////////////////
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = "";
        String[] Command = new String[4];
        int iCount = 0;
        int iRet = 0;

        StartAuxilaryDataInitialisation();

        System.out.println("---------------------------------------------------------");
        System.out.println("--------- Marvellous CVFS Started Succesfully ------------");
        System.out.println("---------------------------------------------------------");

        while(true)
        {
            System.out.print("\nMarvellous CVFS > ");
            str = sc.nextLine().trim();

            Command = str.split("\\s+", 4);
            iCount = Command.length;

            if(iCount == 1)
            {
                if(Command[0].equalsIgnoreCase("exit"))
                {
                    System.out.println("Thank you for using Marvellous CVFS");
                    System.out.println("Deallocating all resources...");
                    break;
                }
                else if(Command[0].equalsIgnoreCase("help"))
                {
                    DisplayHelp();
                }
                else if(Command[0].equalsIgnoreCase("clear"))
                {
                    try
                    {
                        new ProcessBuilder("clear").inheritIO().start().waitFor();
                    }
                    catch(Exception e)
                    {
                        System.out.println("Unable to clear console");
                    }
                }
            }
            else if(iCount == 2)
            {
                if(Command[0].equalsIgnoreCase("man"))
                {
                    ManPage(Command[1]);
                }
            }
            else if(iCount == 3)
            {
                if(Command[0].equalsIgnoreCase("creat"))
                {
                    iRet = CreateFile(Command[1], Integer.parseInt(Command[2]));

                    if(iRet == ERR_INVALID_PARAMETER)
                    {
                        System.out.println("Error : Invalid parameters for the function");
                        System.out.println("Please check Man page for more details");
                    }
                    else if(iRet == ERR_NO_INODES)
                    {
                        System.out.println("Error : Unable to create file as there is no Inodes");
                    }
                    else if(iRet == ERR_FILE_ALREADY_EXIST)
                    {
                        System.out.println("Error : Unable to create file as file is already existing");
                    }
                    else
                    {
                        System.out.println("File is succesfully created with FD : " + iRet);
                    }
                }
            }
            else if(iCount == 4)
            {
                // Logic for 4-token commands can be added here
            }
            else
            {
                System.out.println("Command not found...");
                System.out.println("Please refer Help option or use man command");
            }
        }

        sc.close();
    }
}
