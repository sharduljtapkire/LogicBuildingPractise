/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program270.java
//
//  Description : Demonstrates a generic dynamic array class in Java using generics.
//                Supports accepting elements, displaying them, and finding the maximum
//                for Integer and Double arrays.
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
    private Scanner sobj;

    @SuppressWarnings("unchecked")
    public ArrayX(int iLength)
    {
        System.out.println("Inside constructor");
        if(iLength <= 0)
        {
            iLength = 5;
        }
        iSize = iLength;
        // Generic array creation workaround
        Arr = (T[]) new Number[iSize];
        sobj = new Scanner(System.in);
    }

    public ArrayX()
    {
        this(5);
    }

    // Accept elements for Integer array
    public void AcceptInteger()
    {
        System.out.println("Enter the elements (Integer) : ");
        for(int i = 0; i < iSize; i++)
        {
            Integer val = sobj.nextInt();
            Arr[i] = (T) val;
        }
    }

    // Accept elements for Double array
    public void AcceptDouble()
    {
        System.out.println("Enter the elements (Double) : ");
        for(int i = 0; i < iSize; i++)
        {
            Double val = sobj.nextDouble();
            Arr[i] = (T) val;
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

public class Program270
{
    public static void main(String[] args)
    {
        // Integer array
        ArrayX<Integer> aobj1 = new ArrayX<>(7);
        aobj1.AcceptInteger();
        aobj1.Display();
        int iRet = aobj1.Maximum();
        System.out.println("Maximum is : " + iRet);

        System.out.println("------------------------------------------------");

        // Double array
        ArrayX<Double> aobj2 = new ArrayX<>(4);
        aobj2.AcceptDouble();
        aobj2.Display();
        double dRet = aobj2.Maximum();
        System.out.println("Maximum is : " + dRet);
    }
}
