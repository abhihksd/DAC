package people;

public class ReCustomer extends Customer {
	private int reg_no;

	public ReCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ReCustomer(String emailid, String address) {
		super(emailid, address);
		// TODO Auto-generated constructor stub
	}

	public float giveDiscount(float price)
	{
		return price-price*0.05f;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nRegNo: "+reg_no;
	}

}
