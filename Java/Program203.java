/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program203.java
//
//  Description : Reads a file in chunks and prints each character on a new line.
//                Equivalent to the C program using read() and printing char by char.
//
//  Author      : Shardul Tapkire
//  Date        : 22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

public class Program203
{
    public static final int BUFFER_SIZE = 1024;

    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the file name that you want to open: ");
        String Fname = sobj.nextLine();

        try (FileInputStream fis = new FileInputStream(Fname))
        {
            byte[] Buffer = new byte[BUFFER_SIZE];
            int iRet = 0;

            while ((iRet = fis.read(Buffer)) != -1)
            {
                for (int iCnt = 0; iCnt < iRet; iCnt++)
                {
                    System.out.println((char)Buffer[iCnt]);
                }
            }
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
