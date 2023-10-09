package people;
import utility.Date;
public class Person {
	private String name;
	private Date dob;
	public Person(String name, int dd,int mm,int yy) {
		this.dob=new Date(dd,mm,yy);
		this.name = name;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
		this.dob=new Date();
		this.name="NA";
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+name+"\nDOB: "+dob.toString();
	}
	
	

}
