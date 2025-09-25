/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program136.java
//  Description :   Accept a string from the user and count the number of
//                  capital and small  and digit characters in it using character checks.
//  Author      :   Shardul Tapkire
//  Date        :   22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
    public void CountCapitalSmallDigit(String Arr)
    {
        int iCountCap = 0, iCountSmall = 0 , iCountDigit = 0;

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
            else if ((ch >= 'A') && (ch <= 'Z'))
            {
                iCountCap++;
            }
            else if ((ch >= '0') && (ch <= '9'))
            {
                iCountDigit++;
            }
        }

        System.out.println("Number of capital characters are: " + iCountCap);
        System.out.println("Number of small characters are  : " + iCountSmall);
        System.out.println("Number of digit characters are  : " + iCountDigit);
    }
}

class Program136
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String :");
        String Str = sobj.nextLine();

        StringX sxobj = new StringX();
        sxobj.CountCapitalSmallDigit(Str);
    }
}
