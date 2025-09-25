/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program404.java
//
//  Description : Marvellous Unpacker - Read the first file header from a 
//                packed file, extract the filename and filesize, and create 
//                an empty file with the extracted filename.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class program404
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
            System.out.println("Raw Header: " + Header);

            // Trim extra spaces
            Header = Header.trim();

            // Split header to get file name and file size
            String Tokens[] = Header.split(" ");

            System.out.println("File name is : " + Tokens[0]);
            System.out.println("File size is : " + Tokens[1]);

            // Create a new empty file using the extracted file name
            File fobjnew = new File(Tokens[0]);
            boolean bRet = fobjnew.createNewFile();

            if(bRet == true)
            {
                System.out.println("Empty file " + Tokens[0] + " created successfully.");
            }
            else
            {
                System.out.println("Unable to create file " + Tokens[0]);
            }

            fiobj.close();
        }
        catch(Exception eobj)
        {
            System.out.println("Exception occurred: " + eobj);
        }
    } // End of main
} // End of program404 class
