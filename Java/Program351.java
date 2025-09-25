/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program351.java
//
//  Description : Recursive program to display "Jay Ganesh..." with a counter.
//                Uses static-like behavior for the counter across recursion.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Program351
{
    private static int i = 0;  // static variable to preserve value across recursion

    public static void Display()
    {
        System.out.println("Jay Ganesh... : " + i);

        i++;

        Display();
    }

    public static void main(String[] args)
    {
        Display();
    }
}
