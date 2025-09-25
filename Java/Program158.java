/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   Program158.java
//  Description :   Accept a string from user and display it in reverse
//                  simulating pointer arithmetic using char array and indexes.
//
//  Input Demo: 
//      String : Hello
//      Output : olleH
//
//  Author      :   Shardul Tapkire
//  Date        :   22/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class StringX
{
    public void ReverseDisplay(String str)
    {
        int iCount = 0;

        // Convert string to char array to simulate pointer arithmetic
        char[] arr = str.toCharArray();
        int start = 0;           // simulate 'start' pointer
        int end = 0;             // simulate 'str' pointer

        // Calculate length manually
        while (end < arr.length)
        {
            iCount++;
            end++;
        }

        end--; // move to last character

        // Display in reverse using while loop, simulating str >= start
        while (end >= start)
        {
            System.out.print(arr[end]);
            end--;
        }
        System.out.println();
    }
}

class Program158
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String Arr = sobj.nextLine();

        StringX sx = new StringX();
        sx.ReverseDisplay(Arr);
    }
}
