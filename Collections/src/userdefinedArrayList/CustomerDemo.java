package userdefinedArrayList;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;

import userdefinedArrayList.Customer;
public class CustomerDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Customer> CustList=new ArrayList<>();
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter name email and phone:");
			CustList.add(i, new Customer(sc.next(),sc.next(),sc.nextInt()));
		}
		for(Customer c:CustList)
		{
			System.out.println(c);
		}
			
		ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("customer.txt"));
		for(Customer c:CustList)
		{
			os.writeObject(c);
		}
		os.close();
			
		

	}

}
