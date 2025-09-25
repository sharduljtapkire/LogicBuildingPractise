/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program255.java
//
//  Description : Demonstrates generic swap method using separate class for logic.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

// Business logic class
class SwapLogic
{
    // Generic method to swap values using wrapper objects
    public static <T> void Swap(Wrapper<T> No1, Wrapper<T> No2)
    {
        T temp = No1.value;
        No1.value = No2.value;
        No2.value = temp;
    }
}

// Wrapper class to simulate call by reference
class Wrapper<T>
{
    public T value;

    Wrapper(T value)
    {
        this.value = value;
    }
}

public class Program255
{
    public static void main(String[] args)
    {
        // Swapping integers
        Wrapper<Integer> a = new Wrapper<>(10);
        Wrapper<Integer> b = new Wrapper<>(11);

        System.out.println("Value of a before swap : " + a.value);
        System.out.println("Value of b before swap : " + b.value);
        SwapLogic.Swap(a, b);
        System.out.println("Value of a after swap : " + a.value);
        System.out.println("Value of b after swap : " + b.value);

        // Swapping characters
        Wrapper<Character> x = new Wrapper<>('A');
        Wrapper<Character> y = new Wrapper<>('B');

        System.out.println("Value of x before swap : " + x.value);
        System.out.println("Value of y before swap : " + y.value);
        SwapLogic.Swap(x, y);
        System.out.println("Value of x after swap : " + x.value);
        System.out.println("Value of y after swap : " + y.value);
    }
}
