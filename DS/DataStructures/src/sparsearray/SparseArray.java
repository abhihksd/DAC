package sparsearray;

public class SparseArray {
	int [][] arr= { {0,0,1,0,3},
					{0,4,0,6,0},
					{0,0,0,0,9},
					{19,0,0,0,0},
					{0,0,7,0,0}};
	int nonzero=0;
	
	public int countNonZero()
	{
		int cnt=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				if(arr[i][j]!=0)
					cnt++;
			}
		}
		
		return cnt;
		
	}
	public void sparse()
	{
		nonzero=countNonZero();
		int [][]sp=new int[nonzero+1][3];
		sp[0][0]=arr.length;
		sp[0][1]=arr[0].length;
		sp[0][2]=nonzero;
		
		int k=1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				if(arr[i][j]!=0)
				{
					sp[k][0]=i;
					sp[k][1]=j;
					sp[k][2]=arr[i][j];
					k++;
				}
				
			}
		}
		/*-----display-------*/
		for(int i=0;i<sp.length-1;i++)
		{
			for(int j=0;j<sp[0].length;j++)
			{
				System.out.print(sp[i][j]+" ");
				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		SparseArray s=new SparseArray();
		s.sparse();
	}
}
