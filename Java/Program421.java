/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program421.java
//
//  Description : Demonstrates a custom Trim method that removes leading and trailing
//                white spaces from a string using character array manipulation.
//                Also demonstrates creation of substring using String(char[], start, count).
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
    public static String Trim(String str)
    {
        int i = 0, iStart = 0, iEnd = 0;

        char Arr[] = str.toCharArray(); // Example: "   JAY  GANESH   "

        // Find index of first non-space character
        if(Arr[0] == ' ')
        {
            while((i < Arr.length) && (Arr[i] == ' '))
            {
                i++;
            }
        }

        iStart = i;

        // Find index of last non-space character
        i = Arr.length-1;
        if(Arr[Arr.length-1] == ' ')
        {
            while(i >= 0 && Arr[i] == ' ')
            {
                i--;
            }
        }

        iEnd = i;

        // Create a new string from the char array using start index and length
        return new String(Arr, iStart, iEnd-iStart+1);
    }
}

class program421
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        String sRet = StringX.Trim(str);

        System.out.println("Updated string is : " + sRet);
        System.out.println("String length is : " + sRet.length());
    }
}
