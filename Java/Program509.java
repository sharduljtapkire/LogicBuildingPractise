/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program509.java
//
//  Description : Array class with Linear, Bi-Directional, and Binary Search
//                Accepts array elements and searches for a value using Binary Search
//
//  Author      : Shardul Tapkire
//  Date        : 25/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class ArrayX
{
    public int[] Arr;
    public int iSize;

    public ArrayX(int no)
    {
        iSize = no;
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter " + iSize + " elements : ");

        for(int i = 0; i < iSize; i++)
        {
            System.out.println("Enter the element no : " + (i + 1));
            Arr[i] = sobj.nextInt();
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

    public boolean LinearSearch(int no)       // N
    {
        boolean bFlag = false;

        for(int i = 0; i < iSize; i++)
        {
            if(Arr[i] == no)
            {
                bFlag = true;
                break;
            }
        }
        return bFlag;
    }

    public boolean BiDirectionalSearch(int no)    // N/2
    {
        int iStart = 0;
        int iEnd = iSize - 1;
        boolean bFlag = false;

        while(iStart <= iEnd)
        {
            if(Arr[iStart] == no || Arr[iEnd] == no)
            {
                bFlag = true;
                break;
            }
            iStart++;
            iEnd--;
        }

        return bFlag;
    }

    public boolean BinarySearch(int no)
    {
        int iStart = 0;
        int iEnd = iSize - 1;
        int iMid;
        boolean bFlag = false;

        while(iStart <= iEnd)
        {
            iMid = iStart + ((iEnd - iStart) / 2);

            if(Arr[iMid] == no)
            {
                bFlag = true;
                break;
            }
            else if(no < Arr[iMid])     // First half (Left window)
            {
                iEnd = iMid - 1;
            }
            else if(no > Arr[iMid])     // Second half (Right window)
            {
                iStart = iMid + 1;
            }
        }

        return bFlag;
    }

    public boolean BinarySearchEfficient(int no)
    {
        int iStart = 0;
        int iEnd = iSize - 1;
        int iMid;
        boolean bFlag = false;

        while(iStart <= iEnd)
        {
            iMid = iStart + ((iEnd - iStart) / 2);

            if((Arr[iMid] == no) || (Arr[iStart] == no) || (Arr[iEnd] == no))    // Change
            {
                bFlag = true;
                break;
            }
            else if(no < Arr[iMid])     // First half (Left window)
            {
                iEnd = iMid - 1;
            }
            else if(no > Arr[iMid])     // Second half (Right window)
            {
                iStart = iMid + 1;
            }
        }

        return bFlag;
    }
}

public class Program509
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int iLength = sobj.nextInt();

        ArrayX aobj = new ArrayX(iLength);

        aobj.Accept();
        aobj.Display();

        System.out.println("Enter the value that you want to search : ");
        int iValue = sobj.nextInt();

        boolean bRet = aobj.BinarySearchEfficient(iValue);

        if(bRet == true)
        {
            System.out.println(iValue + " is present in the data");
        }
        else
        {
            System.out.println(iValue + " is not present in the data");
        }

        sobj.close();
    }
}
