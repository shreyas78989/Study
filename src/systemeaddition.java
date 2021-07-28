import java.util.Scanner;
class evenodd
{
    public static void main(String args[]) {
        Scanner Scan1 = new Scanner(System.in);
        System.out.println("Enter your 1st number");
        int num1 = Scan1.nextInt();
        Scanner Scan2 = new Scanner(System.in);
        System.out.println("Enter your 2nd number");
        int num2 = Scan2.nextInt();
        int ans = num1 + num2;
        System.out.println("Addition of 2 numbers is :"+ans);


    }
}