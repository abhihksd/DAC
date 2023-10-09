package Demo;

import people.*;

public class CustomerDemo extends Customer {
	public static void main(String[] args) {
		Customer c1=new Customer("a@gmail.com","Pune");
		System.out.println(c1.giveDiscount(1000));
		Customer c2=new ReCustomer("b@gmail.com","PUNE");
		System.out.println(c2.giveDiscount(2000));
		
		System.out.println(c1+"\n"+c2);
	}

}
