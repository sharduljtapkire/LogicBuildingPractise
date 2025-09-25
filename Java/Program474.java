/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program474.java
//
//  Description : Demonstrates basic operations on an ArrayList of Doubles.
//                Operations include adding elements, checking presence,
//                removing elements, displaying all elements, and showing 
//                the size of the ArrayList.
//
//  Example     :
//                Output:
//                [10.5, 20.5, 30.5, 40.5]
//                Element is present
//                [10.5, 20.5, 40.5]
//                Number of elements in ArrayList are : 3
//                10.5
//                20.5
//                40.5
//
//  Author      : Shardul Tapkire
//  Date        : 25/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Program474
{
    public static void main(String A[])
    {
        // Create an ArrayList of Double
        ArrayList<Double> aobj = new ArrayList<Double>();

        // Adding elements
        aobj.add(10.5);
        aobj.add(20.5);
        aobj.add(30.5);
        aobj.add(40.5);

        System.out.println(aobj);

        // Check if element 20.5 is present
        if(aobj.contains(20.5))
        {
            System.out.println("Element is present");
        }

        // Remove element 30.5
        aobj.remove(30.5);

        // Display updated ArrayList
        System.out.println(aobj);

        // Display number of elements
        System.out.println("Number of elements in ArrayList are : " + aobj.size());

        // Traverse and display each element
        for(Double dvalue : aobj)
        {
            System.out.println(dvalue);
        }
    }
}
