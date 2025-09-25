/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program131.java
//  Description :   Accept a string from the user and count the capital (uppercase)
//                  letters in the string.
//  Author      :   Shardul Tapkire
//  Date        :   04/08/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
    public int CountCapital(String Arr)
    {
        int iCnt = 0, iCount = 0;

        for(iCnt = 0; iCnt < Arr.length(); iCnt++)
        {
            char ch = Arr.charAt(iCnt); 
            
            if(ch >= 'A' && ch <= 'Z')  
            {
                iCount++;
            }
        }

        return iCount;
    }
}

class Program131
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String :");
        String Str = sobj.nextLine();

        StringX sxobj = new StringX();
        int iRet = sxobj.CountCapital(Str);  // call the correct method

        System.out.println("Number of Capital Letters : " + iRet);

        sobj.close();
    }
}
