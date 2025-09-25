/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program461.java
//
//  Description : Accepts a string from the user, trims leading/trailing spaces,
//                replaces multiple consecutive spaces with a single space,
//                and then reverses the entire string.
//
//  Example     :
//                Input  : abcdefg hijk
//                Output : kjih gfedcba
//
//  Author      : Shardul Tapkire
//  Date        : 25/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program461
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");

        String str = sobj.nextLine();

        // Remove leading and trailing spaces
        str = str.trim();

        // Replace multiple spaces with a single space
        str = str.replaceAll("\\s+"," ");

        // Reverse the entire string
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        System.out.println(sb);
    }
}
