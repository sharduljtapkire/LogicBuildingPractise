/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program184.java
//  Description :   Demonstrates single-level inheritance in Java.
//                  - Base class ArrayX handles dynamic array allocation, 
//                    input, display, and resource deallocation using finalize().
//                  - Derived class NNumberX adds functionality to count even numbers.
//                  - Main class program184 accepts array size, inputs elements, 
//                    displays them, counts even numbers, and triggers garbage collection.
//
//  Input Demo  : 
//      Enter number of elements : 5
//      Enter the elements : 10 15 20 25 30
//      Output : 
//          Allocating the resources...
//          Elements of the array are :
//          10
//          15
//          20
//          25
//          30
//          Number of even elements are : 3
//          Deallocating the resources...
//
//  Author      :   Shardul Tapkire
//  Date        :   22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

class ArrayX
{
   protected int Arr[];

    public ArrayX(int iSize)
    {
        System.out.println("Allocating the resources...");
        Arr = new int[iSize];       // Resource allocation
    }

    protected void finalize()
    {
        System.out.println("Deallocating the resources...");
        Arr = null;
    }

    public void Accept()
    {
        int iCnt = 0;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements : ");
        for(iCnt = 0; iCnt < this.Arr.length; iCnt++)
        {
            this.Arr[iCnt] = sobj.nextInt();
        }

        sobj = null;
    }

    public void Display()
    {
        int iCnt = 0;

        System.out.println("Elements of the array are : ");
        
        for(iCnt = 0; iCnt < this.Arr.length; iCnt++)
        {
            System.out.println(this.Arr[iCnt]);
        }
    }
}

class NNumberX extends ArrayX
{
    public NNumberX(int iSize)
    {
        super(iSize);
    }

    public int CountEven()
    {
        int iCoumt = 0, iCnt = 0;
        
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] % 2) == 0)
            {
                iCoumt++;
            }
        }

        return iCoumt;
    }

    // Other functions

}

class program184
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int iSize = sobj.nextInt();

        NNumberX nobj = new NNumberX(iSize);

        nobj.Accept();

        nobj.Display();

        int iRet = 0;

        iRet = nobj.CountEven();

        System.out.println("Number of even elements are : "+iRet);
        
        sobj = null;

        nobj = null;
        
        System.gc();
    }
}