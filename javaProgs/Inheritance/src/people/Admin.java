package people;
import people.Emp;
public class Admin extends Emp {
	private int bonus;

	public Admin(String name, int dd, int mm, int yy, int empid, double salary, int bonus) {
		super(name, dd, mm, yy, empid, salary);
		this.bonus = bonus;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public double calSal()
	{
		return salary+ bonus;
	}
	
	

}
