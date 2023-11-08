package collection_framework_II;

import java.util.HashSet;
import java.util.Set;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> students=new HashSet<>();
		students.add(new Student(101,"Donatelo","Indore",99.9f));
		students.add(new Student(105,"Shredder","Indore",45.8f));
		students.add(new Student(102,"Rafale","Pune",88.8f));
		students.add(new Student(103,"Michaelangelo","Mumbai",77.9f));
		students.add(new Student(104,"Leonardo","Banglore",55.9f));
		for(Student s:students)
		{
			System.out.println(s);
		}
		

	}

}
