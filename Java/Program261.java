/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program261.java
//
//  Description : Demonstrates default and parameterized constructors. 
//                In Java, memory deallocation is handled automatically 
//                by the garbage collector, so there is no destructor.
//                
//
//  Author      : Shardul Tapkire
//  Date        : 23/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

class ArrayX {
    public int[] Arr;
    public int iSize;

    // Default constructor
    public ArrayX() {
        System.out.println("Inside default constructor");
        this.iSize = 5;
        this.Arr = new int[iSize];
    }

    // Parameterized constructor
    public ArrayX(int iLength) {
        System.out.println("Inside parameterized constructor");
        this.iSize = iLength;
        this.Arr = new int[iSize];
    }
}

public class Program261 {
    public static void main(String[] args) {
        ArrayX aobj1 = new ArrayX();       // calls default constructor
        ArrayX aobj2 = new ArrayX(10);     // calls parameterized constructor
    }
}
