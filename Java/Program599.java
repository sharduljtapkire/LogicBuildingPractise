/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program599.java
//  Description : Accepts an IP address as four integer inputs, stores them
//                in an object, and displays the IP as a single integer-like
//                representation (currently placeholder implementation).
//  Author      : Shardul Tapkire
//  Date        : 29/09/2025
//
/////////////////////////////////////////////////////////////////////////////

import java.util.*;

class IPForming
{
    public int A, B, C, D;

    public IPForming(int a, int b, int c, int d)
    {
        A = a;
        B = b;
        C = c;
        D = d;
    }

    public int FormIP()
    {
        // Placeholder: Currently returns 0
        return 0;
    }
}

class Program599
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter IP address : ");
        int No1 = sobj.nextInt();
        int No2 = sobj.nextInt();
        int No3 = sobj.nextInt();
        int No4 = sobj.nextInt();
        
        IPForming iobj = new IPForming(No1, No2, No3, No4);

        int iRet = iobj.FormIP();

        System.out.println("Formed number contains IP address is : " + iRet);
    }
}
