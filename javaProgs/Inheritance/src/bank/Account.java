package bank;
//Create class Account having data members as acco, name and balance. 
public abstract class Account {
 private int acco;
 private String name;
 protected double balance;
public Account() {
	super();
	// TODO Auto-generated constructor stub
}
public Account(int acco, String name, double balance) {
	super();
	this.acco = acco;
	this.name = name;
	this.balance = balance;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Accno: "+acco+"\nName: "+name+"\nBalance: "+balance;
}
public abstract void withdraw(double amt);
public abstract double getBalance();
 
}
