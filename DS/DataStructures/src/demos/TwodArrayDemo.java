package demos;

import _2darray.TwodArray;

public class TwodArrayDemo {

	public static void main(String[] args) {
		TwodArray t1=new TwodArray();
		int [][] ar= {{1,2,3},{4,5,6},{7,8,9}};
		int [] [] res;
		System.out.println("Normal Array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(ar[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
		res=t1.transpose(ar);
		System.out.println("After transpose :");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(res[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}
