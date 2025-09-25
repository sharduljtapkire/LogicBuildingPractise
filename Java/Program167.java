/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program167.java
//  Description :   Accept a string input from the user, convert it into a 
//                  character array, display the array, and print its length.
//
//  Input Demo  : 
//      Enter String : Shardul
//      Output        : Shardul
//                      7
//
//  Author      :   Shardul Tapkire
//  Date        :   22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program167
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iCnt = 0;

        System.out.println("Enter String : ");
        String name = sobj.nextLine();

        char Arr[] = name.toCharArray();

        System.out.println(Arr);

        System.out.println(Arr.length);
    }
}
