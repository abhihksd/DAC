package string_linked_list;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ls=new LinkedList();
		ls.addEnd("World");
		ls.addBeg("Hello");
		ls.display();
		System.out.println(ls.contains("World"));
		System.out.println(ls.size());
		ls.modify("Hello", "Earth");
		ls.display();
		ls.modify(1,"Moon");
		ls.display();

		

	}

}
