package ops_on_linkedList;

public class Demo {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.addNode(10);
		l1.addNode(20);
		l1.addNode(30);
		l1.addNode(40);
		
		LinkedList rev=new LinkedList();
		l1.reverse(l1.head,rev);
		rev.display();
		l1.insert(50,1);
		l1.display();
		l1.delete(20);
		l1.display();

	}

}
