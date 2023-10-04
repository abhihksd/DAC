public class Prime
{
 public static void main(String args[])
	{
  		int n=10;int cnt=0;
  		boolean flag=true;
		while(n<100)
		{
			for(int i=2;i<n/2;i++)
			{
				if(n%i==0)
				flag=false;
			}
		if(flag)
		{
			System.out.println(n);cnt++;
		}flag=true;
                n++;
		}
System.out.println("Number of prime: "+cnt);
	}
}