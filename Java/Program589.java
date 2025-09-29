/////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program589.java
//  Description : Demonstrates integer overflow in Java
//  Author      : Shardul Tapkire
//  Date        : 28/09/2025
//
/////////////////////////////////////////////////////////////////////////////

class IntegerOverflow
{
    public void demonstrateOverflow()
    {
        int no = Integer.MAX_VALUE;

        System.out.println("Initial value of no : " + no);

        no++;  // This will cause overflow

        System.out.println("Value after increment : " + no);
    }
}

public class Program589
{
    public static void main(String[] args)
    {
        IntegerOverflow obj = new IntegerOverflow();
        obj.demonstrateOverflow();
    }
}
