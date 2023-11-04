package dynamicQ;

public class DynamicQueue {
	Node front, rear;

	public DynamicQueue() {
		front = rear = null;

	}

	public boolean isEmpty() {
		return front == null ? true : false;
	}

	public void enQ(int data) {
		Node n1 = new Node(data);
		if (isEmpty()) {
			rear = front = n1;
		} else {
			rear.next = n1;
			rear = n1;
		}

	}

	public int deQ() {
		int data = -999;
		if (isEmpty()) {
			System.err.println("Q is empty");
			return data;
		}

		else {
			data = front.data;
			front = front.next;
			return data;

		}
		

	}

	public String toString() {
		String str = "";
		Node move = front;
		while (move != null) {
			str = str + " " + move;
			move = move.next;
		}

		return str;
	}

}
