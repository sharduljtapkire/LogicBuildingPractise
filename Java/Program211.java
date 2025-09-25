/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program211.java
//
//  Description : Demonstrates finding the maximum of three numbers.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class Numbers
{
    public int Maximum(int No1, int No2, int No3)
    {
        if((No1 > No2) && (No1 > No3))
        {
            return No1;
        }
        else if((No2 > No1) && (No2 > No3))
        {
            return No2;
        }
        else
        {
            return No3;
        }
    }
}

public class Program211
{
    public static void main(String[] args)
    {
        Numbers nobj = new Numbers();

        System.out.println("Maximum is : " + nobj.Maximum(14, 18, 11));
        System.out.println("Maximum is : " + nobj.Maximum(21, 18, 27));
    }
}
