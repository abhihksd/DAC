package _01_Intro;

import java.util.Scanner;

public class Assignment1 {

	public static void isPrime()
	{
		boolean flag=true;
		for(int i=2;i<=100;i++)
		{
			flag=true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println(i);
			}
		}
		
		
	}
	public static void main(String[] args) {
		System.out.println("Prime number from 1-100");
		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
		//isPrime();
		System.out.println("1st 10 prime num: ");
	//	rangedPrime();
		System.out.println("Enter range for fibonnaci series");
		int range=sc.nextInt();
		fib(range);
		
		
	}
	
	public static void rangedPrime()
	{
		int cnt=0,no=2;
		boolean flag;
		while(cnt<10)
		{
			flag=true;
			for(int i=2;i<=no/2;i++)
			{
				if(no%i==0)
				{
					flag=false;
					break;
				}
					
			}
			if(flag)
			{
				System.out.println(no);
				cnt++;
				
			}
			no++;
		}
	}
	public static void fib(int range)
	{
		int a=0,b=1,c;
		for(int i=0;i<range;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}

}
