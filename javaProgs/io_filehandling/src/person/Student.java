package person;

public class Student {
	int sid;
	String name;
	float marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String name, float marks) {
		super();
		this.sid = sid;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Sid: "+sid+" Name: "+name+" Marks: "+marks;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	

}
