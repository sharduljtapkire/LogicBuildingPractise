/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program360.java
//
//  Description : Program to calculate factorial of a given number using 
//                recursion with static-like variable and post-decrement logic.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Program360
{
    static int iFact = 1;

    public static int Factorial(int iNo)
    {
        if(iNo > 1)
        {
            iFact = iFact * iNo;
            Factorial(iNo--);
        }

        return iFact;
    }

    public static void main(String[] args)
    {
        int iRet = 0;
        int iValue = 6;

        iRet = Factorial(iValue);

        System.out.println("Factorial is : " + iRet);
    }
}
