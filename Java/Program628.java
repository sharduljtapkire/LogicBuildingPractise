/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program628.java
//  Description : Accepts a source file and a destination file from the user, 
//                encrypts the source file using XOR cipher with a given key, 
//                and writes the result to the destination file.
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class FileEncryptor
{
    public void Encrypt_XOR_Cipher(String Src, String Dest, char Key)
    {
        try (FileInputStream fis = new FileInputStream(Src);
             FileOutputStream fos = new FileOutputStream(Dest))
        {
            int b;
            while ((b = fis.read()) != -1)
            {
                fos.write(b ^ Key);
            }
            System.out.println("File encrypted successfully.");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Unable to open source or destination file.");
        }
        catch (IOException e)
        {
            System.out.println("Error while processing files: " + e.getMessage());
        }
    }
}

class Program628
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of original file: ");
        String SrcName = sobj.nextLine();

        System.out.println("Enter the name of new encrypted file: ");
        String DestName = sobj.nextLine();

        System.out.println("Enter the key for encryption: ");
        char Key = sobj.next().charAt(0);

        FileEncryptor obj = new FileEncryptor();
        obj.Encrypt_XOR_Cipher(SrcName, DestName, Key);
    }
}
