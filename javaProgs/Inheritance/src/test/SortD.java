package test;

public class SortD {
public static void main(String [] args)
{
	int [] arr= {1,2,3,4,5};
	for(int i=0;i<arr.length;i++)
	System.out.print(arr[i]);
	System.out.println();
	sort(arr);
	
	}
public static void sort(int [] arr)
{

    for (int i = 0; i < arr.length - 1; i++)  
    {  
        int index = i;  
        for (int j = i + 1; j < arr.length; j++){  
            if (arr[j] >arr[index]){  
                index = j; 
            }  
        }  
        int smallerNumber = arr[index];   
        arr[index] = arr[i];  
        arr[i] = smallerNumber;  
    }  
  
	for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]);
}
}
