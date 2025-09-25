/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program366.java
//
//  Description : Program to accept a filename from the user, check if it exists,
//                and if not, create the file and display appropriate messages.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class Program366
{
    public static void main(String A[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the name of file that you want to create : ");
            String Fname = sobj.nextLine();

            File fobj = new File(Fname);

            if(fobj.exists())
            {
                System.out.println("File already exist..");
            }
            else
            {
                fobj.createNewFile();
                System.out.println("File succesfully created...");
            }
        }
        catch(IOException iobj)
        {
        }
        catch(Exception eobj)
        {
        }
    }
}
