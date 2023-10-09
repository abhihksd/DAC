 class Account 
{
    private int accno;
    private double balance;
    private static float int_rate;
    static
    {
     int_rate=3.14f;
    }
    public static void updateIntRate(float new_rate)
    {
      int_rate=new_rate;
	
    }
    public double getIntRate()
    {
	return (balance*(int_rate/100));
    }
    public Account()
    {
        accno=0;
        balance=0;
    }
    public Account(int accno,double balance)
    {
        this.accno=accno;
        this.balance=balance;
    }
    public void display()
    {
        System.out.println("Account number: "+accno+"\n Balance: "+balance);
	System.out.println("Updated Balance: "+balance+getIntRate());
    }
}
