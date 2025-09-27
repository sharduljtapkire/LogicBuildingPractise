/////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program531.java
//
//  Description : Simulated CVFS boot, inode, UAREA initialization
//                and custom shell input (without execution of commands)
//
//  Author      : Shardul Tapkire
//  Date        : 27/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

/////////////////////////////////////////////////////////////////////////////
//
//  User defined constants
//
/////////////////////////////////////////////////////////////////////////////

class Constants
{
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
}

/////////////////////////////////////////////////////////////////////////////
//
//  Class Name : BootBlock
//  Description : Holds information to boot the operating system
//
/////////////////////////////////////////////////////////////////////////////

class BootBlock
{
    public String Information;

    public BootBlock()
    {
        Information = "";
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Class Name : SuperBlock
//  Description : Holds information about the file system
//
/////////////////////////////////////////////////////////////////////////////

class SuperBlock
{
    public int TotalInodes;
    public int FreeInodes;
}

/////////////////////////////////////////////////////////////////////////////
//
//  Class Name : Inode
//  Description : Holds information about the file
//
/////////////////////////////////////////////////////////////////////////////

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
    public char[] Buffer;
    public Inode next;

    public Inode()
    {
        FileName = "";
        FileSize = 0;
        ActualFileSize = 0;
        LinkCount = 0;
        Permission = 0;
        Buffer = null;
        next = null;
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Class Name : FileTable
//  Description : Holds information about the opened file
//
/////////////////////////////////////////////////////////////////////////////

class FileTable
{
    public int ReadOffset;
    public int WriteOffset;
    public int Count;
    public int Mode;
    public Inode ptrinode;

    public FileTable()
    {
        ptrinode = null;
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Class Name : UAREA
//  Description : Holds information about the process
//
/////////////////////////////////////////////////////////////////////////////

class UAREA
{
    public String ProcessName;
    public FileTable[] UFDT;

    public UAREA()
    {
        ProcessName = "";
        UFDT = new FileTable[Constants.MAXINODE];
        for(int i = 0; i < Constants.MAXINODE; i++)
        {
            UFDT[i] = null;
        }
    }
}

/////////////////////////////////////////////////////////////////////////////
//
//  Main Class and Entry Point
//
/////////////////////////////////////////////////////////////////////////////

public class Program531
{
    // Global objects
    static BootBlock bootobj = new BootBlock();
    static SuperBlock superobj = new SuperBlock();
    static Inode head = null;
    static UAREA uareaobj = new UAREA();

    ///////////////////////////////////////////////////////////////////////////
    //
    //  Function Name : InitialiseUAREA
    //  Description   : It is used to initialise the contents UAREA
    //  Author        : Shardul Tapkire
    //  Date          : 27/09/2025
    //
    ///////////////////////////////////////////////////////////////////////////

    public static void InitialiseUAREA()
    {
        uareaobj.ProcessName = "Myexe";

        for(int i = 0; i < Constants.MAXINODE; i++)
        {
            uareaobj.UFDT[i] = null;
        }

        System.out.println("Marvellous CVFS : UAREA initialised successfully");
    }

    ///////////////////////////////////////////////////////////////////////////
    //
    //  Function Name : InitialiseSuperblock
    //  Description   : It is used to initialise the contents of super block
    //  Author        : Shardul Tapkire
    //  Date          : 27/09/2025
    //
    ///////////////////////////////////////////////////////////////////////////

    public static void InitialiseSuperblock()
    {
        superobj.TotalInodes = Constants.MAXINODE;
        superobj.FreeInodes = Constants.MAXINODE;

        System.out.println("Marvellous CVFS : Superblock initialised successfully");
    }

    ///////////////////////////////////////////////////////////////////////////
    //
    //  Function Name : CreateDILB
    //  Description   : It is used to create Linked List of Inodes
    //  Author        : Shardul Tapkire
    //  Date          : 27/09/2025
    //
    ///////////////////////////////////////////////////////////////////////////

    public static void CreateDILB()
    {
        int i = 1;
        Inode temp = head;

        while(i <= Constants.MAXINODE)
        {
            Inode newn = new Inode();
            newn.InodeNumber = i;

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
    //  Function Name : StartAuxiliaryDataInitialisation
    //  Description   : It is used to initialise the Auxiliary data
    //  Author        : Shardul Tapkire
    //  Date          : 27/09/2025
    //
    ///////////////////////////////////////////////////////////////////////////

    public static void StartAuxiliaryDataInitialisation()
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
    //  Entry point function of project (main)
    //
    ///////////////////////////////////////////////////////////////////////////

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str;
        String[] Command = new String[4];

        StartAuxiliaryDataInitialisation();

        System.out.println("---------------------------------------------------------");
        System.out.println("--------- Marvellous CVFS Started Successfully ----------");
        System.out.println("---------------------------------------------------------");

        // Infinite loop to simulate custom shell
        while(true)
        {
            System.out.print("\nMarvellous CVFS > ");
            str = sc.nextLine();

            // Split input into up to 4 commands like sscanf in C++
            String[] tokens = str.split("\\s+", 4);

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

            // Here you can implement command execution logic
        }
    }
}
