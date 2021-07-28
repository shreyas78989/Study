class constructoroverloading
{
    int id;
    String name;
    int age;
    constructoroverloading(int i,String n)
    {
        id=i;
        name=n;
    }
    constructoroverloading(int i,String n, int a)
    {
        id=i;
        name=n;
        age=a;
    }
    void display()
    {
        System.out.println(id+" "+name+" "+age);
    }
    public static void main(String args[])
    {
        constructoroverloading s1 = new constructoroverloading(1,"Shreyas",24);
        s1.display();
    }
}