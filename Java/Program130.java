/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program130.java
//  Description :   Accept a string from the user and calculate the length
//                  of the string using a user-defined method (StrlenX).
//  Author      :   Shardul Tapkire
//  Date        :   04/08/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class StringX
{
    public int StrlenX(String Arr)
    {
        int iCnt = 0 , iCount = 0;

        for(iCnt = 0 ; iCnt < Arr.length() ; iCnt++)
        {
            iCount++;
        }

        return iCount;
    }
}
class Program130
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String :");
        String Str = sobj.nextLine();

        StringX sxobj = new StringX();
        int iRet = sxobj.StrlenX(Str);

        System.out.println("Length Of String Is :"+iRet);
    }
}