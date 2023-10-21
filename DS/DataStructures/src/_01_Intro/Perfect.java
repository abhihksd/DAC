package _01_Intro;

public class Perfect {

	//perfect number is when its divisor sum is the num itself
	public void isperfect(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
				sum+=i;
		}
		if(sum==num)
		{
			System.out.println(num+" is a perfect number.");
		}
	}

}
