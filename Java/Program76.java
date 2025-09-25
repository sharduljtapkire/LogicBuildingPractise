/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   program76.java
//  Descreption :   to print the pattern
//  Input       :   4   4
//
//  Output      :   A   B   C   D
//                  E   F   G   H
//                  I   J   K   L
//                  M   N   O   P
//           
//  Author      :   Shardul Tapkire
//  Date        :   17/07/2025
//
///////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char ch = 'A';

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++, ch++)
            {
                System.out.print(ch+"\t");
            }
            System.out.println();
        }
    }
}


class Program76
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter number of rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue1, iValue2);
    }
}