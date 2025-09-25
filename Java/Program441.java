/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program441.java
//
//  Description : Accepts a string from the user, removes all spaces, and
//                displays the updated string along with its length.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program441
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        // Remove leading and trailing spaces
        str = str.trim();

        char Arr[] = str.toCharArray();
        char Brr[] = new char[Arr.length];
        
        int iCount = 0, i = 0, j = 0;

        // Copy non-space characters to new array
        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] != ' ')
            {
                Brr[j] = Arr[i];
                j++;
            }
        }

        String output = new String(Brr);

        // Trim any extra null characters at the end
        output = output.trim();
        
        System.out.println("Updated string is : "+output);
        System.out.println("Length is : "+output.length());
    }
}
