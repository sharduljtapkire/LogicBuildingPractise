/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program355.java
//
//  Description : Program to calculate the addition of first 5 natural numbers
//                using recursion and static variables.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Program355
{
    static int i = 1;
    static int iSum = 0;

    public static int Addition()
    {
        if(i <= 5)
        {
            iSum = iSum + i;
            i++;
            Addition();
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
