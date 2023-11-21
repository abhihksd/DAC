package smpleTree;

public class ValiDateBST {
	private int prev=Integer.MIN_VALUE;
	public boolean checkValidBST(Node root)
	{
		return isBST(root);}
	public boolean isBST(Node root)
	{
		if(root==null)
			return true;
		if(!isBST(root.left))
			return false;
		if(root.data<=prev)
			return false;
		prev=root.data;
		return isBST(root.right);
	}

}
