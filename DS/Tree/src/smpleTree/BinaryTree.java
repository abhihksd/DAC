package smpleTree;

import java.util.Scanner;

public class BinaryTree {
	Node root;

	public BinaryTree() {
		root = null;
	}

	public void addNode(int data) {
		Node n1 = new Node(data);
		if (root == null) {
			root = n1;
			System.out.println("ROot created");
			return;
		}
		Node move = root;
		while (true) {
			if (move.data > n1.data) {

				if (move.left == null) {
					move.left = n1;
					break;
				} else
					move = move.left;
			}
			if (move.data < n1.data) {
				if (move.right == null) {
					move.right = n1;
					break;
				} else
					move = move.right;
			}
			if (move.data == n1.data) {
				System.out.println("Can't enter duplicate data");
				return;
			}
		}
	}

	public void inOrder(Node move) // LDR
	{
		if (move != null) {
			inOrder(move.left);
			System.out.println(move.data);
			inOrder(move.right);

		}
	}

	public void display() {
		inOrder(root);
	}

	public int largest() {
		Node tr = root;
		while (tr.right != null)
			tr = tr.right;
		return tr.data;
	}

	public int smallest() {
		Node tr = root;
		while (tr.left != null) {
			tr = tr.left;
		}
		return tr.data;
	}

	public int height(Node move) {
		if (move == null) {
			return -1;
		}
		int lh = height(move.left);
		int rh = height(move.right);
		return lh > rh ? lh + 1 : rh + 1;
	}

	public boolean search(int data) {
		Node n1 = new Node(data);
		if (root == n1) {
			return true;
		}
		Node move = root;
		while (true) {
			if (move.data > n1.data) {

				if (move.left == null) {
					break;
				} else
					move = move.left;
			}
			if (move.data < n1.data) {
				if (move.right == null) {
					
					break;
				} else
					move = move.right;
			}
			if (move.data == n1.data) {
				
				return true;
			}
		}
		return false;
	}
	
	public void delete(int data)
	{
		Node temp=root;
		Node tag=null;
		while(temp!=null && temp.data!=data)
		{
			tag=temp;
			if(data>temp.data)
				temp=temp.right;
			else
				temp=temp.left;
			
		}
		if(temp.left==null)
		{
			if(tag.data<temp.data)
			{
				tag.right=temp.right;
			}
			else
				tag.left=temp.right;
		}
	
		if(temp.right==null)
		{
			if(tag.data<temp.data)
			{
				tag.right=temp.left;
					
				
			}else
				tag.left=temp.left;
		}
		if(temp.right!=null && temp.left!=null)
		{
			Node tr=temp.right;
			while(tr.left!=null)
				tr=tr.left;    //goes to the left most left of the temp node 
			if(tag.data<temp.data)
				tag.right=temp.right;
			else
				tag.left=temp.right;
		}
		
	}

}








