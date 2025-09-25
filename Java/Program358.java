/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program358.java
//
//  Description : Program to calculate factorial of a given number using 
//                recursion and static-like variables.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Program358
{
    static int i = 1;
    static int iFact = 1;

    public static int Factorial(int iNo)
    {
        if(i <= iNo)
        {
            iFact = iFact * i;
            i++;
            Factorial(iNo);
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
