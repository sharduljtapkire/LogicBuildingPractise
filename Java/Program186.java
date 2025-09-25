/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program186.java
//  Description :   Demonstrates file creation in Java by taking file name as input.
//                  Uses FileOutputStream to create the file.
//
//  Author      :   Shardul Tapkire
//  Date        :   22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class program186
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.println("Enter the name of file : ");
            String Fname = sobj.nextLine();   // Take filename from user

            
            FileOutputStream fos = new FileOutputStream(Fname);

            System.out.println("File created successfully: " + Fname);

            fos.close();
        }
        catch(IOException e)
        {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
        finally
        {
            sobj.close();
        }
    }
}
