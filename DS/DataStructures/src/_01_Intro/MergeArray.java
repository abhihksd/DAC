package _01_Intro;

public class MergeArray {
	public int[] merge()
	{
		
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {6,7,8,9,10};
		int arr[]=new int[arr1.length+arr2.length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				arr[j]=arr1[j];
			}
			for(int k=0;k<arr2.length;k++)
			{
				arr[arr1.length+k]=arr2[k];
			}
			
		}
		return arr;
	}
}
