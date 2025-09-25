/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program258.java
//
//  Description : Find maximum element in a generic array using separate class for business logic.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

// Business logic class with generic method
class ArrayLogic
{
    public <T extends Comparable<T>> T Maximum(T[] arr)
    {
        T iMax = arr[0];

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i].compareTo(iMax) > 0)
            {
                iMax = arr[i];
            }
        }
        return iMax;
    }

    public <T> void Display(T[] arr)
    {
        System.out.println("Elements of the array are : ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}

public class Program258
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int iLength = sobj.nextInt();

        Integer[] ptr = new Integer[iLength];

        System.out.println("Enter the elements : ");
        for(int i = 0; i < iLength; i++)
        {
            ptr[i] = sobj.nextInt();
        }

        // Create object of business logic class
        ArrayLogic logic = new ArrayLogic();

        logic.Display(ptr);

        int iRet = logic.Maximum(ptr);

        System.out.println("Maximum element is : " + iRet);

        sobj.close();
    }
}
