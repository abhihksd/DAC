package people;

public abstract class Emp extends Person {
	private int empid;
	protected double salary;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String name, int dd, int mm, int yy, int empid, double salary) {
		super(name, dd, mm, yy);
		this.empid = empid;
		this.salary = salary;
	}
	public String toString()
	{
		return super.toString()+"\nEmpid: "+ empid+"\nSalary :"+salary;
	}
	public abstract double calSal();

}
