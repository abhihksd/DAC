package people;

public class Customer {
	private String emailid;
	private String address;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String emailid, String address) {
		super();
		this.emailid = emailid;
		this.address = address;
	}
	public float giveDiscount(float price)
	{
		return price;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nEmail: "+emailid+"\nAddress: "+address;
	}
	
	
}
