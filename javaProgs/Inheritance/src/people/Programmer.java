package people;
import people.Emp;
import interfaces.ITraveller;
public class Programmer extends Emp implements ITraveller{
	private int  extra_hours;
	private int charges_per_hours;
	private int daysTravelled;
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
	
	public Programmer(String name, int dd, int mm, int yy, int empid, double salary, int extra_hours,
			int charges_per_hours, int daysTravelled) {
		super(name, dd, mm, yy, empid, salary);
		this.extra_hours = extra_hours;
		this.charges_per_hours = charges_per_hours;
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
	public double calSal() {
		return salary+ extra_hours*charges_per_hours;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
