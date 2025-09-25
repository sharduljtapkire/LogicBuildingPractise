/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program172.java
//  Description :   Accept a string input from the user, initialize it via a 
//                  parameterized constructor of a class, count the number of 
//                  lowercase characters using a class method, and display the result.
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
    public String str;

    public MarvellousString(String a)
    {
        this.str = a;
    }

    public int CountSmall()
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

class Program172
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter string : ");
        String data = sobj.nextLine();

        MarvellousString mobj = new MarvellousString(data);

        int iRet = mobj.CountSmall();

        System.out.println("Number of small characters are : " + iRet);
    }
}