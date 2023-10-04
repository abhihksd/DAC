class Assign4{
public static void main(String args[])
	{
		int num=2536;
		int sum=0,rem=0;
			while(num>0 || sum>9 )
			{
  				if(num==0)
				{
					num=sum;
					sum=0;
				}
				rem=num%10;
				num=num/10;
				sum+=rem;
			}
                
	System.out.println(sum);
	}}