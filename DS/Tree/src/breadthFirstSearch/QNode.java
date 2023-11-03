package breadthFirstSearch;

public class QNode {
	TreeNode data;
	QNode next;
	public QNode()
	{
		data=null;
		next=null;
	}
	public QNode(TreeNode data)
	{
		this.data=data;
		next=null;
	}
	public String toString()
	{
		return "["+data+"]";
	}

}
