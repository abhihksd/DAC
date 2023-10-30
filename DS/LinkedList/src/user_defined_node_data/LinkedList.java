package user_defined_node_data;

public class LinkedList {
	Node head;
	public LinkedList()
	{
		head=null;
	}
	public void addNode(Book b)
	{
		Node record=new Node(b);
		if(head==null)
		{
			head=record;
		}
		else
		{
			Node move;
			for(move=head;move.next!=null;move=move.next);
			move.next=record;
		
		}
	}
	@Override
	public String toString() {
		Node move=head;
		String str="";
		while(move!=null)
		{
			str=str+move.data+" -> ";
			move=move.next;
		}
		return str;
	}
	
}
