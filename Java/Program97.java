/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program97.java
//  Description :   To print the Array Elements           
//  Author      :   Shardul Tapkire
//  Date        :   17/07/2025
//
///////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class ArrayProblems  
{
    public void display(int[] arr, int iSize) 
    {
        System.out.println("Elements of the array are :");
        
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
    }
}

class Program97
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int[] arr = new int[5];
        
        System.out.println("Enter the elements : ");
        for (int i = 0; i < 5; i++) 
        {
            arr[i] = sobj.nextInt();
        }
        ArrayProblems aobj = new ArrayProblems();
        aobj.display(arr, 5);
    }
}
