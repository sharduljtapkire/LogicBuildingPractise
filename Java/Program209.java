/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program209.java
//
//  Description : Demonstrates addition of numbers using Java Generics.
//                Works for Integer, Float, Double (similar to C++ templates)
//
//  Author      : Shardul Tapkire
//  Date        : 22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Arithmetic<T extends Number>
{
    public double Addition(T No1, T No2)
    {
        return No1.doubleValue() + No2.doubleValue();
    }
}

public class Program209
{
    public static void main(String[] args)
    {
        Arithmetic<Integer> intObj = new Arithmetic<>();
        Arithmetic<Float> floatObj = new Arithmetic<>();
        Arithmetic<Double> doubleObj = new Arithmetic<>();

        System.out.println(intObj.Addition(10, 11));          // Integer addition
        System.out.println(floatObj.Addition(10.90f, 11.70f)); // Float addition
        System.out.println(doubleObj.Addition(10.70, 11.60));  // Double addition
    }
}
