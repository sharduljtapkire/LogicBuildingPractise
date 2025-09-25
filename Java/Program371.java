/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program371.java
//
//  Description : Program to read data from a file into a byte array (10 bytes)
//                and display both the data read and the return value of read().
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class Program371
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

                int iRet = fiobj.read(Arr);                
                fiobj.close();

                String Str = new String(Arr);

                System.out.println("Data from file is : " + Str);
                System.out.println("Return value of read is : " + iRet);
            }
            else
            {
                System.out.println("File not present in current directory..");
                return;
            }
        }
        catch(IOException iobj)
        {
            System.out.println("IOException occurred: " + iobj);
        }
        catch(Exception eobj)
        {
            System.out.println("Exception occurred: " + eobj);
        }
    }
}
