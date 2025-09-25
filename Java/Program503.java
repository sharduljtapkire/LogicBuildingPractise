/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program503.java
//
//  Description : Dynamic array class with Accept and Display methods
//
//  Author      : Shardul Tapkire
//  Date        : 25/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class ArrayX
{
    public int[] Arr;
    public int iSize;

    public ArrayX(int no)
    {
        iSize = no;
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the elements : ");

        for(int i = 0; i < iSize; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elements of the array are : ");

        for(int i = 0; i < iSize; i++)
        {
            System.out.print(Arr[i] + "\t");
        }
        System.out.println();
    }
}

public class Program503
{
    public static void main(String[] args)
    {
        ArrayX aobj = new ArrayX(5);

        aobj.Accept();

        aobj.Display();
    }
}
