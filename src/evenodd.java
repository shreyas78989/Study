import java.util.Scanner;
class evenodd
{
    public static void main(String args[])
    {
       Scanner Scan= new Scanner(System.in);
       System.out.println("Enter your number");
       int num= Scan.nextInt();
       findEvenOdd(num);
    }
    public static void findEvenOdd(int num)
    {
        if (num%2==0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }
}