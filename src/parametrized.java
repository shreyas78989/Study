class parametrized
{
    int id;
    String name;
    parametrized(int i,String n)
    {
        id=i;
        name=n;

    }
    void display()
    {
        System.out.println(id+" "+name);
    }
    public static void main(String args[])
    {
        parametrized s1=new parametrized(1,"Shreyas");
        parametrized s2=new parametrized(2,"Pacharne");
        s1.display();
        s2.display();
    }
}