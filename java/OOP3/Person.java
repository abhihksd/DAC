public class Person {
    String name;
    Date dob;
    public Person()
    {
        name=new String("NA");
        dob=new Date();
    }
    public Person(String name,int d,int m,int y)
    {
        this.name=name;
        dob=new Date(d,m,y);
    }
    public void display()
    {   
        System.out.println("Name: "+name);
        System.out.print("BirthDate: ");
        dob.showDate();
    }
}
