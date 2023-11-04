package smple_linked_list;

public class Node {
	int data;
	Node link;
	public Node()
	{
		data=1;
		link=null;
	}
	public Node(int data)
	{
		this.data=data;
		link=null;
		
	}
	
	
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getLink() {
		return link;
	}
	public void setLink(Node link) {
		this.link = link;
	}
	
	public String toString() {
		return data+" " ;
	}
	

}
