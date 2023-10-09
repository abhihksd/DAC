package people;

public class Doctor extends Person {
	private String degree;
	private int regno;
	private double salary;
	
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Doctor(String name, int dd, int mm, int yy, String degree, int regno, double salary) {
		super(name, dd, mm, yy);
		this.degree = degree;
		this.regno = regno;
		this.salary = salary;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nDegree: "+degree+"\nRegno: "+regno+"\nSalary: "+salary;
	}
	
	

}
