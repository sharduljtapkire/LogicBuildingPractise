/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program383.java
//
//  Description : Program to create a "pack" file for a given directory.
//                - Accepts directory name from the user.
//                - Accepts name of the file to create as the pack file.
//                - Checks if the directory exists and lists all files along with their sizes.
//                - Creates the pack file if it does not exist.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class Program383
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
            
                int i = 0;

                for(i = 0; i < Arr.length; i++)
                {
                    System.out.println("File name is : "+Arr[i].getName()+" File size is : "+Arr[i].length());
                }          
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
