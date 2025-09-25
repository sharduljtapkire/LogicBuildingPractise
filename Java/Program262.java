/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program262.java
//
//  Description : demonstrating dynamic array handling 
//                with methods to accept and display array elements.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class ArrayX {
    public int[] Arr;
    public int iSize;

    // Constructor with default size 5
    public ArrayX() {
        this(5);
    }

    // Parameterized constructor
    public ArrayX(int iLength) {
        System.out.println("Inside constructor");
        this.iSize = iLength;
        this.Arr = new int[iSize];
    }

    // Method to accept array elements
    public void Accept() {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the elements : ");
        for (int i = 0; i < iSize; i++) {
            Arr[i] = sobj.nextInt();
        }
    }

    // Method to display array elements
    public void Display() {
        System.out.println("Elements of the array are : ");
        for (int i = 0; i < iSize; i++) {
            System.out.println(Arr[i]);
        }
    }
}

public class Program262 {
    public static void main(String[] args) {
        ArrayX aobj = new ArrayX(5);

        aobj.Accept();
        aobj.Display();
    }
}
