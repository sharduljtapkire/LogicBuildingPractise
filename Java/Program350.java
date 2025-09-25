/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program350.java
//
//  Description : Recursive program to display "Jay Ganesh..." with a counter.
//                Logic includes local counter increment (resets every call).
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Program350
{
    public static void Display()
    {
        int i = 0;

        System.out.println("Jay Ganesh... : " + i);

        i++;

        Display();
    }

    public static void main(String[] args)
    {
        Display();
    }
}
