/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program349.java
//
//  Description : Simple recursive program to display "Jay Ganesh..." infinitely.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Program349
{
    public static void Display()
    {
        System.out.println("Jay Ganesh...");

        Display();
    }

    public static void main(String[] args)
    {
        Display();
    }
}
