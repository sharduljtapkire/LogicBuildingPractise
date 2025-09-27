/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program515.java
//
//  Description : Array class with Linear, Bi-Directional, Binary (Inc/Dec) and Efficient Binary searches
//                Efficient binary search falls back to linear search if array is not sorted in increasing order
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

    public boolean LinearSearch(int no)
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

    public boolean BiDirectionalSearch(int no)
    {
        boolean bFlag = false;

        for(int iStart = 0, iEnd = iSize - 1; iStart <= iEnd; iStart++, iEnd--)
        {
            if(Arr[iStart] == no || Arr[iEnd] == no)
            {
                bFlag = true;
                break;
            }
        }

        return bFlag;
    }

    public boolean BinarySearchInc(int no)
    {
        int iStart = 0, iEnd = iSize - 1, iMid;
        boolean bFlag = false;

        while(iStart <= iEnd)
        {
            iMid = iStart + ((iEnd - iStart) / 2);

            if(Arr[iMid] == no)
            {
                bFlag = true;
                break;
            }
            else if(no < Arr[iMid])
            {
                iEnd = iMid - 1;
            }
            else
            {
                iStart = iMid + 1;
            }
        }

        return bFlag;
    }

    public boolean BinarySearchDec(int no)
    {
        int iStart = 0, iEnd = iSize - 1, iMid;
        boolean bFlag = false;

        while(iStart <= iEnd)
        {
            iMid = iStart + ((iEnd - iStart) / 2);

            if(Arr[iMid] == no)
            {
                bFlag = true;
                break;
            }
            else if(no > Arr[iMid])
            {
                iEnd = iMid - 1;
            }
            else
            {
                iStart = iMid + 1;
            }
        }

        return bFlag;
    }

    public boolean BinarySearchEfficientInc(int no)
    {
        boolean bFlag = false;

        if(!CheckSortedInc())
        {
            System.out.println("Data is not sorted");
            return LinearSearch(no); // fallback to linear search
        }

        int iStart = 0, iEnd = iSize - 1, iMid;

        while(iStart <= iEnd)
        {
            iMid = iStart + ((iEnd - iStart) / 2);

            if((Arr[iMid] == no) || (Arr[iStart] == no) || (Arr[iEnd] == no))
            {
                bFlag = true;
                break;
            }
            else if(no < Arr[iMid])
            {
                iEnd = iMid - 1;
            }
            else
            {
                iStart = iMid + 1;
            }
        }

        return bFlag;
    }

    public boolean BinarySearchEfficientDec(int no)
    {
        int iStart = 0, iEnd = iSize - 1, iMid;
        boolean bFlag = false;

        while(iStart <= iEnd)
        {
            iMid = iStart + ((iEnd - iStart) / 2);

            if((Arr[iMid] == no) || (Arr[iStart] == no) || (Arr[iEnd] == no))
            {
                bFlag = true;
                break;
            }
            else if(no > Arr[iMid])
            {
                iEnd = iMid - 1;
            }
            else
            {
                iStart = iMid + 1;
            }
        }

        return bFlag;
    }

    public boolean CheckSortedInc()
    {
        boolean bFlag = true;

        for(int i = 0; i < iSize - 1; i++)
        {
            if(Arr[i] > Arr[i + 1])
            {
                bFlag = false;
                break;
            }
        }

        return bFlag;
    }

    public boolean CheckSortedDec()
    {
        boolean bFlag = true;

        for(int i = 0; i < iSize - 1; i++)
        {
            if(Arr[i] < Arr[i + 1])
            {
                bFlag = false;
                break;
            }
        }

        return bFlag;
    }
}

public class Program515
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

        boolean bRet = aobj.BinarySearchEfficientInc(iValue);

        if(bRet == true)
        {
            System.out.println("Element is present");
        }
        else
        {
            System.out.println("Element is not present");
        }
    }
}
