package _2darray;

public class TwodArray {
	private int [][] res;
	
	public TwodArray()
	{
	 res=new int[3][3];	
	}
	
	public int[][] transpose(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				res[i][j]=arr[j][i];
			}
		}
		return res;
	}
}
