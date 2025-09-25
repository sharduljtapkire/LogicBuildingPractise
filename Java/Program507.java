/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program507.java
//
//  Description : Dynamic array class with Linear and Bi-Directional Search
//                Accepts array elements with individual prompts
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
}

public class Program507
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int iLength = sobj.nextInt();

        ArrayX aobj = new ArrayX(iLength);

        aobj.Accept();
        aobj.Display();
    }
}
