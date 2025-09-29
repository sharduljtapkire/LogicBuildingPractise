/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program631.java
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

class FileXORCipher
{
    private static final int MAX_SIZE = 1024;

    public void encrypt(String src, String dest, char key)
    {
        processFile(src, dest, key, "Encrypting");
    }

    public void decrypt(String src, String dest, char key)
    {
        processFile(src, dest, key, "Decrypting");
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

            System.out.println(operation + " completed successfully for file: " + dest);
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

public class Program631
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        FileXORCipher obj = new FileXORCipher();

        System.out.println("Enter the name of original file: ");
        String srcName = sobj.nextLine();

        System.out.println("Enter the name of new encrypted file: ");
        String destName = sobj.nextLine();

        System.out.println("Enter the key for encryption: ");
        char key = sobj.next().charAt(0);
        sobj.nextLine(); // consume newline

        obj.encrypt(srcName, destName, key);

        System.out.println("Enter the name of encrypted file: ");
        srcName = sobj.nextLine();

        System.out.println("Enter the name of decrypted file: ");
        destName = sobj.nextLine();

        System.out.println("Enter the key for decryption: ");
        key = sobj.next().charAt(0);

        obj.decrypt(srcName, destName, key);
    }
}
