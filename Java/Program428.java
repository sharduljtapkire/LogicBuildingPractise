/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program428.java
//
//  Description : Accepts a string from the user and counts the frequency of 
//                all lowercase letters 'a' to 'z' using an integer array.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class program428
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        int Count[] = new int[26]; // Count for 'a' to 'z'

        char Arr[] = str.toCharArray();
    
        for(int i = 0; i < Arr.length; i++)
        {
            // Increment count for lowercase letters only
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                Count[Arr[i] - 'a']++;         
            }
        } 

        // Display frequency of all letters
        for(int i = 0; i < 26; i++)
        {
            System.out.println("Frequency of " + (char)(i + 'a') + " is : " + Count[i]);
        }
    }
}
