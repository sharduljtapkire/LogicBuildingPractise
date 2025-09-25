class Patterns
{
    void Display()
    {
        int j = 0;
        for(j = 1 ; j <= 3 ; j++)
        {
            System.out.print("*\t");
        }

        System.out.println("");

        for(j = 1 ; j <= 3 ; j++)
        {
            System.out.print("*\t");
        }

        System.out.println("");

        for(j = 1 ; j <= 3 ; j++)
        {
            System.out.print("*\t");
        }

        System.out.println("");

    }
}

class Program67
{
    public static void main(String A[]) 
    {
        Patterns pobj = new Patterns();
        pobj.Display(); 
    }
}