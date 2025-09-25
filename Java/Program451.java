/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program451.java
//
//  Description : Accepts a string from the user, trims leading and trailing 
//                spaces, replaces multiple consecutive spaces with a single 
//                space, splits the string into words, counts the number of 
//                words, and displays the result.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program451
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

        // Split the string into words using space as delimiter
        String tokens[] = str.split(" ");

        // Display number of words
        System.out.println("Number of words are : "+tokens.length);
    }
}
