class Assign6
{
	public static void main(String args[])
	{
		for(int i=0;i<=5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(k+" ");
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print(l+" ");
			}
			System.out.println();
		}
	}
}