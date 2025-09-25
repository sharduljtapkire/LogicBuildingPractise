/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program398.java
//
//  Description : Marvellous Packer - Program to pack all files from a specified
//                directory into a single packed file. Each file's header is 
//                written in 100 bytes format "FileName FileSize" followed by 
//                the file content. The program also prints the file name, bytes
//                read during packing, and a statistical report with total files packed.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class Program398
{
    public static void main(String A[])
    {
        try
        {
            System.out.println("--------------------------------------------------------");
            System.out.println("----------- Marvellous Packer Unpacker -----------------");
            System.out.println("--------------------------------------------------------");
            System.out.println("------------------ Packing Activity --------------------");       
            System.out.println("--------------------------------------------------------");

            int i = 0, j = 0, iRet = 0, iCountFile = 0;
            
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the name of Directory that you want to pack : ");
            String DirName = sobj.nextLine();

            System.out.println("Enter the name of file that you want to create for packing : ");
            String PackName = sobj.nextLine();

            File fobj = new File(DirName);

            // Check the existence of Directory
            if((fobj.exists()) && (fobj.isDirectory()))
            {
                System.out.println(DirName + " is successfully opened");

                File PackObj = new File(PackName);

                // Create a packed file
                boolean bRet = PackObj.createNewFile();

                if(bRet == false)
                {
                    System.out.println("Unable to create pack file");
                    return;
                }

                System.out.println("Packed file successfully created with name : "+PackName);
            
                // Retrieve all files from directory
                File Arr[] = fobj.listFiles();

                // Packed file object
                FileOutputStream foobj = new FileOutputStream(PackObj);
                
                // Buffer for read and write activity
                byte Buffer[] = new byte[1024];

                String Header = null;

                // Directory traversal
                for(i = 0; i < Arr.length; i++)
                {
                    Header = Arr[i].getName() + " " + Arr[i].length();
                
                    // Loop to form 100 bytes header
                    for(j = Header.length(); j < 100; j++)
                    {
                        Header = Header + " ";
                    }
                    
                    // Write header into packed file
                    foobj.write(Header.getBytes());

                    // Open file from directory for reading
                    FileInputStream fiobj = new FileInputStream(Arr[i]);

                    // Write contents of file into packed file
                    while((iRet = fiobj.read(Buffer)) != -1)
                    {
                        foobj.write(Buffer,0,iRet);
                        
                        System.out.println("File name scanned : "+Arr[i].getName());
                        System.out.println("File size read is : "+iRet);
                    }

                    fiobj.close();
                    iCountFile++;
                }   

                System.out.println("Packing activity done");
                
                System.out.println("--------------------------------------------------------");
                System.out.println("------------------ Statistical Report ------------------");
                System.out.println("--------------------------------------------------------");
                
                System.out.println("Total files packed : "+iCountFile);

                System.out.println("--------------------------------------------------------");
                System.out.println("--------- Thank you for using our application ----------");
                System.out.println("--------------------------------------------------------");
            }
            else
            {
                System.out.println("There is no such directory");
            }
        }
        catch(Exception eobj)
        {
            System.out.println("Exception occurred : " + eobj);
        }
    }
}
