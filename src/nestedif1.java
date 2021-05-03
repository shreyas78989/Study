class nestedif1
{
    public static void main(String args[])
    {
        int age=20;
        int weight=80;
        if (age>18)
        {
            if (weight>50)
            {
                System.out.println("You are eligible for blood donation");
            }
            else
            {
                System.out.println("You are not eligible");
            }

        }
        else
        {
            System.out.println("Your age must be greater than 18");
        }
    }
}