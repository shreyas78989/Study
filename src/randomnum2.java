class randomnum2
{
    public static void main(String[] args)
    {
        int max=900;
        int min=100;
        System.out.println("The random number between "+min+" and "+max+" is: ");
        int a=(int)(Math.random()*(max-min+1)+min);
        System.out.println(a);
    }
}