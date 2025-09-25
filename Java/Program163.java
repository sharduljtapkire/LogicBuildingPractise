/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program163.java
//  Description :   Accept a string input from the user (name) and display it.
//
//  Input Demo  : 
//      Enter your name : Shardul
//      Output        : Your name is : Shardul
//
//  Author      :   Shardul Tapkire
//  Date        :   22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program163
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = sobj.nextLine();

        System.out.println("Your name is : " + name);
    }
}
