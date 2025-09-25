/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program354.java
//
//  Description : Program to calculate the addition of first 5 natural numbers
//                using a function and return the sum.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Program354
{
    public static int Addition()
    {
        int i = 1;
        int iSum = 0;

        while(i <= 5)
        {
            iSum = iSum + i;
            i++;
        }

        return iSum;
    }

    public static void main(String[] args)
    {
        int iRet = 0;

        iRet = Addition();

        System.out.println("Addition is : " + iRet);
    }
}
