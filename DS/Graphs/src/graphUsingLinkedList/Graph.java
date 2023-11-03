package graphUsingLinkedList;

public class Graph {
	int var;
	LinkedList [] data;
	public Graph(int n)
	{
		this.var=n;
		data=new LinkedList[var];
		for(int i=0;i<var;i++)
		{
			data[i]=new LinkedList();
		}
	}
	public void addEdge(int i,int j)
	{
		//GraphNode g1=new GraphNode(i);
		//GraphNode g2=new GraphNode(j);
		data[i].addBeg(j);
		data[j].addBeg(i);
	}
	public void display()
	{
		for(int i=0;i<data.length;i++)
		{
			System.out.println(i+"->"+data[i]);
		}
		
	}
	

}
