/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program416.java
//
//  Description : Replaces all occurrences of a specified character ('a')
//                in a string with another character ('A') using a static method.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
    // Static method to replace all occurrences of character A with character B
    public static String Replace(String str, char A, char B)
    {
        char Arr[] = str.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == A)
            {
                Arr[i] = B;
            }
        }

        return new String(Arr);
    }
}

class program416
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        // Accept string input from user
        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        // Call static Replace method
        String sRet = StringX.Replace(str,'a','A');

        System.out.println("Updated string is : " + sRet);
    }
}
