class armstrongnum
{
    public static void main(String[] args)
    {
        int a,c=0,temp;
        int num=153;
        temp=num;
        while (num>0)
        {
           a=num%10;
            num=num/10;
            c=c+(a*a*a);
        }
        if (temp==c)
        {
            System.out.println("This is armstrong number");
        }
        else
        {
            System.out.println("This is not armstrong number");
        }
    }
}