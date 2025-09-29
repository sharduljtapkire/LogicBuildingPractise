/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program633.java
//  Description : Implements Caesar and XOR ciphers for file encryption and decryption.
//                Uses buffer of 1024 bytes to read/write files. Accepts source/destination
//                file names and keys from the user.
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class FileCipher
{
    private static final int MAX_SIZE = 1024;

    public void encryptCaesar(String src, String dest, int key)
    {
        processCaesar(src, dest, key, true);
    }

    public void decryptCaesar(String src, String dest, int key)
    {
        processCaesar(src, dest, key, false);
    }

    public void encryptXOR(String src, String dest, char key)
    {
        processXOR(src, dest, key);
    }

    public void decryptXOR(String src, String dest, char key)
    {
        processXOR(src, dest, key);
    }

    private void processCaesar(String src, String dest, int key, boolean encrypt)
    {
        byte[] buffer = new byte[MAX_SIZE];
        int bytesRead;

        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest))
        {
            while ((bytesRead = fis.read(buffer)) > 0)
            {
                System.out.println(bytesRead);

                for (int i = 0; i < bytesRead; i++)
                {
                    if (encrypt)
                        buffer[i] = (byte)((buffer[i] + key) % 256);
                    else
                        buffer[i] = (byte)((buffer[i] - key + 256) % 256); // prevent negative wrap
                }

                fos.write(buffer, 0, bytesRead);
            }

            System.out.println((encrypt ? "Caesar Encryption" : "Caesar Decryption") + " completed for file: " + dest);
        }
        catch (IOException e)
        {
            System.out.println("Error processing files: " + e.getMessage());
        }
    }

    private void processXOR(String src, String dest, char key)
    {
        byte[] buffer = new byte[MAX_SIZE];
        int bytesRead;

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

            System.out.println("XOR processing completed for file: " + dest);
        }
        catch (IOException e)
        {
            System.out.println("Error processing files: " + e.getMessage());
        }
    }
}

public class Program633
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        FileCipher cipher = new FileCipher();

        System.out.println("Enter the name of original file: ");
        String srcName = sobj.nextLine();

        System.out.println("Enter the name of new encrypted file: ");
        String destName = sobj.nextLine();

        System.out.println("Enter the key for Caesar encryption: ");
        int iKey = sobj.nextInt();
        sobj.nextLine(); // consume newline

        cipher.encryptCaesar(srcName, destName, iKey);

        System.out.println("Enter the name of encrypted file: ");
        srcName = sobj.nextLine();

        System.out.println("Enter the name of decrypted file: ");
        destName = sobj.nextLine();

        System.out.println("Enter the key for Caesar decryption: ");
        iKey = sobj.nextInt();

        cipher.decryptCaesar(srcName, destName, iKey);
    }
}
