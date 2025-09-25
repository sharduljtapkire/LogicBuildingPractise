/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program165.java
//  Description :   Accept a string input from the user and display the first 
//                  three characters using charAt() method.
//
//  Input Demo  : 
//      Enter String : Shardul
//      Output        : S
//                      h
//                      a
//
//  Author      :   Shardul Tapkire
//  Date        :   22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program165
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String name = sobj.nextLine();

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
    }
}