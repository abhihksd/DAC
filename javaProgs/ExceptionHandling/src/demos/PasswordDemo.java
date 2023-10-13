package demos;

import java.util.Scanner;
import exceptions.PasswordTooLongException;
import exceptions.PasswordTooShortException;
public class PasswordDemo {

	public static void main(String[] args) {
		System.out.println("Enter the password");
		Scanner sc=new Scanner(System.in);
		String pwd;
		pwd=sc.next();
		try {
			if(pwd.length()>=8 )
			{
				if(pwd.length()<=12)
				System.out.println("Valid");
				else
					throw new PasswordTooLongException();
			}
			else
			{
				throw new PasswordTooShortException();
			}
		}catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
