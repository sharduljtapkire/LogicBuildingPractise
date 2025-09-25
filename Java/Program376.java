/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program376.java
//
//  Description : Program to demonstrate reading a file using FileInputStream.
//                Reads the file contents in chunks of 1024 bytes, converts
//                them into a string, and displays the data on the console.
//                This approach ensures that large files can also be handled
//                efficiently.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class Program376
{
    public static void main(String A[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the name of file that you want to open : ");
            String Fname = sobj.nextLine();

            File fobj = new File(Fname);

            if(fobj.exists())
            {
                FileInputStream fiobj = new FileInputStream(fobj);
                byte Arr[] = new byte[1024];

                int iRet = 0;

                System.out.println("Data from file is : ");

                while((iRet = fiobj.read(Arr)) != -1)
                {
                    String str = new String(Arr, 0, iRet);
                    System.out.print(str);
                }

                fiobj.close();
            }
            else
            {
                System.out.println("File not present in current directory..");
                return;
            }
        }
        catch(IOException iobj)
        {
            System.out.println("IOException occurred : " + iobj);
        }
        catch(Exception eobj)
        {
            System.out.println("Exception occurred : " + eobj);
        }
    }
}
