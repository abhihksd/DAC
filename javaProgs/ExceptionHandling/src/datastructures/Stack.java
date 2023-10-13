package datastructures;

import exceptions.StackOverFlowException;
import exceptions.StackUnderFlowException;

public class Stack {
	int [] arr;
	int size;
	int top;
	Stack()
	{
		size=0;
		arr=new int[size];
		top=-1;
	}
	
	public Stack(int[] arr, int size) {
		this.arr=new int[size];
		for(int i=0;i<size;i++)
		this.arr[i] = arr[i];
		this.size = size;
		this.top = size-1;
	}

	public void push(int a) throws StackOverFlowException
	{
		if(top<size)
		{
			arr[++top]=a;
		}
		else {
			throw new StackOverFlowException();
		}
	}
	public int pop() throws StackUnderFlowException
	{
		if(top==-1)
		{
			throw new StackUnderFlowException();
		}
	return arr[top--];
	}
	public void display()
	{
		for(int i=top-1;i>-1;i--)
		{
			System.out.println(arr[i]);
			
		}
	}

}
