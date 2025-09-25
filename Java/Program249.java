/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program249.java
//
//  Description : Adds two numbers using a separate class method.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Arithmetic
{
    public int Addition(int No1, int No2)
    {
        return No1 + No2;
    }
}

public class Program249
{
    public static void main(String[] args)
    {
        int a = 10, b = 11;

        Arithmetic obj = new Arithmetic();
        int Ret = obj.Addition(a, b);

        System.out.println("Addition is : " + Ret);
    }
}
