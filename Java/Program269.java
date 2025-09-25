/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program269.java
//
//  Description : Demonstrates a generic dynamic array class in Java using generics.
//                Supports accepting elements, displaying them, and finding the maximum
//                for both Integer and Double types.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class ArrayX<T extends Number & Comparable<T>>
{
    private T[] Arr;
    private int iSize;

    @SuppressWarnings("unchecked")
    public ArrayX(int iLength)
    {
        System.out.println("Inside constructor");
        if(iLength <= 0)
        {
            iLength = 5;
        }
        this.iSize = iLength;
        this.Arr = (T[]) new Number[this.iSize];
    }

    public ArrayX()
    {
        this(5);
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the elements : ");
        for(int i = 0; i < iSize; i++)
        {
            double value = sobj.nextDouble();
            Arr[i] = (T) Double.valueOf(value);
        }
    }

    public void Display()
    {
        System.out.println("Elements of the array are : ");
        for(int i = 0; i < iSize; i++)
        {
            System.out.println(Arr[i]);
        }
    }

    public T Maximum()
    {
        T iMax = Arr[0];
        for(int i = 0; i < iSize; i++)
        {
            if(Arr[i].compareTo(iMax) > 0)
            {
                iMax = Arr[i];
            }
        }
        return iMax;
    }
}

public class Program269
{
    public static void main(String[] args)
    {
        // Integer array
        ArrayX<Integer> aobj1 = new ArrayX<>(5);
        aobj1.Accept();
        aobj1.Display();
        Number iRet = aobj1.Maximum();
        System.out.println("Maximum is : " + iRet);

        System.out.println("------------------------------------------------");

        // Double array
        ArrayX<Double> aobj2 = new ArrayX<>(5);
        aobj2.Accept();
        aobj2.Display();
        Number dRet = aobj2.Maximum();
        System.out.println("Maximum is : " + dRet);
    }
}
