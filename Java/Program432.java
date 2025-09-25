/////////////////////////////////////////////////////////////////////////////////
//
//  File name   : Program432.java
//
//  Description : Accepts two strings from the user and checks whether they
//                are anagrams of each other. Only lowercase letters 'a'-'z'
//                are considered. Optimization: First checks if lengths match.
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
    3. Create arrays Count1 and Count2 of size 26 to maintain frequency
    4. Traverse Arr and Brr to maintain frequencies in Count1 and Count2
    5. Compare Count1 & Count2 arrays
       - If equal return true (anagram)
       - Otherwise return false
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
            
        int Count1[] = new int[26];
        int Count2[] = new int[26];

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i]<= 'z')
            {
               Count1[Arr[i]- 'a']++;         
            }
        } 
        
        for(int i = 0; i < Brr.length; i++)
        {
            if(Brr[i] >= 'a' && Brr[i]<= 'z')
            {
               Count2[Brr[i]- 'a']++;         
            }
        } 

        for(int i = 0; i < 26; i++)
        {
            if(Count1[i] != Count2[i])
            {
                return false;
            }
        }

        return true;
    }
}

class program432
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
