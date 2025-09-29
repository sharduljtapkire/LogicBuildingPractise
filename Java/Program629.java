/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program629.java
//  Description : Accepts a source file and a destination file from the user, 
//                encrypts the source file using XOR cipher with a given key 
//                using a buffer, and writes the result to the destination file.
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class FileEncryptor
{
    private static final int MAX_SIZE = 1024;

    public void Encrypt_XOR_Cipher(String Src, String Dest, char Key)
    {
        byte[] Buffer = new byte[MAX_SIZE];
        int iRet = 0;

        try (FileInputStream fis = new FileInputStream(Src);
             FileOutputStream fos = new FileOutputStream(Dest))
        {
            while ((iRet = fis.read(Buffer)) > 0)
            {
                System.out.println(iRet);

                for (int i = 0; i < iRet; i++)
                {
                    Buffer[i] = (byte)(Buffer[i] ^ Key);
                }

                fos.write(Buffer, 0, iRet);
            }
            System.out.println("File encryption completed successfully.");
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

class Program629
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
