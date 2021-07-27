class obj
{
    int id;
    String name;

    void insertRecord(int i, String n)
    {
        id = i;
        name = n;
    }
    void displayData()
    {
        System.out.println(id+" "+name);
    }
}
class Student
{
    public static void main(String args[])
    {
        obj s1=new obj();
        obj s2=new obj();
        s1.insertRecord(1,"Shreyas");
        s2.insertRecord(2,"Pacharne");
        s1.displayData();
        s2.displayData();
    }
}