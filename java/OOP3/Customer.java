public class Customer {
    String email_id;
    Address add;
    public Customer()
    {
        email_id="NA";
        add=new Address();
    }
    public Customer(String email,String city,String area,int pincode)
    {
        this.email_id=email;
        add=new Address(area,city,pincode);
    }
    public void display()
    {
        System.out.println("The details: ");
        System.out.println("Email:"+email_id);
        add.display();
    }

    
}
