package circularq;

public class CQueue {
	private int size;
	private int front;
	private int rear;
	private int arr[];
	public CQueue()
	{
		size=3;
		front=rear=-1;
		arr=new int[3];
	}
	public CQueue(int s)
	{
		size=s;
		front=rear=-1;
		arr=new int[size];
	}
	private boolean isEmpty()
	{
		if(front==-1)
		{
			return true;
		}
		return false;
	}
	public boolean isFull()
	{
		if(front==(rear+1)%size)
		{
			return true;
		}
		return false;
	}
	public void enQ(int data)
	{
		if(!isFull())
		{
			if(front==-1)
				front=0;
			rear=(rear+1)%size;
			arr[rear]=data;
		}
		else
			System.out.println("Stack is full");
	}
	public int deQ()
	{
		int data=-999;
		if(!isEmpty())
		{
			data=arr[front];
			if(front==rear)
				front=rear=-1;
			else
				front=(front+1)%size;
		}
		return data;
	}
	public void display()
	{
		System.out.println("---the queue---");
		int i;
		for(i=front;i!=rear;i=(i+1)%size)
			System.out.println(arr[i]);
		System.out.println(arr[rear]);
	}

}
