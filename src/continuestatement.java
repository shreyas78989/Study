class continuestatement
{
    public static void main(String[] args)
    {
        int i,j;
        for (i=1;i<=4;i++)
        {
            for (j=1;j<=4;j++)
            {
                if (i == 2 && j == 2) {
                    continue;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}