/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program450.java
//
//  Description : Accepts a string from the user, trims leading and trailing 
//                spaces, replaces multiple consecutive spaces with a single 
//                space, counts the number of words in the string, and 
//                displays the result.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program450
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

        // Convert string to char array
        char Arr[] = str.toCharArray();
        int iCount = 0;
        
        // Count number of spaces in the string
        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ' ')
            {
                iCount++;
            }
        }

        // Number of words is spaces + 1
        System.out.println("Number of words are : "+(iCount+1));
    }
}
