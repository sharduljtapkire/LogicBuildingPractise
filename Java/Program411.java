/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program411.java
//
//  Description : Counts the number of white space characters in a given string.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class program411
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        // Accept string input from user
        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        int iCount = 0;

        // Count white spaces in the string
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == ' ')
            {
                iCount++;
            }
        }

        System.out.println("Number of white spaces are : " + iCount);
    }
}
