package insertionsort;

public class InsertionSort {
	public void sort(int[] arr)
	{
		int size=arr.length;
		int key,j;
		for(int i=0;i<=size-1;i++)
		{
			 key=arr[i];
			 j=i-1;
			 while(j>=0 && arr[j]>key)
			 {
				 arr[j+1]=arr[j];
				 j=j-1;
			 }
			 arr[j+1]=key;;
		}
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

}
