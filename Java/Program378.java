/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program378.java
//
//  Description : Program to copy contents of one file into another.
//                - Accepts source and destination file names from the user.
//                - Validates if source exists and destination does not.
//                - Uses FileInputStream and FileOutputStream for copy.
//                - Reads data in chunks of 1024 bytes for efficiency.
//                - Ensures correct number of bytes are written each time.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class Program378
{
    public static void main(String A[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the name of source file : ");
            String Source = sobj.nextLine();
            
            System.out.println("Enter the name of destination file : ");
            String Destination = sobj.nextLine();
            
            File fSource = new File(Source);
            if(fSource.exists() == false)
            {
                System.out.println("Source file is not present..");
                return;
            }

            File fDestination = new File(Destination);
            if(fDestination.exists() == true)
            {
                System.out.println("Destination file already exists..");
                return;
            }

            fDestination.createNewFile();

            FileInputStream fiobj = new FileInputStream(fSource);
            FileOutputStream foobj = new FileOutputStream(fDestination);
            
            byte Buffer[] = new byte[1024];
            int iRet = 0;

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer, 0, iRet);
            }

            System.out.println("File copy done...");

            fiobj.close();
            foobj.close();
        }
        catch(Exception eobj)
        {
            System.out.println("Exception occurred : " + eobj);
        }
    }
}
