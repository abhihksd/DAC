package apps;
import office.staff.*;
import office.utility.*;
public class PersonDemo {

	public static void main(String[] args) {
		Person p1=new Person();
		Date d1=new Date();
		p1.setId(100);
		p1.setName("Abhi");
		d1.setDd(1);
		d1.setMm(1);
		d1.setYy(2012);
		p1.display();
		d1.display();
	

	}

}
