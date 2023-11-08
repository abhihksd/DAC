package userdefinedArrayList;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class RegCustDemo {

	public static void main(String[] args) throws Exception{
		List<Customer> list=new ArrayList<>();
		list.add(new RegCust("Abhi","Abhi@gmail.com",912405674,100));
		list.add(new RegCust("NotAbhi","NotAbhi@gmail.com",91111111,101));
		list.add(new RegCust("StillNotAbhi","StillNotAbhi@gmail.com",922222,102));
		list.add(new Customer("ISITNotAbhi","ISITNotAbhi@gmail.com",9333333));
		
		for(Customer c: list)
			System.out.println(c);
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("customerlist.txt"));
	}

}
