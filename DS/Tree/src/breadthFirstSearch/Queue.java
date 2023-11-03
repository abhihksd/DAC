package breadthFirstSearch;

public class Queue {
	QNode front,rear;
	public Queue()
	{
		front=rear=null;
	}
	public boolean isEmpty()
	{
		return front==null?true:false;
	}
	public void bfs(TreeNode data)
	{
		TreeNode out=null;
		enQ(data);
		while(!isEmpty())
		{
			 out=deQ();
			 System.out.println(out);
			 if(out.left!=null)
			enQ(out.left);
			 if(out.right!=null)
			enQ(out.right);
			 
		}
		
	}
	public void enQ(TreeNode data)
	{
		QNode n1=new QNode(data);
		if(isEmpty())
		{rear=front=n1;}
		else {
			rear.next=n1;
			rear=n1;
		}
	}
	public TreeNode deQ()
	{
		TreeNode data=null;
		if(isEmpty())
		{
			System.err.println("Q is empty");
			return data;
		}
		else {
			data=front.data;
			front=front.next;
			return data;
		}
	}
	public String toString()
	{
		String str="";
		QNode move=front;
		while(move!=null)
		{
			str=str+""+move;
			move=move.next;
		}
		return str;
		
	}

}
