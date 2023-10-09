package people;
import people.Emp;
public class Programmer extends Emp {
	private int  extra_hours;
	private int charges_per_hours;
	public Programmer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Programmer(String name, int dd, int mm, int yy, int empid, double salary, int extra_hours,
			int charges_per_hours) {
		super(name, dd, mm, yy, empid, salary);
		this.extra_hours = extra_hours;
		this.charges_per_hours = charges_per_hours;
	}
	public double calSal() {
		return salary+ extra_hours*charges_per_hours;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
