/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program239.java
//
//  Description : Toggles the bit at a specified position of a given number.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Bitwise
{
    public int ToggleBit(int iNo, int iPos)
    {
        int iMask = 1;
        iMask = iMask << (iPos - 1);  // Shift 1 to the desired position
        int iResult = iNo ^ iMask;    // Toggle bit at position using XOR
        return iResult;
    }
}

public class Program239
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        Bitwise bobj = new Bitwise();

        System.out.println("Enter number : ");
        int iValue = sobj.nextInt();

        System.out.println("Enter the position : ");
        int iLocation = sobj.nextInt();

        int iRet = bobj.ToggleBit(iValue, iLocation);

        System.out.println("Updated number is : " + iRet);

        sobj.close();
    }
}
