package bank;

public class SavingsAccount extends Account {

	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(int acco, String name, double balance) {
		super(acco, name, balance);
		// TODO Auto-generated constructor stub
	}
	public void withdraw(double amt) {
		if(balance-amt>2000)
			balance-=amt;
		else
			System.out.println("Gareebi");
	}													

	public double getBalance()
	{
		return balance;
	}
	

}
