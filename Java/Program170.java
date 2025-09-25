/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program170.java
//  Description :   Accept a string input from the user, count and return 
//                  the number of lowercase characters using a separate class 
//                  and method, then display the result.
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

class MarvellousString
{
    public int CountSmall(String str)
    {
        char Arr[] = str.toCharArray();

        int iCount = 0, iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                iCount++;
            }
        }

        return iCount;
    }
}

class Program170
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter string : ");
        String str = sobj.nextLine();

        MarvellousString mobj = new MarvellousString();

        int iRet = mobj.CountSmall(str);

        System.out.println("Number of small characters are : " + iRet);
    }
}
