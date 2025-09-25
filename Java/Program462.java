/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program462.java
//
//  Description : Accepts a string from the user, trims leading/trailing spaces,
//                replaces multiple consecutive spaces with a single space,
//                then reverses each word individually while keeping the word 
//                order the same.
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

class Program462
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

        // Reverse each word individually
        for(String s : tokens)
        {
            sb = new StringBuilder(s);
            System.out.print(sb.reverse() + " ");
        }
    }
}
