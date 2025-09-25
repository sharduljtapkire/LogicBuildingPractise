/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program200.java
//
//  Description : Reads a file in chunks of 1024 bytes and writes its content
//                directly to standard output, similar to C program using read()
//                and write() in a loop.
//
//  Author      : Shardul Tapkire
//  Date        : 22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

public class Program200
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the file name that you want to open: ");
        String Fname = sobj.nextLine();

        try (FileInputStream fis = new FileInputStream(Fname))
        {
            byte[] Buffer = new byte[1024];  // large buffer
            int iRet = 0;

            while ((iRet = fis.read(Buffer)) != -1)
            {
                System.out.write(Buffer, 0, iRet); // write to console
            }

            System.out.flush();  // ensure all bytes are printed
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Unable to open file: " + e.getMessage());
        }
        catch (IOException e)
        {
            System.out.println("Error while reading file: " + e.getMessage());
        }
    }
}
