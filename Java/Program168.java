/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program168.java
//  Description :   Accept a string input from the user, convert it into a 
//                  character array, and display each character on a new line.
//
//  Input Demo  : 
//      Enter String : Shardul
//      Output        : S
//                      h
//                      a
//                      r
//                      d
//                      u
//                      l
//
//  Author      :   Shardul Tapkire
//  Date        :   22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program168
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iCnt = 0;

        System.out.println("Enter String : ");
        String name = sobj.nextLine();

        char Arr[] = name.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}
