/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program440.java
//
//  Description : Accepts a string from the user and counts the number of words
//                based on spaces. Leading/trailing spaces are ignored.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class program440
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        // Remove leading and trailing spaces
        str = str.trim();

        char Arr[] = str.toCharArray();

        int iCount = 0, i = 0;

        // Count spaces
        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ' ')
            {
                iCount++;
            }
        }

        // Number of words = spaces + 1
        System.out.println("Number of words are : "+(iCount + 1));
    }
}
