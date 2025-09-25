/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program259.java
//
//  Description : Find maximum element in a Float array.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

// Business logic class
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

public class Program259
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int iLength = sobj.nextInt();

        Float[] ptr = new Float[iLength];

        System.out.println("Enter the elements : ");
        for(int i = 0; i < iLength; i++)
        {
            ptr[i] = sobj.nextFloat();
        }

        // Create object of business logic class
        ArrayLogic logic = new ArrayLogic();

        logic.Display(ptr);

        float iRet = logic.Maximum(ptr);

        System.out.println("Maximum element is : " + iRet);

        sobj.close();
    }
}
