/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program535.java
//  Description : Simulated Marvellous CVFS shell with help and exit commands
//  Author      : Shardul Tapkire
//  Date        : 27/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Program535
{
    ///////////////////////////////////////////////////////////////////////////
    //
    //  User defined constants
    //
    ///////////////////////////////////////////////////////////////////////////

    static final int MAXFILESIZE = 100;
    static final int MAXINODE = 5;

    static final int READ = 1;
    static final int WRITE = 2;
    static final int EXECUTE = 4;

    static final int REGULARFILE = 1;
    static final int SPECIALFILE = 2;

    static final int START = 0;
    static final int CURRENT = 1;
    static final int END = 2;

    ///////////////////////////////////////////////////////////////////////////
    //
    //  Structures equivalent
    //
    ///////////////////////////////////////////////////////////////////////////

    static class BootBlock
    {
        String Information;
    }

    static class SuperBlock
    {
        int TotalInodes;
        int FreeInodes;
    }

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
    }

    static class FileTable
    {
        int ReadOffset;
        int WriteOffset;
        int Count;
        int Mode;
        Inode ptrinode;
    }

    static class UAREA
    {
        String ProcessName;
        FileTable[] UFDT = new FileTable[MAXINODE];
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
    //  Function Name : InitialiseUAREA
    //  Description   : Initialises the UAREA structure
    //
    ///////////////////////////////////////////////////////////////////////////

    static void InitialiseUAREA()
    {
        uareaobj.ProcessName = "Myexe";

        for(int i = 0; i < MAXINODE; i++)
        {
            uareaobj.UFDT[i] = null;
        }

        System.out.println("Marvellous CVFS : UAREA initialised successfully");
    }

    ///////////////////////////////////////////////////////////////////////////
    //
    //  Function Name : InitialiseSuperblock
    //  Description   : Initialises the SuperBlock
    //
    ///////////////////////////////////////////////////////////////////////////

    static void InitialiseSuperblock()
    {
        superobj.TotalInodes = MAXINODE;
        superobj.FreeInodes = MAXINODE;

        System.out.println("Marvellous CVFS : Superblock initialised successfully");
    }

    ///////////////////////////////////////////////////////////////////////////
    //
    //  Function Name : CreateDILB
    //  Description   : Creates linked list of Inodes
    //
    ///////////////////////////////////////////////////////////////////////////

    static void CreateDILB()
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

        System.out.println("Marvellous CVFS : DILB created successfully");
    }

    ///////////////////////////////////////////////////////////////////////////
    //
    //  Function Name : StartAuxilaryDataInitialisation
    //  Description   : Initialises boot info, superblock, DILB, UAREA
    //
    ///////////////////////////////////////////////////////////////////////////

    static void StartAuxilaryDataInitialisation()
    {
        bootobj.Information = "Boot process of Operating System done";

        System.out.println(bootobj.Information);

        InitialiseSuperblock();
        CreateDILB();
        InitialiseUAREA();

        System.out.println("Marvellous CVFS : Auxiliary data initialised successfully");
    }

    ///////////////////////////////////////////////////////////////////////////
    //
    //  Function Name : DisplayHelp
    //  Description   : Displays information about available commands
    //
    ///////////////////////////////////////////////////////////////////////////

    static void DisplayHelp()
    {
        System.out.println("---------------------------------------------------------");
        System.out.println("----------- Command Manual of Marvellous CVFS -----------");
        System.out.println("---------------------------------------------------------");
        System.out.println("exit : It is used to terminate the shell of Marvellous CVFS");
        System.out.println("help : It is used to display this help menu");
    }

    ///////////////////////////////////////////////////////////////////////////
    //
    //  Entry point function of project (main)
    //
    ///////////////////////////////////////////////////////////////////////////

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str;
        int iCount;
        String[] Command = new String[5];

        StartAuxilaryDataInitialisation();

        System.out.println("---------------------------------------------------------");
        System.out.println("--------- Marvellous CVFS Started Successfully ----------");
        System.out.println("---------------------------------------------------------");

        while(true)
        {
            System.out.print("\nMarvellous CVFS > ");
            str = sc.nextLine();

            String[] tokens = str.trim().split("\\s+", 4);

            for(int i = 0; i < 4; i++)
            {
                if(i < tokens.length)
                {
                    Command[i] = tokens[i];
                }
                else
                {
                    Command[i] = "";
                }
            }

            iCount = tokens.length;

            if(iCount == 1)
            {
                // Marvellous CVFS > exit
                if(Command[0].equals("exit"))
                {
                    System.out.println("Thank you for using Marvellous CVFS");
                    System.out.println("Deallocating all resources...");
                    break;
                }
                // Marvellous CVFS > help
                else if(Command[0].equals("help"))
                {
                    DisplayHelp();
                }
            }
            else if(iCount == 2)
            {
                // Placeholder for iCount == 2 commands
            }
            else if(iCount == 3)
            {
                // Placeholder for iCount == 3 commands
            }
            else if(iCount == 4)
            {
                // Placeholder for iCount == 4 commands
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
