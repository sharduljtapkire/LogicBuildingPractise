/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program406.java
//
//  Description : Marvellous Unpacker - Reads multiple files sequentially 
//                from a packed file, extracts the file headers (name and size), 
//                creates new files, and writes the original contents from 
//                the packed file.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class program406
{
    public static void main(String A[])
    {
        try
        {
            String Header = null;
            File fobjnew = null;
            Scanner sobj = new Scanner(System.in);
            int FileSize = 0, iRet = 0;

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
            
            // FileInputStream to read the packed file
            FileInputStream fiobj = new FileInputStream(fobj);

            // Buffer to read each file header (first 100 bytes for each file)
            byte HeaderBuffer[] = new byte[100];

            // Loop to read multiple file headers and contents
            while((iRet = fiobj.read(HeaderBuffer, 0, 100)) != -1)
            {
                // Convert header bytes to String
                Header = new String(HeaderBuffer);
                Header = Header.trim();

                // Split header to get file name and size
                String Tokens[] = Header.split(" ");
                String FileName = Tokens[0];
                FileSize = Integer.parseInt(Tokens[1]);

                System.out.println("Unpacking File: " + FileName + " of size: " + FileSize + " bytes");

                // Create new file for unpacking
                fobjnew = new File(FileName);
                fobjnew.createNewFile();

                // Buffer to read actual file content
                byte Buffer[] = new byte[FileSize];

                // FileOutputStream to write content to new file
                FileOutputStream foobj = new FileOutputStream(fobjnew);

                // Read content from packed file and write to new file
                fiobj.read(Buffer, 0, FileSize);
                foobj.write(Buffer, 0, FileSize);

                // Close FileOutputStream
                foobj.close();
            } // End of while

            // Close FileInputStream
            fiobj.close();
            System.out.println("All files unpacked successfully.");
        }
        catch(Exception eobj)
        {
            System.out.println("Exception occurred: " + eobj);
        }
    } // End of main
} // End of program406 class
