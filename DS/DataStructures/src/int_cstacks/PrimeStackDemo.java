package int_cstacks;

public class PrimeStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cstack c=new Cstack(10);
		int i=0,num=2;
		boolean flag=true;
		while(i<10)
		{
			flag=true;
			for(int j=2;j<=num/2;j++)
			{
				if(num%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
			
				c.push(num);
				i++;
			}
			num++;
			
		}
		c.display();
		

	}

}
