package datastructures;

public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] arr = { 2, 2, 4, 5, 6, 4, 6 };
		 int n=arr.length;
		  for (int i = 0; i < n; i++)
	        {
	            // Check if the picked element 
	            // is already printed
	            int j;
	            for (j = 0; j < i; j++)
	            if (arr[i] == arr[j])
	                break;
	     
	            // If not printed earlier, 
	            // then print it
	            if (i == j)
	            System.out.print( arr[i] + " ");
	        }
	        }
	}

