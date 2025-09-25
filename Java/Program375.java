/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program375.java
//
//  Description : Program to demonstrate reading a file using FileInputStream.
//                Reads file contents in chunks of 10 bytes and converts them
//                into string. Displays the data read until end of file.
//                Finally, prints the last value of iRet.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class Program375
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
                byte Arr[] = new byte[10];

                int iRet = 0;

                System.out.println("Data from file is : ");

                while((iRet = fiobj.read(Arr)) != -1)
                {
                    String str = new String(Arr, 0, iRet);
                    System.out.println(str);
                }

                System.out.println("Value of iRet at the end : " + iRet);

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
