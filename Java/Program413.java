/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program413.java
//
//  Description : Replaces all white spaces in a given string with underscores.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class program413
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        // Accept string input from user
        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        // Convert string to character array
        char Arr[] = str.toCharArray();

        // Replace spaces with underscores
        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ' ')
            {
                Arr[i] = '_';
            }
        }

        // Convert character array back to string
        String newstr = new String(Arr);

        System.out.println("Updated string is : " + newstr);
    }
}
