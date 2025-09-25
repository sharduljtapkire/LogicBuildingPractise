/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program369.java
//
//  Description : Program to write a string into an existing file using FileOutputStream.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class Program369
{
    public static void main(String A[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the name of file that you want to write into : ");
            String Fname = sobj.nextLine();

            File fobj = new File(Fname);

            if(fobj.exists())
            {
                FileOutputStream foobj = new FileOutputStream(fobj);
                String str = "Jay Ganesh...";

                byte Arr[] = str.getBytes();

                foobj.write(Arr);
                foobj.close();

                System.out.println("Data successfully written into the file.");
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
