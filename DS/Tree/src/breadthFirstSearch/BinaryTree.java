package breadthFirstSearch;

public class BinaryTree {
	TreeNode root;
	public BinaryTree()
	{
		root=null;
	}
	public void addNode(int data)
	{
		TreeNode n1=new TreeNode(data);
		if(root==null)
		{
			root=n1;
			System.out.println("Root Created");
			return;
		}
		TreeNode move=root;
		while(true)
		{
			if(move.data>n1.data)
			{
				if(move.left==null)
				{
					move.left=n1;
					break;
				}else move=move.left;
			}
			if(move.data<n1.data)
			{
				if(move.right==null)
				{
					move.right=n1;
					break;
				}else move=move.right;
			}
			if(move.data==n1.data)
			{
				System.out.println("Duplicate Not allowed");
				return;
			}
		}
	}
	public void inOrder(TreeNode move)
	{
		if(move!=null)
		{
			inOrder(move.left);
			System.out.println(move.data);
			inOrder(move.right);
		}
	}
	public void display()
	{
		inOrder(root);
	}
}





















