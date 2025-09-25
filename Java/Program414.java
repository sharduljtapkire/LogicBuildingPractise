/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program414.java
//
//  Description : Replaces all occurrences of a specified character in a string 
//                with another character using a class method.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
    // Method to replace all occurrences of character A with character B
    public String Replace(String str, char A, char B)
    {
        char Arr[] = str.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == A)
            {
                Arr[i] = B;
            }
        }

        return new String(Arr);
    }
}

class program414
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        // Accept string input from user
        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        // Create StringX object and replace spaces with underscores
        StringX strobj = new StringX();
        String sRet = strobj.Replace(str, ' ', '_');

        System.out.println("Updated string is : " + sRet);
    }
}
