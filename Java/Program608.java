/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program608.java
//  Description : Accepts two integers from the user and swaps their values 
//                using bitwise XOR operator without using a temporary variable.
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program608
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int No1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        int No2 = sobj.nextInt();

        No1 = No1 ^ No2;
        No2 = No2 ^ No1;
        No1 = No1 ^ No2;
        
        System.out.println("No1 after swapping : " + No1);
        System.out.println("No2 after swapping : " + No2);
    }
}
