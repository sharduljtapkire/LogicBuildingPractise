/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program202.java
//
//  Description : Reads a file in chunks and calculates its total size in bytes.
//                Equivalent to the C program using read() and summing bytes.
//
//  Author      : Shardul Tapkire
//  Date        : 22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

public class Program202
{
    public static final int BUFFER_SIZE = 1024;

    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the file name that you want to open: ");
        String Fname = sobj.nextLine();

        int iSum = 0;

        try (FileInputStream fis = new FileInputStream(Fname))
        {
            byte[] Buffer = new byte[BUFFER_SIZE];
            int iRet = 0;

            while ((iRet = fis.read(Buffer)) != -1)
            {
                iSum = iSum + iRet;
            }

            System.out.println("File size is : " + iSum + " bytes");
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
