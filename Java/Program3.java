////////////////////////////////////////////////////
//
//  File name   :   program3.java
//  Description :   Used to calculate percentage
//  Author      :   Shardul Tapkire
//  Date        :   18/05/2025
//
////////////////////////////////////////////////////

class Program3
{
    public static void main(String A[])
    {
        int Total = 400;
        int Obtained = 323;
        float Percentage = 0.0f;

        Percentage = ((float)Obtained / (float) Total) * 100;

        System.out.println("Percentage is : "+Percentage);
    }
    
}