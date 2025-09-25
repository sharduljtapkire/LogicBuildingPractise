/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program454.java
//
//  Description : Accepts a string from the user, trims leading and trailing 
//                spaces, replaces multiple consecutive spaces with a single 
//                space, splits the string into words, and finds the largest 
//                word along with its length.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program454
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

        int iMax = 0;
        String MaxStr = null;

        // Find the largest word
        for(int i = 0; i < tokens.length; i++)
        {
            if(tokens[i].length() > iMax)
            {
                iMax = tokens[i].length();
                MaxStr = tokens[i];
            }
        }

        System.out.println("Largest word is : " + MaxStr + " having length : " + iMax);
    }
}
