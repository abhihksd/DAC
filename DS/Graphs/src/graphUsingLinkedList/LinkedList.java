package graphUsingLinkedList;

public class LinkedList {
	GraphNode head;
	public LinkedList()
	{
		head=null;
	}
	public void addBeg(int data)
	{
		GraphNode record= new GraphNode(data);
		if(head==null)
			head=record;
		else
		{
			record.next=head;
			head=record;
		}
	}
	
	public void addNode(GraphNode data)
	{
		if(head==null)
			head=data;
		else
		{
			data.next=head;
			head=data;
		}
		
	}
	public String toString()
	{
		String str="";
		GraphNode move=head;
		while(move!=null)
		{
			str+="["+move.data+"]";
			move=move.next;
		}
		return str;
	}
	
}
