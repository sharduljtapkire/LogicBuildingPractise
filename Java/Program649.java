/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program649.java
//  Description : Demonstration of Java's built-in LinkedList class
//                Performing basic operations like add and display.
//  Author      : Shardul Tapkire
//  Date        : 01/10/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program649
{
    public static void main(String A[])
    {
        LinkedList<Integer> lobj = new LinkedList<Integer>();

        lobj.add(10);
        lobj.add(20);
        lobj.add(30);
        lobj.add(40);
        
        System.out.println("Data from LL is : " + lobj);
    }
}
