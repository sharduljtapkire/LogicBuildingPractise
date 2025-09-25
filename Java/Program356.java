/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program356.java
//
//  Description : Program to calculate factorial of 5 using recursion 
//                and static variables.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Program356
{
    static int i = 1;
    static int iFact = 1;

    public static int Factorial()
    {
        if(i <= 5)
        {
            iFact = iFact * i;
            i++;
            Factorial();
        }

        return iFact;
    }

    public static void main(String[] args)
    {
        int iRet = 0;

        iRet = Factorial();

        System.out.println("Factorial is : " + iRet);
    }
}
