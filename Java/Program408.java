/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program408.java
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

// Class to handle the unpacking operation
class MarvellousUnpacker
{
    private String PackName;

    public MarvellousUnpacker(String A)
    {
        this.PackName = A;
    }

    public void UnpackingActivity()
    {
        try
        {
            String Header = null;
            File fobjnew = null;
            int FileSize = 0, iRet = 0, iCountFile = 0;

            File fobj = new File(PackName);

            // Check if packed file exists
            if(!fobj.exists())
            {
                System.out.println("Unable to access Packed file");
                return;
            }

            System.out.println("Packed file gets successfully opened");
            
            FileInputStream fiobj = new FileInputStream(fobj);

            // Buffer to read the header of each file (100 bytes)
            byte HeaderBuffer[] = new byte[100];

            // Read packed file sequentially
            while((iRet = fiobj.read(HeaderBuffer, 0, 100)) != -1)
            {
                // Convert header bytes to string and trim
                Header = new String(HeaderBuffer).trim();

                // Split header into filename and filesize
                String Tokens[] = Header.split(" ");

                fobjnew = new File(Tokens[0]);

                // Create new file to extract
                fobjnew.createNewFile();

                FileSize = Integer.parseInt(Tokens[1]);

                // Buffer to store file data
                byte Buffer[] = new byte[FileSize];

                FileOutputStream foobj = new FileOutputStream(fobjnew);

                // Read file content from packed file and write to new file
                fiobj.read(Buffer, 0, FileSize);
                foobj.write(Buffer, 0, FileSize);

                System.out.println("File unpacked with name : " + Tokens[0] + " having size " + FileSize);

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
    } // End of UnpackingActivity
} // End of MarvellousUnpacker class

// Main class to run the unpacker
class program408
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

            // Start unpacking
            mobj.UnpackingActivity();
        }
        catch(Exception eobj)
        {
            System.out.println("Exception occurred: " + eobj);
        }
    } // End of main
} // End of program408 class
