package quickSort;

public class QakSort {
	public void swap(int [] arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public int partition(int [] arr,int left,int right)
	{
		int pivot=arr[right];
		int i=left-1;
		for(int j=left;j<=right-1;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				swap(arr,i,j);
			}
		}swap(arr,i+1,right);
		
		
		return i+1;
	}
	public void sort(int [] arr,int left,int right)
	{
		int pos;
		if(left<right)
		{	
			pos=partition(arr,left,right);
			sort(arr,left,pos-1);
			sort(arr,pos+1,right);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QakSort qs=new QakSort();
		int [] arr= {8,4,1,9,3,2};
		System.out.println("Before ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		qs.sort(arr,0,arr.length-1);
		System.out.println("\nAfter: ");
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
		
		
	}

}
