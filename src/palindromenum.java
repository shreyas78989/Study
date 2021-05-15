import java.util.*;

class palindromenum
{
    public static void main(String[] args)
    {
        String orignal,reverse="";
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string or number: ");
        orignal=in.nextLine();
        int length=orignal.length();
        for (int i=length-1;i>=0;i--)
         reverse=reverse+orignal.charAt(i);
        if (orignal.equals(reverse))
            System.out.println("The string or number is palindrome");
        else
            System.out.println("The string or number is not palindrome");
    }
}
