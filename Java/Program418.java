/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program418.java
//
//  Description : Trims leading and trailing white spaces from a string
//                without using the built-in trim() method.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
    public static void Trim(String str)
    {
        int i = 0, iStart = 0, iEnd = 0;

        char Arr[] = str.toCharArray(); // Example: "   JAY GANESH   "

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

        System.out.println("iStart is : " + iStart);
        System.out.println("iEnd is : " + iEnd);

        // Print trimmed string
        for(i = iStart; i <= iEnd; i++)
        {
            System.out.print(Arr[i]);
        }
        System.out.println(); // For newline
    }
}

class program418
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        StringX.Trim(str);
    }
}
