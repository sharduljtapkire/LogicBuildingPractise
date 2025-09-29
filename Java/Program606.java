/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program606.java
//  Description : Accepts an integer from the user and determines whether it 
//                is odd or even using bitwise AND operator.
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program606
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int No = sobj.nextInt();

        if ((No & 1) == 1)
        {
            System.out.println("Number is odd");
        }
        else
        {
            System.out.println("Number is even");
        }
    }
}
