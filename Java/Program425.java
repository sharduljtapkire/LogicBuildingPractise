/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program425.java
//
//  Description : Accepts a string from the user and counts the frequency of 
//                characters 'a', 'b', and 'c' using an integer array to store counts.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class program425
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        int i = 0;
        int Count[] = {0, 0, 0};  // Count[0] -> 'a', Count[1] -> 'b', Count[2] -> 'c'

        char Arr[] = str.toCharArray();
    
        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == 'a')
            {
                Count[0]++;
            }
            else if(Arr[i] == 'b')
            {
                Count[1]++;
            }
            else if(Arr[i] == 'c')
            {
                Count[2]++;
            }
        } 

        System.out.println("Frequency of a : " + Count[0]);
        System.out.println("Frequency of b : " + Count[1]);
        System.out.println("Frequency of c : " + Count[2]);
    }
}
