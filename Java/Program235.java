/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program235.java
//
//  Description : Checks whether the bit at a given position of a number is ON,
//                with validation for invalid bit positions.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Bitwise
{
    public boolean CheckBit(int iNo, int iPos)
    {
        if(iPos <= 0 || iPos > 32)
        {
            System.out.println("Invalid bit position");
            return false;
        }

        int iMask = 1 << (iPos - 1);
        int iResult = iNo & iMask;

        return (iResult == iMask);
    }
}

public class Program235
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        Bitwise bobj = new Bitwise();

        System.out.println("Enter number : ");
        int iValue = sobj.nextInt();

        System.out.println("Enter the position : ");
        int iLocation = sobj.nextInt();

        boolean bRet = bobj.CheckBit(iValue, iLocation);

        if(bRet)
        {
            System.out.println("Bit is ON at location " + iLocation);
        }
        else
        {
            System.out.println("Bit is OFF at location " + iLocation);
        }

        sobj.close();
    }
}
