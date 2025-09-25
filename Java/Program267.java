/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program267.java
//
//  Description : Demonstrates a generic dynamic array class in Java with methods
//                to accept elements, display elements, and find the maximum value.
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

    // Constructor with default size 5
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

    // Accept array elements from user
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the elements : ");
        for(int i = 0; i < iSize; i++)
        {
            // Accept input as double and cast to T
            double value = sobj.nextDouble();
            Arr[i] = (T) Double.valueOf(value);
        }
    }

    // Display array elements
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

public class Program267
{
    public static void main(String[] args)
    {
        ArrayX<Double> aobj = new ArrayX<>(5);

        aobj.Accept();
        aobj.Display();

        Double iRet = aobj.Maximum();
        System.out.println("Maximum is : " + iRet);
    }
}
