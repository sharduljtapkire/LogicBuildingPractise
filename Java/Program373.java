/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program373.java
//
//  Description : Program to demonstrate reading a file using FileInputStream.
//                Reads data in chunks of 10 bytes, prints number of bytes read
//                during each iteration, and shows the final value of iRet.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class Program373
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
                    System.out.println(iRet);
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
