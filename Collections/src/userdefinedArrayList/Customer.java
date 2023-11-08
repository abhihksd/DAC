package userdefinedArrayList;

import java.io.Serializable;

public class Customer implements Serializable {
	String name;
	String email;
	double phoneno;
	
	public Customer() {
		name="NA";
		email="NA";
		phoneno=0;
	}
	public Customer(String name, String email, double phoneno) {
		super();
		this.name = name;
		this.email = email;
		this.phoneno = phoneno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(double phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", phoneno=" + phoneno + " ";
	}
}
class RegCust extends Customer{
		int regno;
		public RegCust()
		{
			super();
			regno=0;
			
		}
		public RegCust(String name, String email, double phoneno, int regno) {
			super(name, email, phoneno);
			this.regno = regno;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString()+ regno+" ]";
		}
		
		
		
		
	
}
