package collection_framework_II;

public class Student  {
	int studid;
	String name;
	String city;
	float percent;
	public Student()
	{
		studid=0;
		name="NA";
		city="NA";
		percent=0f;
	}
	public Student(int studid, String name, String city, float percentage) {
		super();
		this.studid = studid;
		this.name = name;
		this.city = city;
		this.percent = percentage;
	}
	@Override
	public String toString() {
		return "Student [studid=" + studid + ", name=" + name + ", city=" + city + ", percent=" + percent + "]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		if(city.equals("Pune"))
			return 10;
		else if(city.equalsIgnoreCase("Mumbai"))
			return 20;
		else if(city.equalsIgnoreCase("Indore"))
			return 30;
		else
			return 40;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean flag=false;
		if(obj instanceof Student)
		{
			Student s=(Student)obj;
			if(this.city.equalsIgnoreCase(s.city)&& this.studid==s.studid)
				flag=true;
			else flag=false;
			
		}
		return flag;
			
		
	}
	
	
}
