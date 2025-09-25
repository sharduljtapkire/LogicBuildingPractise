/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program241.java
//
//  Description : Turns OFF the 3rd and 6th bits of a given number using a single mask.
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
        int iMask1 = 1 << 3;  // 3rd bit mask
        int iMask2 = 1 << 6;  // 6th bit mask

        int iCombinedMask = ~(iMask1 | iMask2); // Invert combined mask to turn bits OFF

        int iResult = iNo & iCombinedMask;      // Apply mask

        return iResult;
    }
}

public class Program241
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
