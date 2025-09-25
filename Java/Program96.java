/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   program96.java
//  Descreption :   to print the Array Elements           
//  Author      :   Shardul Tapkire
//  Date        :   17/07/2025
//
///////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

class Program96
{
    public static void main(String A[])
    {
        int[] Arr = new int[5];
        int iCnt = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The Elements :");
        for(iCnt = 0 ; iCnt < 5 ; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

       System.out.println("Elements from the array are :");

        for(iCnt = 0 ; iCnt < 5 ; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
        
        
    }
}