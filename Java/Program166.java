/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program166.java
//  Description :   Accept a string input from the user and display each 
//                  character of the string on a new line using a loop.
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

class Program166
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iCnt = 0;

        System.out.println("Enter String : ");
        String name = sobj.nextLine();

        for(iCnt = 0; iCnt < name.length(); iCnt++)
        {   
            System.out.println(name.charAt(iCnt));
        }
    }
}
