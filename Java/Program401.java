/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program401.java
//
//  Description : Marvellous Unpacker - Initial step.
//                This program demonstrates opening a packed file for unpacking.
//                It takes the name of the packed file from the user and verifies
//                whether it exists before proceeding with unpacking operations.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class program401
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

            // Further unpacking logic to be added
        }
        catch(Exception eobj)
        {
            System.out.println("Exception occurred : " + eobj);
        }
    } // End of main
} // End of program401 class
