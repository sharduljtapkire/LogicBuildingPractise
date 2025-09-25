/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program362.java
//
//  Description : Program to calculate factorial of a given number using 
//                recursion with static-like variable and iNo-1 logic.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Program362
{
    static int iFact = 1;

    public static int Factorial(int iNo)
    {
        if(iNo > 1)
        {
            iFact = iFact * iNo;
            Factorial(iNo - 1);
        }

        return iFact;
    }

    public static void main(String[] args)
    {
        int iRet = 0;
        int iValue = 4;

        iRet = Factorial(iValue);

        System.out.println("Factorial is : " + iRet);
    }
}
