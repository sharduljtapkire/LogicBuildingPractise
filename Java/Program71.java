///////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   program71.java
//  Descreption :   to print the pattern
//  Input       :   4   4
//  Output      :    1   2   3   4   
//                   1   2   3   4  
//                   1   2   3   4  
//                   1   2   3   4           
//  Author      :   Shardul Tapkire
//  Date        :   17/07/2025
//
///////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Patterns
{
    void Display(int iRow , int iCol)
    {
        int i = 0 , j = 0;

        for(i = 1 ; i <= iRow ; i++)
        {
            for(j = 1 ; j <= iCol ; j++)
            {
                System.out.print(i+"\t");
            }
            System.out.println("");
        }
    }
}
class Program71
{
    public static void main(String A[]) 
    {
        int iValue1 = 0 , iValue2 = 0 ;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The Number Of Rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter The Number Of Coloumns : ");
        iValue2 = sobj.nextInt();

        Patterns pobj = new Patterns();
        pobj.Display(iValue1,iValue2);     
    }
}