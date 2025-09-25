/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program455.java
//
//  Description : Accepts a string from the user, trims leading and trailing 
//                spaces, replaces multiple consecutive spaces with a single 
//                space, splits the string into words, and finds the largest 
//                word along with its length using index tracking.
//
//  Author      : Shardul Tapkire
//  Date        : 25/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program455
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

        int iMax = 0, MaxIndex = 0;

        // Find the largest word using index tracking
        for(int i = 0; i < tokens.length; i++)
        {
            if(tokens[i].length() > iMax)
            {
                iMax = tokens[i].length();
                MaxIndex = i;
            }
        }

        System.out.println("Largest word is : " + tokens[MaxIndex] + " having length : " + iMax);
    }
}
