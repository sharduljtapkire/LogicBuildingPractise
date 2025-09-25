/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program174.java
//  Description :   Accept a string input from the user, replace all uppercase
//                  characters with '#' using a class method, and display the
//                  updated string.
//
//  Input Demo  : 
//      Input  : HeLLo
//      Output : #e##o
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

    public String UpadteString()
    {
        char Arr[] = str.toCharArray();

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                Arr[iCnt] = '#';
            }
        }

        return new String(Arr);
    }
}

class Program174
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter string : ");
        String data = sobj.nextLine();

        MarvellousString mobj = new MarvellousString(data);

        String sRet = mobj.UpadteString();

        System.out.println("Updated string is : " + sRet);
    }
}
