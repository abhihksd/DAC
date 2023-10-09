public class AccountDemo 
{
    public static void main(String[] args)
    {
	
        Account a1=new Account(100, 10000);
        a1.display();
	System.out.println("Updating the interest rate to 4.5");
	Account.updateIntRate(4.5f);
        Account a2=new Account(101, 20000);
        a2.display();
        
    }
    
}
