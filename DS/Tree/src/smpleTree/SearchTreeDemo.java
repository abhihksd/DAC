package smpleTree;

public class SearchTreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt=new BinaryTree();
		bt.addNode(100);
		bt.addNode(50);
		bt.addNode(170);
		bt.addNode(30);
		bt.addNode(20);
		bt.addNode(150);
		bt.addNode(190);
		bt.display();
		System.out.println("THe height is:"+bt.height(bt.root));
		System.out.println(bt.search(2000));
		System.out.println("deleting again");
		bt.delete(50);
		bt.display();
		System.out.println("deleting again");
		bt.delete(150);
		bt.display();
		System.out.println(bt.largest());
	}

}
