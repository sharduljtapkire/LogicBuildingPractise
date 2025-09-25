/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program135.java
//  Description :   Accept a string from the user and count the number of
//                  capital and small characters in it using character checks.
//  Author      :   Shardul Tapkire
//  Date        :   04/08/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
    public void CountCapitalSmall(String Arr)
    {
        int iCountCap = 0, iCountSmall = 0;

        if (Arr == null)
        {
            System.out.println("Invalid input.");
            return -1;
        }

        for (int iCnt = 0; iCnt < Arr.length(); iCnt++)
        {
            char ch = Arr.charAt(iCnt);

            if (ch >= 'a' && ch <= 'z')
            {
                iCountSmall++;
            }
            else
            {
                iCountCap++;
            }
        }

        System.out.println("Number of capital characters are: " + iCountCap);
        System.out.println("Number of small characters are  : " + iCountSmall);
    }
}

class Program135
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String :");
        String Str = sobj.nextLine();

        StringX sxobj = new StringX();
        sxobj.CountCapitalSmall(Str);
    }
}
