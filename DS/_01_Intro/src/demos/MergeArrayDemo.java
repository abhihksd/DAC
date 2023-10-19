package demos;
import _01_Intro.MergeArray;
public class MergeArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeArray m=new MergeArray();
		int [ ] arr=m.merge();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
