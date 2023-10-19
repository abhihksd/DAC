package multithreadular;

public class NewString {

	public static void main(String[] args) {
		String s1=new String("Hello");
		String s2=new String("Hello");
		
		
		//this creates a string pool with the most used strings in it
		String s4="Hello";
		String s5="Hello";
		if(s4==s5)
		{
			System.out.println(" s4 and s5 are true");
		}
		//reference equality s1 and s2 refer to different object
		if(s1==s2)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		
		//when we copy the s1 to s3
		//here s3 and s1 are pointing to the same memory
		String s3=s1;
		if(s1==s3)
		{
			System.out.println("Equal");
		}
		else
			System.out.println("Not Equal");
		
		//Object equality can be checked by
		System.out.println("Check with equals() method it will check the values inside the String object");
		if(s1.equals(s2))
		{
			System.out.println("Equal");
		}
		else
			System.out.println("not equal");
		

	}

}
