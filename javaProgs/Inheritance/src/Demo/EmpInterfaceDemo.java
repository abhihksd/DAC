package Demo;
import interfaces.ITraveller;
import people.*;
public class EmpInterfaceDemo  {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp [] allemps=new Emp[3];
		
		allemps[0]=new SalesManager("Abhi",12,12,2012,1001,10000,5000,10000,30);
		allemps[1]=new Programmer("NOTAbhi",12,1,2000,1002,20000,30,500,5);
		allemps[2]=new Admin("WhoAbhi",1,1,2000,1003,5000,500);
		
		//System.out.println(((ITraveller)allemps[0]).calculateTA());
		
		for(Emp e :allemps)
		{
			if(e instanceof ITraveller)
			{
				System.out.print(e.getEmpid()+"|");
				if(e instanceof SalesManager)
				{
					System.out.print(((SalesManager)e).getDaysTravelled()+"|");
				}
				if(e instanceof Programmer)
				{
					System.out.print(((Programmer)e).getDaysTravelled()+"|");
				}
				System.out.print(((ITraveller)e).calculateTA());
				
			}
			System.out.println();
//			else
//			{
//				System.out.println(e);
//			}
		}
		
	}

}
