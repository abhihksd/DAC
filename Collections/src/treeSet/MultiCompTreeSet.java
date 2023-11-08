package treeSet;

import java.util.*;

public class MultiCompTreeSet {

	public static void main(String[] args) {
		Set<Emp> emps=new TreeSet<>((o1,o2)->{
			int diff=o1.dept-o2.dept;
			if(diff==0)
			{
				if(o1.salary<o2.salary)
					diff= -1;
				else if(o1.salary>o2.salary)
					diff=1;
				else 
				{
					if(diff==0)
					{
						diff=o1.name.compareTo(o2.name);
						if(diff==0)
						{
							if(o1.empid> o2.empid)
								diff=1;
							else if(o1.empid<o2.empid)
								diff=-1;
							else
								diff=0;
						}
					}
					
				}
			}
			return diff;
		});
		emps.add(new Emp(101,"Leonardo",45000f,10));
		emps.add(new Emp(102,"Rafaile",55000f,10));
		emps.add(new Emp(103,"Michale",77000f,20));
		emps.add(new Emp(104,"Donatelo",87000f,20));
		emps.add(new Emp(105,"April",34000f,50));
		emps.add(new Emp(106,"Fred",1000f,30));
		emps.add(new Emp(107,"Barney",1000f,50));
		emps.add(new Emp(108,"Tom",500f,30));
		emps.add(new Emp(109,"Jerry",200000f,20));
		
		System.out.println(emps);
		
		

	}

}
