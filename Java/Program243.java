/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program243.java
//
//  Description : Turns OFF two bits of a given number at user-specified positions.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Bitwise
{
    public int OffBitMultiple(int iNo, int iPos1, int iPos2)
    {
        int iMask1 = 1 << (iPos1 - 1);  // Mask for first position
        int iMask2 = 1 << (iPos2 - 1);  // Mask for second position

        iMask1 = ~iMask1;  // Invert mask to turn OFF the bit
        iMask2 = ~iMask2;

        int iMask = iMask1 & iMask2;  // Combine masks
        int iResult = iNo & iMask;    // Apply mask to number

        return iResult;
    }
}

public class Program243
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        Bitwise bobj = new Bitwise();

        System.out.println("Enter number : ");
        int iValue = sobj.nextInt();

        System.out.println("Enter first position : ");
        int iLocation1 = sobj.nextInt();

        System.out.println("Enter second position : ");
        int iLocation2 = sobj.nextInt();

        int iRet = bobj.OffBitMultiple(iValue, iLocation1, iLocation2);

        System.out.println("Updated number is : " + iRet);

        sobj.close();
    }
}
