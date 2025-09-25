/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program379.java
//
//  Description : Program to check if a directory exists or not.
//                - Accepts directory name from the user.
//                - Uses File class to verify directory existence.
//                - Displays appropriate message accordingly.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class Program379
{
    public static void main(String A[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the name of Directory : ");
            String DirName = sobj.nextLine();

            File fobj = new File(DirName);

            if(fobj.exists())
            {
                System.out.println("Directory is present");
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
