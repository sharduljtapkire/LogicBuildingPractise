/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program400.java
//
//  Description : Marvellous Packer - Driver class.
//                This program demonstrates the use of the MarvellousPacker
//                class from the MarvellousPackerUnpacker package to pack
//                all files from a specified directory into a single packed file.
//                It takes directory name and packed file name as input from user.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import MarvellousPackerUnpacker.MarvellousPacker;
import java.util.*;
import java.io.*;

class program400
{
    public static void main(String A[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the name of Directory that you want to pack : ");
            String DirName = sobj.nextLine();

            System.out.println("Enter the name of file that you want to create for packing : ");
            String PackName = sobj.nextLine();

            // Create MarvellousPacker object
            MarvellousPacker mobj = new MarvellousPacker(PackName, DirName);

            // Call packing activity
            mobj.PackingActivity();
        }
        catch(Exception eobj)
        {
            System.out.println("Exception occurred : " + eobj);
        }
    } // End of main
} // End of program400 class
