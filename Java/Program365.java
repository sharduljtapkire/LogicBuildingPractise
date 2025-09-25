/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program365.java
//
//  Description : Program to check if a file "PPA.txt" exists, and if not,
//                create the file and display appropriate messages.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class Program365
{
    public static void main(String A[])
    {
        try
        {
            File fobj = new File("PPA.txt");

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
