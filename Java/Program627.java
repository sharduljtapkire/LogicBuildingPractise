/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program627.java
//  Description : Accepts a string from the user, displays its ASCII values, 
//                encrypts it using XOR with a character key, displays the 
//                encrypted ASCII values, then decrypts it and displays original ASCII values.
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.*;

class EncryptorDecryptor
{
    public void Encrypt(char[] arr, char key)
    {
        int i = 0;
        while (i < arr.length && arr[i] != '\0')
        {
            arr[i] = (char)(arr[i] ^ key);
            i++;
        }
    }

    public void Decrypt(char[] arr, char key)
    {
        int i = 0;
        while (i < arr.length && arr[i] != '\0')
        {
            arr[i] = (char)(arr[i] ^ key);
            i++;
        }
    }
}

class Program627
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the data: ");
        String input = sobj.nextLine();

        char[] Arr = new char[input.length() + 1];
        for (int i = 0; i < input.length(); i++)
        {
            Arr[i] = input.charAt(i);
        }
        Arr[input.length()] = '\0';

        System.out.println("Original data in ASCII: ");
        int i = 0;
        while (Arr[i] != '\0')
        {
            System.out.print((int)Arr[i] + "\t");
            i++;
        }

        char key = 'a';
        EncryptorDecryptor obj = new EncryptorDecryptor();
        obj.Encrypt(Arr, key);

        System.out.println("\nEncrypted data in ASCII: ");
        i = 0;
        while (Arr[i] != '\0')
        {
            System.out.print((int)Arr[i] + "\t");
            i++;
        }

        obj.Decrypt(Arr, key);

        System.out.println("\nDecrypted data in ASCII: ");
        i = 0;
        while (Arr[i] != '\0')
        {
            System.out.print((int)Arr[i] + "\t");
            i++;
        }

        System.out.println();
    }
}
