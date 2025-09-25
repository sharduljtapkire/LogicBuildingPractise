/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program234.java
//
//  Description : Checks whether the bit at a given position of a number is ON.
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
        int iMask = 1;
        iMask = iMask << (iPos - 1);
        int iResult = iNo & iMask;

        return (iResult == iMask);
    }
}

public class Program234
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
