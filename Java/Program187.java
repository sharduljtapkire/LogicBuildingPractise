/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program187.java
//
//  Description : Demonstrates file creation in Java with error handling.
//                Prints success or failure message.
//                Note: Java does not directly provide file descriptors.
//                      For demonstration, we show hashCode() of FileOutputStream
//                      as a pseudo file descriptor.
//
//  Author      : Shardul Tapkire
//  Date        : 22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class program187
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.println("Enter the name of file : ");
            String Fname = sobj.nextLine();   // Take filename from user

            File file = new File(Fname);

            // Try to create file
            FileOutputStream fos = new FileOutputStream(file);

            if(file.exists())
            {
                System.out.println("File is successfully created : " + file.getName());
                // C: creat() returns FD. Java doesn’t expose FD, so we simulate with hashCode
                System.out.println("Pseudo File Descriptor (hashCode): " + fos.hashCode());
            }
            else
            {
                System.out.println("Unable to create file");
                return;
            }

            fos.close();
        }
        catch(IOException e)
        {
            System.out.println("Unable to create file due to exception.");
            e.printStackTrace();
        }
        finally
        {
            sobj.close();
        }
    }
}
