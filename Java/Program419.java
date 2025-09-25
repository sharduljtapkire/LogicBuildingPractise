/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program419.java
//
//  Description : Removes leading and trailing white spaces from a string
//                without using the built-in trim() method. Returns the trimmed string.
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

        // Find start index of non-space characters
        if(Arr[0] == ' ')
        {
            while((i < Arr.length) && (Arr[i] == ' '))
            {
                i++;
            }
        }
        iStart = i;

        // Find end index of non-space characters
        i = Arr.length - 1;
        if(Arr[Arr.length - 1] == ' ')
        {
            while((i >= 0) && (Arr[i] == ' '))
            {
                i--;
            }
        }
        iEnd = i;

        // Create new array for trimmed string
        char Brr[] = new char[iEnd - iStart + 1];
        int j = 0;

        for(i = iStart, j = 0; i <= iEnd; i++, j++)
        {
            Brr[j] = Arr[i];
        }

        return new String(Brr);
    }
}

class program419
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        String sRet = StringX.Trim(str);

        System.out.println("Updated string is : " + sRet);
        System.out.println("Length of updated string is : " + sRet.length());
    }
}
