/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program353.java
//
//  Description : Recursive program to display "Jay Ganesh..." 3 times with a counter.
//                Demonstrates recursion with static-like variable and prints "End of main" at the end.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Program353
{
    private static int i = 1;  // static variable to preserve value across recursion

    public static void Display()
    {
        if(i <= 3)
        {
            System.out.println("Jay Ganesh... : " + i);
            i++;
            Display();
        }
    }

    public static void main(String[] args)
    {
        Display();
        System.out.println("End of main");
    }
}
