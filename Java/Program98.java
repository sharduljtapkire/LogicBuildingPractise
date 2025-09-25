/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program98.java
//  Description :   To print the Array Elements           
//  Author      :   Shardul Tapkire
//  Date        :   18/07/2025
//
///////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class ArrayProblems
{
    public void display(int[] arr, int size)
    {
        System.out.println("Elements of the array are :");
        
        for(int i = 0; i < size; i++)
        {
            System.out.println(arr[i]);
        }
    }
}

class Program98
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        int[] arr = new int[5];
        
        System.out.println("Enter the elements : ");
        for(int i = 0; i < 5; i++)
        {
            arr[i] = sobj.nextInt();
        }
        
        ArrayProblems aobj = new ArrayProblems();
        aobj.display(arr, 5);
    }
}
