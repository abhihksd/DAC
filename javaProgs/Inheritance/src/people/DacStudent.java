package people;

import utility.Course;

public class DacStudent extends Person {
	Course course;
	String PRN;
	transient int age;
	public DacStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DacStudent(String name, int dd, int mm, int yy,int cid, String co,double fees, String pRN) {
		super(name, dd, mm, yy);
		this.course = new Course(cid,co,fees);
		PRN = pRN;
		
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public String getPRN() {
		return PRN;
	}
	public void setPRN(String pRN) {
		PRN = pRN;
	}
	public int getAge() {
		return 2023-super.getYear();
		
	}
	public void setAge(int age) {
		
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" PRN :"+PRN;
	}
	

}
