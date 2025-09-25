/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program212.java
//
//  Description : Demonstrates generic method to find Maximum of three numbers.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Numbers
{
    // Generic method for Maximum
    public static <T extends Comparable<T>> T Maximum(T No1, T No2, T No3)
    {
        if((No1.compareTo(No2) > 0) && (No1.compareTo(No3) > 0))
        {
            return No1;
        }
        else if((No2.compareTo(No1) > 0) && (No2.compareTo(No3) > 0))
        {
            return No2;
        }
        else
        {
            return No3;
        }
    }
}

public class Program212
{
    public static void main(String[] args)
    {
        System.out.println("Maximum is : " + Numbers.Maximum(14, 18, 11));
        System.out.println("Maximum is : " + Numbers.Maximum(21, 18, 27));
        System.out.println("Maximum is : " + Numbers.Maximum(21.89, 18.90, 27.45));
    }
}
