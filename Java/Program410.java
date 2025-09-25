/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program410.java
//
//  Description : Marvellous Unpacker - Reads a packed file, extracts all 
//                contained files using headers (file name and size), creates 
//                new files, writes their contents, and displays a statistical report.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

// Importing MarvellousUnpacker from the package
import MarvellousPackerUnpacker.MarvellousUnpacker;

// Main class to execute the unpacking process
class program410
{
    public static void main(String A[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            // Accept packed file name from user
            System.out.println("Enter the name of file which contains packed data : ");
            String PackName = sobj.nextLine();

            // Create unpacker object
            MarvellousUnpacker mobj = new MarvellousUnpacker(PackName);

            // Perform unpacking
            mobj.UnpackingActivity();
        }
        catch(Exception eobj)
        {
            System.out.println("Exception occurred: " + eobj);
        }
    } // End of main
} // End of program410 class
