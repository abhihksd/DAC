package bubblesort;
public class BubbleSort {
	public void sort(int [] arr)
	{
		int size=arr.length;
		int swaps=0,passes=0;
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swaps++;
				}
			}passes++;
			for(int j=0;j<arr.length;j++)
			System.out.print(arr[j]+" ");
			System.out.println();
		}
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		System.out.println("The number of swaps Needed: "+swaps);
	}

}
