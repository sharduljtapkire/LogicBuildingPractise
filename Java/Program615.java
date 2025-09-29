/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program615.java
//  Description : Accepts an integer from the user and checks whether it is 
//                a power of 2 using the efficient bitwise expression 
//                (No & (No - 1)) == 0.
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program615
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int No = sobj.nextInt();

        if ((No & (No - 1)) == 0)
        {
            System.out.println("Number is power of 2");
        }
        else
        {
            System.out.println("Number is not a power of 2");
        }
    }
}
