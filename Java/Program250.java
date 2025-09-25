/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program250.java
//
//  Description : Adds two numbers using a generic method.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Arithmetic
{
    // Generic method to add numbers
    public static <T extends Number> double Addition(T No1, T No2)
    {
        return No1.doubleValue() + No2.doubleValue();
    }
}

public class Program250
{
    public static void main(String[] args)
    {
        int a = 10, b = 11;
        double Ret = Arithmetic.Addition(a, b);
        System.out.println("Addition is : " + Ret);

        double x = 10.90, y = 11.70;
        double Ret2 = Arithmetic.Addition(x, y);
        System.out.println("Addition is : " + Ret2);
    }
}
