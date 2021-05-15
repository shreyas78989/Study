class factorial
{
    public static void main(String[] args)
    {
        int i,fact=1;
        int numb=5;
        for (i=1;i<=numb;i++)
        {
            fact=fact*i;
        }
        System.out.println("the factorial of "+numb+" is "+fact);
    }
}