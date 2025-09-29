/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program598.java
//  Description : Accepts an IP address as four integer inputs and displays it 
//                in standard dotted format.
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program598
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter IP address : ");
        int No1 = sobj.nextInt();
        int No2 = sobj.nextInt();
        int No3 = sobj.nextInt();
        int No4 = sobj.nextInt();
        
        System.out.println(No1 + "." + No2 + "." + No3 + "." + No4);
    }
}
