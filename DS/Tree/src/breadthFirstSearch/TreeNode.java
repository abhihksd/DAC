package breadthFirstSearch;

public class TreeNode {
	int data;
	TreeNode left,right;
	
	public TreeNode(int data)
	{
		this.data=data;
		left=right=null;
	}
	@Override
	public String toString()
	{
		return "["+data+"]";
	}
}
