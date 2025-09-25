/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program417.java
//
//  Description : Replaces all occurrences of character 'a' with 'A'
//                in a string using the built-in replaceAll() method.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class program417
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        // Accept string input from user
        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        // Replace all occurrences of 'a' with 'A'
        String sRet = str.replaceAll("a","A");

        System.out.println("Updated string is : " + sRet);
    }
}
