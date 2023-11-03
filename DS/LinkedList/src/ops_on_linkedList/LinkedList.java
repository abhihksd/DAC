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

	public void sort() {
		Node temp = head;
		while (temp != null) {
			Node tag = temp.next;
			while (tag != null) {
				if (temp.data > tag.data) {
					int t = temp.data;     //swapping the data
					temp.data = tag.data;
					tag.data = t;
				}
				tag = tag.next;
			}
			temp = temp.next;
		}
	}

	public void rev() {
		Node p1 = head;
		Node p2 = p1.next;
		Node p3 = null;
		while (p2 != null) {
			p3 = p2.next;
			p2.next = p1;
			p1 = p2;
			p2 = p3;
		}
		head.next = null;
		head = p1;

	}

	public void merge(LinkedList l2) {
		Node move = head;

		while (move.next != null)
			move = move.next;
		move.next = l2.head;

	}
	public void split()
	{
		LinkedList l1=new LinkedList();
		LinkedList l2=new LinkedList();
		Node move=head;
		while(move!=null)
		{
			if(move.data%2==0)
				l1.addNode(move.data);
			else
				l2.addNode(move.data);
			move=move.next;
		}
		l1.display();
		l2.display();
	}
	public void addBeg(int data)
	{
		Node record= new Node(data);
		if(head==null)
			head=record;
		else
		{
			record.next=head;
			head=record;
		}
	}
	public void addEnd(int data)
	{
		Node record=new Node(data);
		if(head==null)
			head=record;
		else
		{
			Node move;
			for(move=head;move.next!=null;move=move.next);
			move.next=record;
		}
	}
	public void mirror(int data)
	{
		addBeg(data);
		addEnd(data);
	}
	public void findMid()
	{
		Node fast=head,slow=head;
		while(fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		System.out.println("The mid is: "+slow.data);
	}
	
	
	
	
}
