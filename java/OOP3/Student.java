import java.util.Scanner;
public class Student {
    int no_of_sub;
    int [] marks; 
    // public Student()
    // {
    //     no_of_sub=0;

    // }
    public Student(int nos)
    {
        no_of_sub=nos;
        marks=new int[nos];
    }
    public void setmarks()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=sc.nextInt();
        }
        sc.close();
    }
    public void display()
    {
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }

    }
    public static void main(String[] args) {
        Student s1;
        s1=new Student(3);
        s1.setmarks();
        s1.display();
    }
}
