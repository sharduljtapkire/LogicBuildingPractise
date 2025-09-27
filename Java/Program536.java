/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program536.java
//  Description : Executes the 'ls' command in the system shell
//  Author      : Shardul Tapkire
//  Date        : 27/09/2025
//
/////////////////////////////////////////////////////////////////////////////

public class Program536
{
    ///////////////////////////////////////////////////////////////////////////
    //
    //  Entry point function of project (main)
    //
    ///////////////////////////////////////////////////////////////////////////

    public static void main(String[] args)
    {
        try
        {
            // Execute the 'ls' command
            Process process = Runtime.getRuntime().exec("ls");

            // Wait for the command to complete
            process.waitFor();

            // Read the output of the command
            java.io.InputStream is = process.getInputStream();
            java.util.Scanner sc = new java.util.Scanner(is);
            while(sc.hasNextLine())
            {
                System.out.println(sc.nextLine());
            }
            sc.close();
        }
        catch(Exception e)
        {
            System.out.println("Error executing command: " + e.getMessage());
        }
    }
}
