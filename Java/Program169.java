/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program169.java
//  Description :   Accept a string input from the user, count and display 
//                  the number of lowercase characters in the string.
//
//  Input Demo  : 
//      Please enter string : Shardul
//      Output                 : Number of small characters are : 6
//
//  Author      :   Shardul Tapkire
//  Date        :   22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Program169
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter string : ");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        int iCount = 0, iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                iCount++;
            }
        }

        System.out.println("Number of small characters are : " + iCount);
    }
}
