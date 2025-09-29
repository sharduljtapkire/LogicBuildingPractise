/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program630.java
//  Description : Accepts a source file and a destination file from the user, 
//                encrypts the source file using XOR cipher with a given key 
//                using a buffer, writes the result to the destination file, 
//                then decrypts it back to verify the original content.
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class FileEncryptorDecryptor
{
    private static final int MAX_SIZE = 1024;

    public void Encrypt_XOR_Cipher(String Src, String Dest, char Key)
    {
        processFile(Src, Dest, Key, "Encrypting");
    }

    public void Decrypt_XOR_Cipher(String Src, String Dest, char Key)
    {
        processFile(Src, Dest, Key, "Decrypting");
    }

    private void processFile(String Src, String Dest, char Key, String operation)
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

            System.out.println(operation + " completed successfully for file: " + Dest);
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

class Program630
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
        sobj.nextLine(); // consume newline

        FileEncryptorDecryptor obj = new FileEncryptorDecryptor();
        obj.Encrypt_XOR_Cipher(SrcName, DestName, Key);

        System.out.println("Enter the name of encrypted file: ");
        SrcName = sobj.nextLine();

        System.out.println("Enter the name of decrypted file: ");
        DestName = sobj.nextLine();

        System.out.println("Enter the key for decryption: ");
        Key = sobj.next().charAt(0);

        obj.Decrypt_XOR_Cipher(SrcName, DestName, Key);
    }
}
