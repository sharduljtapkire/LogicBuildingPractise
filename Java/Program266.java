/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program266.java
//
//  Description : Demonstrates a dynamic float array class in Java with methods
//                to accept elements, display elements, and find the maximum value.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class ArrayX
{
    private float[] Arr;
    private int iSize;

    // Constructor with default size 5
    public ArrayX(int iLength)
    {
        System.out.println("Inside constructor");
        if(iLength <= 0)
        {
            iLength = 5;
        }
        this.iSize = iLength;
        this.Arr = new float[this.iSize];
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
            Arr[i] = sobj.nextFloat();
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
    public float Maximum()
    {
        float iMax = Arr[0];
        for(int i = 0; i < iSize; i++)
        {
            if(Arr[i] > iMax)
            {
                iMax = Arr[i];
            }
        }
        return iMax;
    }
}

public class Program266
{
    public static void main(String[] args)
    {
        ArrayX aobj = new ArrayX(5);

        aobj.Accept();
        aobj.Display();

        float iRet = aobj.Maximum();
        System.out.println("Maximum is : " + iRet);
    }
}
