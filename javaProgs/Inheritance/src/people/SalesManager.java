package people;
import people.Emp;
public class SalesManager extends Emp{
	private double incentive;
	private double target;
	
	public SalesManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalesManager(String name, int dd, int mm, int yy, int empid, double salary, double incentive,
			double target) {
		super(name, dd, mm, yy, empid, salary);
		this.incentive = incentive;
		this.target = target;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public double calSal()
	{
		return salary+ incentive;
	}
	
}
