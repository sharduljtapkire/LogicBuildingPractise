/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program268.java
//
//  Description : Demonstrates a generic dynamic array class in Java using generics.
//                Supports accepting elements, displaying them, and finding the maximum.
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

    // Accept elements from user
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the elements : ");
        for(int i = 0; i < iSize; i++)
        {
            double value = sobj.nextDouble(); // read input as double
            Arr[i] = (T) Double.valueOf(value); // cast to generic type
        }
    }

    // Display elements
    public void Display()
    {
        System.out.println("Elements of the array are : ");
        for(int i = 0; i < iSize; i++)
        {
            System.out.println(Arr[i]);
        }
    }

    // Return maximum element
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

public class Program268
{
    public static void main(String[] args)
    {
        ArrayX<Integer> aobj1 = new ArrayX<>(5);

        aobj1.Accept();
        aobj1.Display();

        Number iRet = aobj1.Maximum(); // Returns Number type
        System.out.println("Maximum is : " + iRet);
    }
}
