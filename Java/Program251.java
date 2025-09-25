/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program251.java
//
//  Description : Demonstrates call by value using a swap method.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class SwapDemo
{
    // Call by value swap
    public static void Swap(int No1, int No2)
    {
        int temp = 0;

        temp = No1;
        No1 = No2;
        No2 = temp;
    }
}

public class Program251
{
    public static void main(String[] args)
    {
        int a = 10, b = 11;

        SwapDemo.Swap(a, b);

        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);
    }
}
