/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program464.java
//
//  Description : Accepts a string from the user, trims leading/trailing spaces,
//                replaces multiple consecutive spaces with a single space,
//                reverses each word individually, and prints the final string.
//
//  Example     :
//                Input  : abcdefg hijk
//                Output : gfedcba kjih
//
//  Author      : Shardul Tapkire
//  Date        : 25/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program464
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

        // Split into words
        String tokens[] = str.split(" ");

        StringBuilder sb = null;
        StringBuilder newstr = new StringBuilder();

        // Reverse each word individually and build new string
        for(String s : tokens)
        {
            sb = new StringBuilder(s);
            (newstr.append(sb.reverse())).append(" ");    
        }

        String finalstr = new String(newstr);

        System.out.println(finalstr.trim());
    }
}
