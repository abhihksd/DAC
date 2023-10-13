package people;

public class Student {
	int sid;
	String name;
	float percent;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String name, float percent) {
		super();
		this.sid = sid;
		this.name = name;
		this.percent = percent;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+name+" Rollno: "+sid+" Percent: "+percent;
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
	public float getPercent() {
		return percent;
	}
	public void setPercent(float percent) {
		this.percent = percent;
	}
	
	

}
