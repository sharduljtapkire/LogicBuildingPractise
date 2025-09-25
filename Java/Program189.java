/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program189.java
//
//  Description : Demonstrates how to open an existing file in Java
//                for both reading and writing, and then close it.
//                If the file does not exist, an error message is displayed.
//                Note: Java does not return a numeric file descriptor
//                like C. For demonstration, we display the hashCode()
//                of the file stream as a pseudo FD.
//
//  Author      : Shardul Tapkire
//  Date        : 22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.io.File;
import java.io.RandomAccessFile;
import java.io.IOException;
import java.util.Scanner;

class Program189
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.println("Enter the name of file that you want to open : ");
            String Fname = sobj.nextLine();

            File file = new File(Fname);

            if(!file.exists())
            {
                System.out.println("Unable to open file (file does not exist)");
                return;
            }

            // Equivalent of O_RDWR → open for read and write
            RandomAccessFile raf = new RandomAccessFile(file, "rw");

            System.out.println("File is successfully opened : " + file.getName());
            System.out.println("Pseudo File Descriptor (hashCode): " + raf.hashCode());

            // Equivalent of close(fd) in C
            raf.close();
            System.out.println("File is successfully closed.");
        }
        catch(IOException e)
        {
            System.out.println("Unable to open/close file due to exception.");
            e.printStackTrace();
        }
        finally
        {
            sobj.close();
        }
    }
}
