package apps;

public class Test {

	public static void main(String[] args) {
		int [] arr= {1,2,4,5,4};
		int key=4;
		Test t1=new Test();
		System.out.println(t1.find(arr, key));
		System.out.println(t1.find(arr, 6));
		
		
	}
	public int find(int [] arr,int key)
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]==key)
			{
				return i;
			}
		}
		return -1;
	}

}
