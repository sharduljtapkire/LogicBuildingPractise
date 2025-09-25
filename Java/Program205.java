/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program205.java
//
//  Description : Demonstrates addition of two numbers using a separate class.
//                Equivalent to the given C++ program.
//
//  Author      : Shardul Tapkire
//  Date        : 22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Arithmetic
{
    public int Addition(int No1, int No2)
    {
        int Ans = No1 + No2;
        return Ans;
    }
}

public class Program205
{
    public static void main(String[] args)
    {
        Arithmetic aobj = new Arithmetic();  

        int Ret = aobj.Addition(10, 11);      

        System.out.println("Addition is : " + Ret);
    }
}
