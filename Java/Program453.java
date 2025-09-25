/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program453.java
//
//  Description : Accepts a string from the user, trims leading and trailing 
//                spaces, replaces multiple consecutive spaces with a single 
//                space, splits the string into words, and displays each word 
//                along with its length.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program453
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");

        String str = sobj.nextLine();

        // Remove leading and trailing spaces
        str = str.trim();

        // Replace multiple consecutive spaces with a single space
        str = str.replaceAll("\\s+"," ");

        // Split the string into words
        String tokens[] = str.split(" ");

        // Display each word and its length
        for(int i = 0; i < tokens.length; i++)
        {
            System.out.println(tokens[i] + " : " + tokens[i].length());
        }
    }
}
