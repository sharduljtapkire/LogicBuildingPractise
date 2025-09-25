/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program197.java
//
//  Description : Demonstrates reading a file in Java in chunks of 10 bytes,
//                printing the contents, and clearing the buffer after each read.
//                Equivalent to C program using read() and memset().
//
//  Author      : Shardul Tapkire
//  Date        : 22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

public class Program197
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.println("Enter the file name that you want to open : ");
            String fileName = sc.nextLine();

            File file = new File(fileName);

            if(!file.exists())
            {
                System.out.println("Unable to open file. File does not exist.");
                return;
            }

            FileInputStream fis = new FileInputStream(file);
            System.out.println("File is successfully opened, pseudo FD: " + fis.hashCode());

            byte[] buffer = new byte[10];
            int bytesRead = 0;

            while((bytesRead = fis.read(buffer)) != -1)
            {
                System.out.print(new String(buffer, 0, bytesRead));
                // Clear buffer
                for(int i = 0; i < buffer.length; i++)
                {
                    buffer[i] = 0;
                }
            }

            fis.close();
        }
        catch(IOException e)
        {
            System.out.println("Error while reading file: " + e.getMessage());
        }
    }
}
