/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program412.java
//
//  Description : Counts the number of white space characters in a given string
//                using a character array.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class program412
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        // Accept string input from user
        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        int iCount = 0;

        // Convert string to character array
        char Arr[] = str.toCharArray();

        // Count white spaces in the array
        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ' ')
            {
                iCount++;
            }
        }

        System.out.println("Number of white spaces are : " + iCount);
    }
}
