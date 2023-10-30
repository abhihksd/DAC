package dynamicQ;

public class DoubleEndedQ {
	Node front, rear;

	public DoubleEndedQ() {
		front = rear = null;

	}

	public boolean isEmpty() {
		return front == null ? true : false;
	}

	public void enQfront(int data) {
		Node n1 = new Node(data);
		if (isEmpty()) {
			rear = front = n1;
		} else {
			n1.next = front;
			front = n1;
		}
	}

	public void enQend(int data) {
		Node n1 = new Node(data);
		if (isEmpty()) {
			rear = front = n1;
		} else {
			rear.next = n1;
			rear = n1;
		}

	}

	public int deQfront() {
		int data = -999;
		if(isEmpty())
		{
			return data;
			
		}
		else {
			data = front.data;
			front=front.next;
		}
		return data;
	}
	public int deQrear()
	{
		int data;
		if(front.next==null)
		{
			data=rear.data;
			front=null;
			return data;
		}
		Node move=front;
		while(move.next.next!=null)
		{
			move=move.next;
		}
		data=rear.data;
		rear=move;
		rear.next=null;
		return data;
	}

	public String toString() {
		String str = "";
		Node move = front;
		while (move != null) {
			str = str + "" + move;
			move = move.next;
		}
		return str;
	}

}
