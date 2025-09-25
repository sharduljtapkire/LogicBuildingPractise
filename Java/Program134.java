/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program134.java
//  Description :   Accept a string from the user and return the number of
//                  characters in the string using a user-defined method
//                  similar to strlen() in C.
//  Author      :   Shardul Tapkire
//  Date        :   04/08/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
    public int StrlenX(String Arr)
    {
        int iCount = 0, iCnt = 0;

        if(Arr == null)
        {
            return -1;
        }

        for(iCnt = 0; iCnt < Arr.length(); iCnt++)
        {
            iCount++;
        }

        return iCount;
    }
}

class Program134
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String Str = "";
        int iRet = 0;

        System.out.println("Enter String :");
        Str = sobj.nextLine();

        StringX sxobj = new StringX();
        iRet = sxobj.StrlenX(Str);

        System.out.println("Number Of Characters Are : " + iRet);
    }
}
