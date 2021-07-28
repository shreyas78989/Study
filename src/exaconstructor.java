class exaconstructor
{
    int id;
    String name;

    void display()
    {
        System.out.println(id+" "+name);
    }
    public static void main(String args[])
    {
        exaconstructor s1=new exaconstructor();
        exaconstructor s2=new exaconstructor();
        s1.display();
        s2.display();
    }
}