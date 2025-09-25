/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program446.java
//
//  Description : Accepts a string from the user, trims leading and trailing 
//                spaces, replaces all occurrences of "ab" with "x", and 
//                displays the updated string.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program446
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");

        String str = sobj.nextLine();

        // Remove leading and trailing spaces
        str = str.trim();

        // Replace all occurrences of "ab" with "x"
        str = str.replaceAll("ab","x");

        System.out.println("Updated string is : " + str);
    }
}
