///////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   program56.java
//  Descreption :   to print the pattern
//  Input       :   4
//  Output      :   1   2   3   4
//  Author      :   Shardul Tapkire
//  Date        :   13/06/2025
//
///////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Patterns
{
    void Display(int iNo)
    {
        int iCnt = 0 ;

        if(iNo < 0)         //updator
        {
            iNo = -iNo;
        } 

        for(iCnt = 1 ; iCnt <= iNo ; iCnt++)
        {
            System.out.print("\t"+iCnt);
        }
        System.out.println("");
    }
}

class Program56
{
    public static void main(String A[])
    {
        int iValue = 0 ;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The Frequency :");
        iValue = sobj.nextInt();

        Patterns pobj = new Patterns();
        pobj.Display(iValue);
    }
}