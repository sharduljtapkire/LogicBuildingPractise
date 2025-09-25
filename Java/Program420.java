/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program420.java
//
//  Description : Demonstrates creation of String objects from a character array.
//                Shows full array to string conversion and substring from char array.
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

        if(Arr[0] == ' ')
        {
            while((i < Arr.length) && (Arr[i] == ' '))
            {
                i++;
            }
        }

        iStart = i;

        i = Arr.length-1;

        if(Arr[Arr.length-1] == ' ')
        {            
            while(i >= 0 && Arr[i] == ' ')
            {
                i--;
            }
        }

        iEnd = i;

        char Brr[] = new char[iEnd-iStart+1];
        int j = 0;

        for(i = iStart, j = 0; i <= iEnd; i++, j++)
        {
            Brr[j] = Arr[i];
        }

        return new String(Brr);
    }
}

class program420
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        // Create char array
        char Arr[] = {'a','b','c','d','e','f'};

        // Convert full array to string
        String s = new String(Arr);
        System.out.println("Full array to string: " + s);

        // Convert partial array (from index 1, length 4) to string
        s = new String(Arr,1,4);
        System.out.println("Partial array to string (index 1, length 4): " + s);
    }
}
