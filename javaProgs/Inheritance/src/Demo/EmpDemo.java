package Demo;
import people.*;
public class EmpDemo {
	public static void main(String [] args) {
		// TODO Auto-generated method stub
		//Emp e1=new Emp("Abhi",12,12,2012,1001,10000);
		//System.out.println(e1);
		Emp [] emps=new Emp[3];
		emps[0]=new SalesManager("Abhi2",12,12,2012,1002,20000,1000,25);
		emps[1]=new Programmer("Abhi",12,12,2012,1001,10000,30,1000);
		emps[2]=new Admin("Abhi",12,12,2012,1001,10000,1000);
		for(Emp e: emps)
		{
			System.out.println(e.calSal());
		}

	}

}
