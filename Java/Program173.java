/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program173.java
//  Description :   Accept a string input from the user, use the MarvellousString 
//                  class from the MarvellousLB package to count the number of 
//                  lowercase characters, and display the result.
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
import MarvellousLB.MarvellousString;

class Program173
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
