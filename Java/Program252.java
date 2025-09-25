/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program252.java
//
//  Description : Demonstrates call by reference using a swap method with objects.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Number
{
    int value;

    Number(int value)
    {
        this.value = value;
    }
}

class SwapDemo
{
    // Swap using objects (simulating call by reference)
    public static void Swap(Number No1, Number No2)
    {
        int temp = No1.value;
        No1.value = No2.value;
        No2.value = temp;
    }
}

public class Program252
{
    public static void main(String[] args)
    {
        Number a = new Number(10);
        Number b = new Number(11);

        SwapDemo.Swap(a, b);

        System.out.println("Value of a : " + a.value);
        System.out.println("Value of b : " + b.value);
    }
}
