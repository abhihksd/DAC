package dynamicQ;

public class Node {
	int data;
	Node next;
	public Node()
	{
		data=0;
		next=null;
	}
	public Node(int d)
	{
		data=d;
		next=null;
	}
	public String toString()
	{
		return "["+data+"]";
	}
	

}
