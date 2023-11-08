package treeSet;

public class Emp {
	public int empid;
	public String name;
	public float salary;
	public int dept;
	public Emp()
	{
		name="NA";
		salary=0f;
	}
	
	public Emp(String name, float salary) {
	
		this.name = name;
		this.salary = salary;
	}

	public Emp(int empid,String name, float salary,int dept) {
		this.empid=empid;
		this.name = name;
		this.salary = salary;
		this.dept=dept;
	}
	public String toString()
	{
		return "empid->"+empid+"name->"+name+" salary->"+salary+" dept->"+dept+"\n";
	}
	
}
