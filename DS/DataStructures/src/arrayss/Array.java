package arrayss;

public class Array {
	int [] arr1;
	int [] arr2;
	public Array()
	{
		arr1=new int[0];
		arr2=new int[0];
	}
	public Array(int[] arr1,int[] arr2)
	{
		this.arr1=arr1;
		this.arr2=arr2;
	}
	public void display()
	{
		System.out.println("The first array is: ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		System.out.println("The second array is: ");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
	}
	

}
