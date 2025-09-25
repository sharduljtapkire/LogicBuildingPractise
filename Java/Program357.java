/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program357.java
//
//  Description : Program to calculate factorial of a given number using 
//                iteration (while loop).
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Program357
{
    public static int Factorial(int iNo)
    {
        int i = 1;
        int iFact = 1;

        while(i <= iNo)
        {
            iFact = iFact * i;
            i++;
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
