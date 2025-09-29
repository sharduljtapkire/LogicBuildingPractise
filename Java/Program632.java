/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program632.java
//  Description : Implements XOR and Caesar ciphers for file encryption and decryption.
//                Accepts source and destination file names, processes files using 
//                a buffer of 1024 bytes, encrypts/decrypts using a key.
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class FileCipher
{
    private static final int MAX_SIZE = 1024;

    public void encryptXOR(String src, String dest, char key)
    {
        processFile(src, dest, key, "XOR Encrypting");
    }

    public void decryptXOR(String src, String dest, char key)
    {
        processFile(src, dest, key, "XOR Decrypting");
    }

    public void encryptCaesar(String src, String dest, int key)
    {
        byte[] buffer = new byte[MAX_SIZE];
        int bytesRead = 0;

        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest))
        {
            while ((bytesRead = fis.read(buffer)) > 0)
            {
                System.out.println(bytesRead);

                for (int i = 0; i < bytesRead; i++)
                {
                    buffer[i] = (byte)((buffer[i] + key) % 256);
                }

                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("Caesar Encryption completed for file: " + dest);
        }
        catch (IOException e)
        {
            System.out.println("Error processing files: " + e.getMessage());
        }
    }

    private void processFile(String src, String dest, char key, String operation)
    {
        byte[] buffer = new byte[MAX_SIZE];
        int bytesRead = 0;

        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest))
        {
            while ((bytesRead = fis.read(buffer)) > 0)
            {
                System.out.println(bytesRead);

                for (int i = 0; i < bytesRead; i++)
                {
                    buffer[i] = (byte)(buffer[i] ^ key);
                }

                fos.write(buffer, 0, bytesRead);
            }

            System.out.println(operation + " completed for file: " + dest);
        }
        catch (IOException e)
        {
            System.out.println("Error processing files: " + e.getMessage());
        }
    }
}

public class Program632
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        FileCipher cipher = new FileCipher();

        System.out.println("Enter the name of original file: ");
        String srcName = sobj.nextLine();

        System.out.println("Enter the name of new encrypted file: ");
        String destName = sobj.nextLine();

        System.out.println("Enter the key for XOR encryption: ");
        char key = sobj.next().charAt(0);
        sobj.nextLine(); // consume newline

        cipher.encryptXOR(srcName, destName, key);

        System.out.println("Enter the name of encrypted file: ");
        srcName = sobj.nextLine();

        System.out.println("Enter the name of decrypted file: ");
        destName = sobj.nextLine();

        System.out.println("Enter the key for XOR decryption: ");
        key = sobj.next().charAt(0);

        cipher.decryptXOR(srcName, destName, key);
    }
}
