package queues;

public class BookQ {
	int front;
	int rear;
	int size;
	Book[] arr;

	public BookQ(int size) {
		this.size = size;
		arr = new Book[this.size];
		front = rear = -1;
	}

	public boolean isFull() {
		if (rear == size - 1) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (front == rear)
			return true;
		return false;
	}

	public void enQueue(Book data) {
		if (!isFull()) {
			if (front == -1) {
				front = 0;
			}
			rear = rear + 1;
			arr[rear] = data;

		}
	}

	public Book deQueue() {
		Book data=null;
		if (!isEmpty()) {
			data = arr[front];
			if (front == rear)
				front = rear = -1;
			else
				front++;

		}
		return data;
	}

	public void display() {
		
			for (int i = front; i <= rear; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println("");
		
	}
}
