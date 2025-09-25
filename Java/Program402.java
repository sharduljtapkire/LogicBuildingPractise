/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program402.java
//
//  Description : Marvellous Unpacker - Read first file header from packed file.
//                This program opens the packed file, reads the first 100 bytes
//                as the header, and displays it as a string.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class program402
{
    public static void main(String A[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            // Accept packed file name from user
            System.out.println("Enter the name of file which contains packed data : ");
            String PackName = sobj.nextLine();

            File fobj = new File(PackName);

            // Check if packed file exists
            if(!fobj.exists())
            {
                System.out.println("Unable to access Packed file");
                return;
            }

            System.out.println("Packed file gets successfully opened");
            
            // Create FileInputStream object for reading packed file
            FileInputStream fiobj = new FileInputStream(fobj);

            // Buffer to read the header (first 100 bytes)
            byte HeaderBuffer[] = new byte[100];

            fiobj.read(HeaderBuffer, 0, 100);

            // Convert byte array to String
            String Header = new String(HeaderBuffer);

            System.out.println("Header of first file: " + Header);
        }
        catch(Exception eobj)
        {
            System.out.println("Exception occurred: " + eobj);
        }
    } // End of main
} // End of program402 class
