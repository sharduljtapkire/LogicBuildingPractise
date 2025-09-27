/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program537.java
//  Description : Custom Shell of Marvellous CVFS with 'exit', 'help', 'clear' commands
//  Author      : Shardul Tapkire
//  Date        : 27/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Program537
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
    //  Entry point function of project (main)
    //
    ///////////////////////////////////////////////////////////////////////////
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] Command = new String[4];
        String str = "";
        int iCount = 0;

        // Simulated boot messages
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
                        // Clear console (works in most terminals)
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
                // Logic for 2-token commands can be added here
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
