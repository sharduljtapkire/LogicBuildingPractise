/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program538.java
//  Description : Custom Shell of Marvellous CVFS with 'exit', 'help', 'clear' commands
//                and manual page display for commands
//  Author      : Shardul Tapkire
//  Date        : 27/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Program538
{
    ///////////////////////////////////////////////////////////////////////////
    //
    //  Function Name : DisplayHelp
    //  Description   : Displays information about available commands
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
    //  Function Name : ManPage
    //  Description   : Displays the manual page of the command
    //  Input         : Accepts the command name
    //  Output        : Displays the manual details of the command
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
    //  Entry point function of project (main)
    //
    ///////////////////////////////////////////////////////////////////////////
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] Command = new String[4];
        String str = "";
        int iCount = 0;

        // Simulated boot and initialization messages
        System.out.println("Boot process of Operating System done");
        System.out.println("Marvellous CVFS : Auxilary data initialised succesfully");

        System.out.println("---------------------------------------------------------");
        System.out.println("--------- Marvellous CVFS Started Succesfully ------------");
        System.out.println("---------------------------------------------------------");

        while(true)
        {
            System.out.print("\nMarvellous CVFS > ");
            str = sc.nextLine().trim();

            // Split input into at most 4 tokens
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
                // Logic for 3-token commands can be added here
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
