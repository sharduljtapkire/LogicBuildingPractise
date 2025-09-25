/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program434.java
//
//  Description : Accepts two strings from the user and checks whether they
//                are anagrams of each other. Only lowercase letters 'a'-'z'
//                are considered. Optimized by using a single frequency array.
//
//  Author      : Shardul Tapkire
//  Date        : 24/09/2025
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

/*
    Steps:
    1. Check if lengths of str1 and str2 are equal. If not, return false.
    2. Convert str1 and str2 to char arrays (Arr and Brr)
    3. Create a single array Count of size 26
    4. Traverse both arrays simultaneously:
       - Increment Count[Arr[i]-'a'] for str1
       - Decrement Count[Brr[i]-'a'] for str2
    5. If Count array has all zeros, strings are anagrams; otherwise, not
*/

class Marvellous
{
    public static boolean CheckAnagram(String str1, String str2)
    {
        if(str1.length() != str2.length())
        {
            return false;
        }

        char Arr[] = str1.toCharArray();
        char Brr[] = str2.toCharArray();
            
        int Count[] = new int[26];

        // Update count array simultaneously
        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
               Count[Arr[i] - 'a']++;         
            }

            if(Brr[i] >= 'a' && Brr[i] <= 'z')
            {
               Count[Brr[i] - 'a']--;         
            }
        } 

        // Check if all counts are zero
        for(int i = 0; i < 26; i++)
        {
            if(Count[i] != 0)
            {
                return false;
            }
        }

        return true;
    }
}

class program434
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first string : ");
        String str1 = sobj.nextLine();

        System.out.println("Enter the second string : ");
        String str2 = sobj.nextLine();

        boolean bRet = Marvellous.CheckAnagram(str1, str2);

        if(bRet)
        {
            System.out.println("Strings are anagram");
        }
        else
        {
            System.out.println("Strings are not anagram");
        }
    }
}
