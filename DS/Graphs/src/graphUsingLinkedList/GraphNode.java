package graphUsingLinkedList;

public class GraphNode {
	int data;
	GraphNode next;
	public GraphNode(int data)
	{
		this.data=data;
		next=null;
	}
	public String toString()
	{
		return data+"";
	}

}
