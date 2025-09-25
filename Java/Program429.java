/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program429.java
//
//  Description : Accepts a string from the user and counts the frequency of 
//                all lowercase letters 'a' to 'z'. It displays only those 
//                letters that appear at least once.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class program429
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
            // Count only lowercase letters
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                Count[Arr[i] - 'a']++;         
            }
        } 

        // Display frequency of letters that occur at least once
        for(int i = 0; i < 26; i++)
        {
            if(Count[i] != 0)
            {
                System.out.println("Frequency of " + (char)(i + 'a') + " is : " + Count[i]);
            }
        }
    }
}
