package smple_linked_list;

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
			for (move = head; move.link != null; move = move.link)
				;
			move.link = record;
		}

	}

	public void display() {
		Node move;
		System.out.println("-----Linked List-----");
		for (move = head; move.link != null; move = move.link) {
			System.out.print(move.data+" ");

		}
		System.out.print(move.data);
	}
	
	public void createLinkedList(int num)
	{
		
		int d1=5;
		for(int i=1;i<=num;i++)        //create a linked list of multiples of 5
		{
			addNode(d1);
			d1=5+d1;
			
		}
	}
	public void sort(int data)
	{
		boolean flag=true;
		Node record=new Node(data);
		if(head==null)
		{
			head=record;
		}
		else
		{
			Node move=head;
			while(move.link!=null)
			{
				if(move.data<data && move.link.data>data)
				{
					record.link=move.link;
					move.link=record.link;
					flag=false;
					
				}
				move=move.link;
			}
			if(flag)
				move.link=record;
		}
	}
	

}
