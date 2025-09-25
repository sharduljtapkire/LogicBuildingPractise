///////////////////////////////////////////////////////////////////////////////////
//
//  File name   :   program45.java
//  Descreption :   to extract and print individual digits from number 
//  Author      :   Shardul Tapkire
//  Date        :   13/06/2025
//
///////////////////////////////////////////////////////////////////////////////////

class Program45 
{
    public static void main(String A[])
    {
        int iNo = 751;
        int iDigit = 0;

        iDigit = iNo % 10;
        System.out.println("Digit is : "+iDigit);      //1
        iNo = iNo / 10;
        System.out.println("Updated iNo : "+iNo);       //75

        iDigit = iNo % 10;
        System.out.println("Digit is : "+iDigit);      //5
        iNo = iNo / 10;
        System.out.println("Updated iNo : "+iNo);      //7
              
        iDigit = iNo % 10;
        System.out.println("Digit is : "+iDigit);      //7
        iNo = iNo / 10;
        System.out.println("Updated iNo : "+iNo);     //0

    }
}