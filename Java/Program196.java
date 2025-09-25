/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program196.java
//
//  Description : Demonstrates reading a file in Java in chunks of 10 bytes
//                using FileInputStream, similar to reading in a loop in C.
//
//  Author      : Shardul Tapkire
//  Date        : 22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

public class Program196
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
            }

            fis.close();
        }
        catch(IOException e)
        {
            System.out.println("Error while reading file: " + e.getMessage());
        }
    }
}
