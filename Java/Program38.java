///////////////////////////////////////////////////////
//
//  File name   :   program38.java
//  Descreption :   Summation  Of Factors
//  Author      :   Shardul Tapkire
//  Date        :   20/05/2025
//
///////////////////////////////////////////////////////

import java.util.Scanner;

class Factors
{
    int SumFactors(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        if(iNo < 0)     // Updator
        {   
            iNo = -iNo; 
        }

        for(iCnt = 1; iCnt <= iNo/2 ; iCnt++)
        {
            if((iNo % iCnt == 0))
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    }
}

class Program38
{
    public static void main(String A[])
    {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();         
        
        Factors fobj = new Factors();
        iRet = fobj.SumFactors(iValue);

        System.out.println("Sumation OF Factors : "+iRet);
    }
}