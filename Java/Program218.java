/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program218.java
//
//  Description : Demonstrates generic array display using a separate business class.
//                Includes "freeing" the array (setting to null + garbage collection).
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

// Business logic class
class ArrayOperations<T>
{
    private T[] Arr;

    public ArrayOperations(T[] array)
    {
        this.Arr = array;
    }

    public void Display()
    {
        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }

    // Simulate free()
    public void Free()
    {
        Arr = null;         // Allow GC to reclaim memory
        System.gc();        // Suggest garbage collection
        System.out.println("Array memory has been freed.");
    }
}

public class Program218
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int Size = sobj.nextInt();

        // Using Integer[] for generics
        Integer[] arr = new Integer[Size];

        System.out.println("Enter the elements : ");
        for(int i = 0; i < Size; i++)
        {
            arr[i] = sobj.nextInt();
        }

        // Business logic object
        ArrayOperations<Integer> obj = new ArrayOperations<>(arr);

        // Display array
        obj.Display();

        // Free array
        obj.Free();

        sobj.close();
    }
}
