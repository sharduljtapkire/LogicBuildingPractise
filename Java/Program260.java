/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program260.java
//
//  Description : The program 
//                shows how to create a class with an integer array, 
//                initialize it in the 
//                constructor, and access the elements in the main method.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class ArrayX
{
    public int[] Arr;
    public int iSize;

    // Constructor
    public ArrayX(int iLength)
    {
        System.out.println("Inside constructor");
        iSize = iLength;
        Arr = new int[iSize];
    }
}

public class Program260
{
    public static void main(String[] args)
    {
        ArrayX aobj = new ArrayX(5);

        // Array elements can be accessed like this:
        for(int i = 0; i < aobj.iSize; i++)
        {
            aobj.Arr[i] = i + 1; // example initialization
        }

        System.out.println("Array elements are : ");
        for(int i = 0; i < aobj.iSize; i++)
        {
            System.out.println(aobj.Arr[i]);
        }
    }
}
