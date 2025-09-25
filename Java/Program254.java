/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program254.java
//
//  Description : Demonstrates swap of two integers (simulating call by reference).
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

public class Program254
{
    // Swap method simulating call by reference
    public static void Swap(Number No1, Number No2)
    {
        int temp = No1.value;
        No1.value = No2.value;
        No2.value = temp;
    }

    public static void main(String[] args)
    {
        Number a = new Number(10);
        Number b = new Number(11);

        Swap(a, b);

        System.out.println("Value of a : " + a.value);
        System.out.println("Value of b : " + b.value);
    }
}
