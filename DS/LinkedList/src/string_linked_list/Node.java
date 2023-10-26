package string_linked_list;

public class Node {
	String data;
	Node link;
	public Node()
	{
		data="N/A";
		link=null;
	}
	public Node(String data)
	{
		this.data=data;
		link=null;
	}
	@Override
	public String toString() {
		return data + " ";
	}
	

}
