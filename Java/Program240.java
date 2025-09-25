/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program240.java
//
//  Description : Turns OFF the 3rd and 6th bits of a given number.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Bitwise
{
    public int OffBitMultiple(int iNo)
    {
        int iMask1 = 1 << 3;    // 3rd bit mask
        int iMask2 = 1 << 6;    // 6th bit mask

        iMask1 = ~iMask1;       // Invert mask to turn off
        iMask2 = ~iMask2;

        int iResult = iNo & iMask1; // Turn off 3rd bit
        iResult = iResult & iMask2; // Turn off 6th bit

        return iResult;
    }
}

public class Program240
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        Bitwise bobj = new Bitwise();

        System.out.println("Enter number : ");
        int iValue = sobj.nextInt();

        int iRet = bobj.OffBitMultiple(iValue);

        System.out.println("Updated number is : " + iRet);

        sobj.close();
    }
}
