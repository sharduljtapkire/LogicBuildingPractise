///////////////////////////////////////////////////////
//
//  File name   :   program40.java
//  Descreption :   Check Whether Number Is Prime Or Not
//  Author      :   Shardul Tapkire
//  Date        :   20/05/2025
//
///////////////////////////////////////////////////////

import java.util.Scanner;

class Factors
{
    boolean CheckPrime(int iNo)
    {
        int iCnt = 0;
        boolean bFlag = true;
    
        if(iNo < 0)     // Updator
        {   iNo = -iNo; }

        for(iCnt = 2; iCnt <= iNo/2 ; iCnt++)
        {
            if((iNo % iCnt == 0))
            {
                bFlag = false;
                break;
            }
        }
        return bFlag;
}
}
class Program40
{
    public static void main(String A[])
    {
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();         
        
        Factors fobj = new Factors();
        bRet = fobj.CheckPrime(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+" is prime number\n");
        }
        else
        {
            System.out.println(iValue+" is not  prime number\n");
        }
    }
}