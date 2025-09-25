/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program257.java
//
//  Description : Find maximum element in an array using separate class for business logic.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

// Business logic class
class ArrayLogic
{
    public int Maximum(int[] arr)
    {
        int iMax = arr[0];

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > iMax)
            {
                iMax = arr[i];
            }
        }
        return iMax;
    }

    public void Display(int[] arr)
    {
        System.out.println("Elements of the array are : ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}

public class Program257
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int iLength = sobj.nextInt();

        int[] ptr = new int[iLength];

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
