/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program185.java
//  Description :   Demonstrates file creation in Java.
//                  - Uses FileOutputStream to create a file named "Demo.txt".
//                  - If the file does not exist, it will be created.
//
//  Author      :   Shardul Tapkire
//  Date        :   22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.io.FileOutputStream;
import java.io.IOException;

class program185
{
    public static void main(String[] args)
    {
        try
        {
           
            FileOutputStream fos = new FileOutputStream("Demo.txt");

            System.out.println("File created successfully: Demo.txt");

            
            fos.close();
        }
        catch(IOException e)
        {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}
