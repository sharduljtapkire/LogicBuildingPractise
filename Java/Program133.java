/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program133.java
//  Description :   Accept a string from the user and display the number of
//                  characters in that string using the length() method.
//  Author      :   Shardul Tapkire
//  Date        :   04/08/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program133
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String Str = "";
        int iRet = 0;

        System.out.println("Enter String :");
        Str = sobj.nextLine();

        iRet = Str.length();

        System.out.println("Number Of Charcters Are :"+iRet);
    }
}