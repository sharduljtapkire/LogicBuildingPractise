/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program522.java
//
//  Description : Array class to accept, display, and sort elements using 
//                Bubble Sort and Efficient Bubble Sort. Shows array state after each pass.
//
//  Author      : Shardul Tapkire
//  Date        : 27/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class ArrayX
{
    public int[] Arr;
    public int iSize;
    public boolean Sorted;

    public ArrayX(int no)
    {
        iSize = no;
        Arr = new int[iSize];
        Sorted = true;
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter " + iSize + " elements : ");

        for(int i = 0; i < iSize; i++)
        {
            System.out.println("Enter the element no : " + (i + 1));
            Arr[i] = sobj.nextInt();

            if((i > 0) && (Sorted == true))
            {
                if(Arr[i] < Arr[i - 1])
                {
                    Sorted = false;
                }
            }
        }
    }

    public void Display()
    {
        System.out.println("Elements of the array are : ");

        for(int i = 0; i < iSize; i++)
        {
            System.out.print(Arr[i] + "\t");
        }

        System.out.println();
    }

    public void BubbleSort()
    {
        if(Sorted == true)
        {
            return;
        }

        int temp = 0;

        for(int i = 0; i < iSize; i++)
        {
            for(int j = 0; j < iSize - 1; j++)
            {
                if(Arr[j] > Arr[j + 1])
                {
                    temp = Arr[j];
                    Arr[j] = Arr[j + 1];
                    Arr[j + 1] = temp;
                }
            }

            System.out.println("Data after Pass : " + (i + 1));
            Display();
        }
    }

    public void BubbleSortEfficient()
    {
        if(Sorted == true)
        {
            return;
        }

        int temp = 0;
        boolean bFlag = true;

        for(int i = 0; (i < iSize && bFlag == true); i++)
        {
            bFlag = false;

            for(int j = 0; j < iSize - 1 - i; j++)
            {
                if(Arr[j] > Arr[j + 1])
                {
                    temp = Arr[j];
                    Arr[j] = Arr[j + 1];
                    Arr[j + 1] = temp;

                    bFlag = true;
                }
            }

            System.out.println("Data after Pass : " + (i + 1));
            Display();
        }
    }
}

public class Program522
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int iLength = sobj.nextInt();

        ArrayX aobj = new ArrayX(iLength);

        aobj.Accept();
        aobj.Display();

        aobj.BubbleSortEfficient();

        System.out.println("Data after sorting : ");
        aobj.Display();
    }
}
