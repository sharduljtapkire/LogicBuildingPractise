/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program352.java
//
//  Description : Recursive program to display "Jay Ganesh..." 5 times with a counter.
//                Uses static-like behavior for the counter across recursion.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Program352
{
    private static int i = 1;  // static variable to preserve value across recursion

    public static void Display()
    {
        if(i <= 5)
        {
            System.out.println("Jay Ganesh... : " + i);
            i++;
            Display();
        }
    }

    public static void main(String[] args)
    {
        Display();
    }
}
