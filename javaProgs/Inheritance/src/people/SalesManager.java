package people;
import people.Emp;
import interfaces.ITraveller;
public class SalesManager extends Emp implements ITraveller{
	private double incentive;
	private double target;
	private int daysTravelled;
	
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



	public SalesManager(String name, int dd, int mm, int yy, int empid, double salary, double incentive, double target,
			int daysTravelled) {
		super(name, dd, mm, yy, empid, salary);
		this.incentive = incentive;
		this.target = target;
		this.daysTravelled = daysTravelled;
	}
	

	public int getDaysTravelled() {
		return daysTravelled;
	}

	@Override
	public double calculateTA() {
		// TODO Auto-generated method stub
		return salary+ daysTravelled*(salary*DA/100);
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
