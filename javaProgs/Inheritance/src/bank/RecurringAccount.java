package bank;

public class RecurringAccount extends Account {
	private double installment;

	public RecurringAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecurringAccount(int acco, String name, double balance, double installment) {
		super(acco, name, balance);
		this.installment = installment;
	}
	public void withdraw(double amt)
	{
		System.out.println("Withdrawl not allowed ");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nInstallment: "+installment;
	}
	public double getBalance()
	{
		return balance-installment;
	}
	

}
