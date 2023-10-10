package utility;

import interfaces.IntOperation;

public class MyNumber implements IntOperation {

	@Override
	public boolean isOdd(int num) {
		// TODO Auto-generated method stub
		if(num%2==0)
			return false;
		return true;
	}

	@Override
	public boolean isEven(int num) {
		// TODO Auto-generated method stub
		if(num%2==0)
			return true;
		return false;
	}

	@Override
	public boolean isPrime(int num) {
		// TODO Auto-generated method stub
		boolean flag=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{	flag=false;
			break;
			}
		}
		if(flag==true)
			return true;
		
		return false;
	}

	@Override
	public double calFactorial(int num) {
		// TODO Auto-generated method stub
		int fact=1;
		for(int i=2;i<=num;i++)
		{
			fact*=i;
			
		}
		return fact;
	}

}
