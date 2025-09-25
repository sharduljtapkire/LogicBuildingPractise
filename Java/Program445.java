/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program445.java
//
//  Description : Accepts a string from the user, trims leading and trailing 
//                spaces, replaces multiple consecutive spaces with a single 
//                space, and displays the updated string.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program445
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");

        String str = sobj.nextLine();

        // Remove leading and trailing spaces
        str = str.trim();

        // Replace multiple consecutive spaces with a single space
        str = str.replaceAll("  "," ");

        System.out.println("Updated string is : "+str);
    }
}
