package smpleTree;

import java.util.Scanner;

public class Tree {
	Node root;
	public Tree()
	{
		root=null;
	}
	public void addNode(int data)
	{
		Scanner sc=new Scanner(System.in);
		Node n1=new Node(data);
		if(root==null)
		{
			root=n1;
			System.out.println("Root Created!!!");
			return ;
			
		}
		Node move=root;
		int ch;// 1. for left 0 for right
		while(true)
		{
			
			System.out.println("choose 1. for left or 0. for right of:"+move.data);
			ch=sc.nextInt();
			if(ch==1)
			{
				if(move.left==null)
				{
					move.left=n1;
					System.out.println("Record added to left of: "+move.data);
					break;
				}
				else
					move=move.left;
				
			}
			else if(ch==0)
			{
				if(move.right==null)
				{
					move.right=n1;
					System.out.println("Record added to the right of: "+move.data);
					break;
				}
				else
					move=move.right;
			}else
				System.out.println("Wrong entery");
		}
	}
	public void inOrder(Node move) //LDR
	{
		if(move!=null)
		{
			inOrder(move.left);
			System.out.println(move.data);
			inOrder(move.right);
			
		}
	}
	public void preOrder(Node move) //DLR
	{
		if(move!=null)
		{
			System.out.println(move.data);
			preOrder(move.left);
			preOrder(move.right);
			
		}
	}
	public void postOrder(Node move) //LRD
	{
		if(move!=null)
		{
			postOrder(move.left);
			postOrder(move.right);
			System.out.println(move.data);
			
		}
	}
	public void display()
	{
		System.out.println("\n------InOrder--------");
		inOrder(root);
		System.out.println("\n------PreOrder--------");
		preOrder(root);
		System.out.println("\n------PostOrder--------");
		postOrder(root);
	}

}
