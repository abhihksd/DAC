package breadthFirstSearch;

public class Demo {
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		Queue q = new Queue();

		bt.addNode(100);
		bt.addNode(50);
		bt.addNode(170);
		bt.addNode(20);
		bt.addNode(30);
		bt.addNode(150);
		bt.addNode(190);
		bt.display();
		// q.enQ(bt.root);
		System.out.println("The Queue");
		// q.bfs(bt.root);

		TreeNode out = null;
		 q.enQ(bt.root);
		while (!q.isEmpty()) {
			out = q.deQ();
			System.out.println(out);
			if (out.left != null)
				q.enQ(out.left);
			if (out.right != null)
				q.enQ(out.right);
		}

	}
}
