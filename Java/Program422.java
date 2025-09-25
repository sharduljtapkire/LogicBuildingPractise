/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program422.java
//
//  Description : Demonstrates the built-in trim() method of the String class
//                to remove leading and trailing white spaces from a string.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class program422
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        // Using built-in trim() method to remove leading and trailing spaces
        String sRet = str.trim();

        System.out.println("Updated string is : " + sRet);
        System.out.println("String length is : " + sRet.length());
    }
}
