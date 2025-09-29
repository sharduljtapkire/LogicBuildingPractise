/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program624.java
//  Description : Accepts a string from the user, encrypts it by adding a 
//                key to each character's ASCII value, then decrypts it by 
//                subtracting the key to restore the original string.
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.*;

class EncryptorDecryptor
{
    public void Encrypt(char[] arr, int key)
    {
        int i = 0;
        while (i < arr.length && arr[i] != '\0')
        {
            arr[i] = (char)(arr[i] + key);
            i++;
        }
    }

    public void Decrypt(char[] arr, int key)
    {
        int i = 0;
        while (i < arr.length && arr[i] != '\0')
        {
            arr[i] = (char)(arr[i] - key);
            i++;
        }
    }
}

class Program624
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

        int key = 5;
        EncryptorDecryptor obj = new EncryptorDecryptor();

        obj.Encrypt(Arr, key);
        StringBuilder encrypted = new StringBuilder();
        for (char ch : Arr)
        {
            if (ch == '\0')
                break;
            encrypted.append(ch);
        }
        System.out.println("Encrypted data: " + encrypted.toString());

        obj.Decrypt(Arr, key);
        StringBuilder decrypted = new StringBuilder();
        for (char ch : Arr)
        {
            if (ch == '\0')
                break;
            decrypted.append(ch);
        }
        System.out.println("Decrypted data: " + decrypted.toString());
    }
}
