package smpleTree;

public class ValidDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tree=new Tree();
		tree.addNode(6);
		tree.addNode(2);
		tree.addNode(8);
		tree.addNode(1);
		tree.addNode(9);
		ValiDateBST valiDateBST=new ValiDateBST();
		System.out.println(	valiDateBST.checkValidBST(tree.root));
	}

}
