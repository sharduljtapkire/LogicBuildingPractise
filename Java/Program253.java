/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program253.java
//
//  Description : Demonstrates generic swap using objects to simulate call by reference.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Number<T>
{
    T value;

    Number(T value)
    {
        this.value = value;
    }
}

class SwapDemo
{
    // Generic Swap method using objects
    public static <T> void Swap(Number<T> No1, Number<T> No2)
    {
        T temp = No1.value;
        No1.value = No2.value;
        No2.value = temp;
    }
}

public class Program253
{
    public static void main(String[] args)
    {
        Number<Integer> a = new Number<>(10);
        Number<Integer> b = new Number<>(11);

        System.out.println("Value of a before swap : " + a.value);
        System.out.println("Value of b before swap : " + b.value);
        SwapDemo.Swap(a, b);
        System.out.println("Value of a after swap : " + a.value);
        System.out.println("Value of b after swap : " + b.value);

        Number<Character> x = new Number<>('A');
        Number<Character> y = new Number<>('B');

        System.out.println("Value of x before swap : " + x.value);
        System.out.println("Value of y before swap : " + y.value);
        SwapDemo.Swap(x, y);
        System.out.println("Value of x after swap : " + x.value);
        System.out.println("Value of y after swap : " + y.value);
    }
}
