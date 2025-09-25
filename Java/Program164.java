/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program164.java
//  Description :   Accept a string input from the user (name), display it,
//                  and print the length of the string.
//
//  Input Demo  : 
//      Enter your name : Shardul
//      Output        : Your name is : Shardul
//                      String length is : 7
//
//  Author      :   Shardul Tapkire
//  Date        :   22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program164
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = sobj.nextLine();

        System.out.println("Your name is : " + name);

        System.out.println("String length is : " + name.length());
    }
}
