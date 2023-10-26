package ops_on_linkedList;

public class LinkedList {
	Node head;

	public LinkedList() {
		head = null;
	}

	public void addNode(int data) {
		Node record = new Node(data);
		if (head == null)
			head = record;
		else {
			Node move;
			for (move = head; move.next != null; move = move.next)
				;
			move.next = record;
		}

	}

	public void display() {
		Node move;
		System.out.println("\n-----Linked List-----");
		for (move = head; move.next != null; move = move.next) {
			System.out.print(move.data + " ");

		}
		System.out.print(move.data);
	}

	public void delete(int data) {
		Node move = head;
		if (head.data == data) {
			Node del = head;
			head = head.next;
			del = null;

		}
		while (move != null) {
			if (move.next.data == data) {
				Node del;
				del = move.next;
				move.next = del.next;
				del = null;
				break;
			}
			move = move.next;
		}

	}

	public LinkedList reverse(Node move, LinkedList temp) {
		// LinkedList temp=new LinkedList();
		if (move != null) {
			reverse(move.next, temp);
			temp.addNode(move.data);
			System.out.println(move.data);
		}
		return temp;
	}

	public void insert(int data, int pos) {
		Node newnode = new Node(data);
		if (pos == 1) {
			newnode.next = head;
			head = newnode;
		} else {
			Node move = head;
			for (int i = 1; i < pos - 1; i++) {
				move = move.next;
			}
			newnode.next = move.next;
			move.next = newnode;
		}

	}

}
