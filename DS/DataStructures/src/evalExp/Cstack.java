package evalExp;

public class Cstack {
	int size;
	int top;
	int arr[];
	public Cstack()
	{
		size=3;
		top=-1;
		arr=new int[size];
	}
	public Cstack(int size)
	{
		this.size=size;
		top=-1;
		arr=new int[size];
	}
	public boolean isEmpty() 
	{
		if(top==-1)
			return true;
		return false;
	}
	public boolean isFull()
	{
		if(top==size-1)
		{
			return true;
		}
		return false;
		
	}
	
	public void push(int num)
	{
		if(isFull())
		{
			System.out.println("Stack is full");
		}
		else
		{
			arr[++top]=num;
			
		}
	}
	public int pop()
	{
		if(isEmpty())
		{
		 return -999;
		}
		else
		{
			return arr[top--];
		}
	}
	public int peek()
	{
		if(top==-1)
		{
		 return -999;
		}
		else
		{
			return arr[top];
		}
	}
	public void display()
	{
		int temp=top;
		while(temp>-1)
		{
			System.out.println(arr[temp--]);
			
		}
	}

}
