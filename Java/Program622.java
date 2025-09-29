/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program622.java
//  Description : Accepts a string from the user and encrypts it by 
//                incrementing the ASCII value of each character by 1.
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Encryptor
{
    public void Encrypt(char[] arr)
    {
        int i = 0;
        while (i < arr.length && arr[i] != '\0')
        {
            arr[i] = (char)(arr[i] + 1);
            i++;
        }
    }
}

class Program622
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the data: ");
        String input = sobj.nextLine();

        // Convert string to char array for in-place encryption
        char[] Arr = new char[input.length() + 1];
        for (int i = 0; i < input.length(); i++)
        {
            Arr[i] = input.charAt(i);
        }
        Arr[input.length()] = '\0';

        Encryptor eobj = new Encryptor();
        eobj.Encrypt(Arr);

        // Convert char array back to string until null character
        StringBuilder encrypted = new StringBuilder();
        for (char ch : Arr)
        {
            if (ch == '\0')
                break;
            encrypted.append(ch);
        }

        System.out.println("Encrypted data: " + encrypted.toString());
    }
}
