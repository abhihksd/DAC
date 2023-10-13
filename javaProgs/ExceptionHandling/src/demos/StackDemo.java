package demos;

import datastructures.Stack;
import exceptions.StackOverFlowException;
import exceptions.StackUnderFlowException;

public class StackDemo {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3 };
		Stack s = new Stack(arr, arr.length);
		s.display();
		
		try {
			s.pop();
			s.pop();
			s.pop();
			s.pop();
			
			s.push(5);
		}
		catch(StackOverFlowException e)
		{
			System.out.print(e.getMessage());
		}
		catch(StackUnderFlowException e)
		{
			System.out.println(e.getMessage());
		}

	}
}
