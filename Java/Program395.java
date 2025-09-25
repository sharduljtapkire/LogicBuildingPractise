/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program395.java
//
//  Description : Program to create a pack file for a specified directory.
//                This version generates a fixed-size (100 characters) header
//                for each file in the format "FileName FileSize" and prints
//                the length of the header before and after padding.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class Program395
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

            File PackObj = new File(PackName);

            boolean bRet = PackObj.createNewFile();

            if(bRet == false)
            {
                System.out.println("Unable to create pack file");
                return;
            }
            
            File fobj = new File(DirName);

            if((fobj.exists()) && (fobj.isDirectory()))
            {
                System.out.println("Directory is present");

                File Arr[] = fobj.listFiles();

                System.out.println("Number of files in the directory are : "+Arr.length);
            
                int i = 0, j = 0;

                FileOutputStream foobj = new FileOutputStream(PackObj);
                
                byte Buffer[] = new byte[1024];
                int iRet = 0;

                String Header = null;

                // Directory traversal
                for(i = 0; i < Arr.length; i++)
                {
                    Header = Arr[i].getName() + " " + Arr[i].length();
                    System.out.println(Header + " Length of header is : " + Header.length());
                
                    for(j = Header.length(); j < 100; j++)
                    {
                        Header = Header + " ";
                    }
                    
                    System.out.println(Header + " Length of header is : " + Header.length());
                }   

                System.out.println("Packing activity done");
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
