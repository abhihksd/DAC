package Demo;



import interfaces.Comparer;
import people.Student;
import utility.NameCompare;
import utility.PercentCompare;
import utility.RollCompare;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student [] students= {new Student(100,"Abhi",80.1f),
				new Student(103,"zbhi",80.4f),
				new Student(106,"Dbhi",50),
				new Student(110,"Ebhi",90),
				new Student(104,"Cbhi",85)};
		System.out.println("Displaying studetns");
		for(Student s:students)
		{
			System.out.println(s);
		}
		Comparer c=new RollCompare();
		Comparer n=new NameCompare();
		Comparer p= new PercentCompare();
//		for(int i=0;i<students.length-1;i++)
//		{
//			for(int j=i+1;j<students.length;j++)
//			{
//				if(c.compare(students[i], students[j])>0)
//				{
//					Student tempStudent=students[i];
//					students[i]=students[j];
//					students[j]=tempStudent;
//				}
//			}
//			
//		}
//		System.out.println("Student detials after sorting???");
//		for(Student s:students)
//		{
//			System.out.println(s);
//		}
//		
		for(int i=0;i<students.length-1;i++)
		{
			for(int j=i+1;j<students.length;j++)
			{
				if(p.compare(students[i], students[j])>0)
				{
					Student tempStudent=students[i];
					students[i]=students[j];
					students[j]=tempStudent;
				}
			}
			
		}
		System.out.println("Student detials after sorting???");
		for(Student s:students)
		{
			System.out.println(s);
		}
		

	}

}
