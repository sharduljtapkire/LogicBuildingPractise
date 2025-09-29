/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program625.java
//  Description : Accepts a string from the user, encrypts it using XOR 
//                with key 11, and then decrypts it using the same key.
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.*;

class EncryptorDecryptor
{
    private static final int KEY = 11;

    public void Encrypt(char[] arr)
    {
        int i = 0;
        while (i < arr.length && arr[i] != '\0')
        {
            arr[i] = (char)(arr[i] ^ KEY);
            i++;
        }
    }

    public void Decrypt(char[] arr)
    {
        int i = 0;
        while (i < arr.length && arr[i] != '\0')
        {
            arr[i] = (char)(arr[i] ^ KEY);
            i++;
        }
    }
}

class Program625
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

        EncryptorDecryptor obj = new EncryptorDecryptor();

        obj.Encrypt(Arr);
        StringBuilder encrypted = new StringBuilder();
        for (char ch : Arr)
        {
            if (ch == '\0')
                break;
            encrypted.append(ch);
        }
        System.out.println("Encrypted data: " + encrypted.toString());

        obj.Decrypt(Arr);
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
