/////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   program95.java
//  Descreption :   to print the Array Elements           
//  Author      :   Shardul Tapkire
//  Date        :   17/07/2025
//
///////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

class Program95
{
    public static void main(String A[])
    {
        int[] Arr = new int[5];
        int iCnt = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The Elements :");

        Arr[0] = sobj.nextInt();
        Arr[1] = sobj.nextInt();
        Arr[2] = sobj.nextInt();
        Arr[3] = sobj.nextInt();
        Arr[4] = sobj.nextInt();

       System.out.println("Elements from the array are :");

        for(iCnt = 0 ; iCnt < 5 ; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
        
        
    }
}