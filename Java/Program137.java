/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program137.java
//  Description :   Accept a string from the user and count the number of
//                  whitespaces.
//  Author      :   Shardul Tapkire
//  Date        :   22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
    public int CountSpaces(String Arr)
    {
        int iCount = 0;

        if (Arr == null)
        {
            System.out.println("Invalid input.");
            return -1;
        }

        for (int iCnt = 0; iCnt < Arr.length(); iCnt++)
        {
            char ch = Arr.charAt(iCnt);

            if (ch == ' ')
            {
                iCount++;
            }
        }

        return iCount++;    
    }
}

class Program137
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String :");
        String Str = sobj.nextLine();

        StringX sxobj = new StringX();
        int iRet = sxobj.CountSpaces(Str);

        System.out.println("Number Of Whitespaces Are : "+iRet);
    }
}
