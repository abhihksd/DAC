package _01_Intro;

public class BinaryToDecimal {
	private int power(int base,int index)
	{
		int pow=1;
		for(int i=0;i<index;i++)
		{
			pow=pow*base;
		}
		return pow;
	}
	public void toDecimal(int bin)
	{
		
		int mod=0,sum=0,index=0;
		while(bin>0)
		{
			mod=bin%10;
			bin=bin/10;
			if(mod==1)	
			{
			sum+=power(2,index);
			
			}index++;
			
			
		}
		System.out.println(sum);
			
	}

}
