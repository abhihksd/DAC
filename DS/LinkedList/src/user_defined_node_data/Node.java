package user_defined_node_data;

public class Node {
	Book data;
	Node next;
	
	public Node() {
		
		this.data = null;
		this.next=null;
	}
	public Node(Book b)
	{
		this.data=b;
		this.next=null;
	}
	@Override
	public String toString() {
		return  data+" " ;
	}
	
	

}
