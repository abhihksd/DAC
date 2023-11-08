package treeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Emp> emps=new TreeSet<>(new Comparator<Emp>() {

			@Override
			public int compare(Emp o1, Emp o2) {
				// TODO Auto-generated method stub
				if(o1.salary>o2.salary)
					return 1;
					else if(o1.salary<o2.salary)
						return -1;
					else if(o1.salary==o2.salary && !(o1.name.equals(o2.name))) 
						return 1;
					else return 0;
				
			}
			
		});
		
		emps.add(new Emp("Leonardo",45000f));
		emps.add(new Emp("Rafaile",55000f));
		emps.add(new Emp("Michale",77000f));
		emps.add(new Emp("Donatelo",87000f));
		emps.add(new Emp("April",34000f));
		emps.add(new Emp("Fred",1000f));
		emps.add(new Emp("Barney",1000f));
		emps.add(new Emp("Tom",500f));
		emps.add(new Emp("Jerry",200000f));
		
		
		System.out.println(emps);

	}

}
