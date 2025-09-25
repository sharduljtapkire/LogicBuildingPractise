/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program407.java
//
//  Description : Marvellous Unpacker - Reads multiple files sequentially 
//                from a packed file, extracts the file headers (name and size), 
//                creates new files, and writes the original contents from 
//                the packed file. Displays the number of files unpacked.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class program407
{
    public static void main(String A[])
    {
        try
        {
            String Header = null;
            File fobjnew = null;
            Scanner sobj = new Scanner(System.in);
            int FileSize = 0, iRet = 0, iCountFile = 0;

            // Accept packed file name from user
            System.out.println("Enter the name of file which contains packed data : ");
            String PackName = sobj.nextLine();

            File fobj = new File(PackName);

            // If packed file is not present
            if(!fobj.exists())
            {
                System.out.println("Unable to access Packed file");
                return;
            }

            System.out.println("Packed file gets successfully opened");
            
            FileInputStream fiobj = new FileInputStream(fobj);

            // Buffer to read the header of each file (100 bytes)
            byte HeaderBuffer[] = new byte[100];

            // Scan the packed file to extract files from it
            while((iRet = fiobj.read(HeaderBuffer, 0, 100)) != -1)
            {
                // Convert byte array to String and trim spaces
                Header = new String(HeaderBuffer).trim();

                // Tokenize the header into 2 parts: filename and filesize
                String Tokens[] = Header.split(" ");

                String FileName = Tokens[0];
                FileSize = Integer.parseInt(Tokens[1]);

                // Create new file to extract
                fobjnew = new File(FileName);
                fobjnew.createNewFile();

                // Buffer to store file data
                byte Buffer[] = new byte[FileSize];

                FileOutputStream foobj = new FileOutputStream(fobjnew);

                // Read data from packed file and write into new file
                fiobj.read(Buffer, 0, FileSize);
                foobj.write(Buffer, 0, FileSize);

                System.out.println("File unpacked with name : " + FileName + " having size " + FileSize);

                iCountFile++;

                foobj.close();
            } // End of while

            System.out.println("Total number of files unpacked : " + iCountFile);

            fiobj.close();
        }
        catch(Exception eobj)
        {
            System.out.println("Exception occurred: " + eobj);
        }
    } // End of main
} // End of program407 class
