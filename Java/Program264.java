/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program264.java
//
//  Description : Demonstrates dynamic array handling using a class with constructor.
//                Shows proper encapsulation, safe input and display of array elements.
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class ArrayX {
    private int[] Arr;
    private int iSize;

    // Constructor with specified size
    public ArrayX(int iLength) {
        System.out.println("Inside constructor");
        if (iLength <= 0) {
            iLength = 5; // default size
        }
        this.iSize = iLength;
        this.Arr = new int[this.iSize];
    }

    // Default constructor
    public ArrayX() {
        this(5);
    }

    // Accept array elements from user
    public void Accept() {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the elements : ");
        for (int i = 0; i < iSize; i++) {
            Arr[i] = sobj.nextInt();
        }
    }

    // Display array elements
    public void Display() {
        System.out.println("Elements of the array are : ");
        for (int i = 0; i < iSize; i++) {
            System.out.println(Arr[i]);
        }
    }
}

public class Program264 {
    public static void main(String[] args) {
        ArrayX aobj = new ArrayX(5);

        aobj.Accept();
        aobj.Display();
    }
}
