package queues;

public class Int_Queue {
	int front;
	int rear;
	int size;
	int[] arr;

	public Int_Queue(int size) {
		this.size = size;
		arr = new int[this.size];
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

	public void enQueue(int data) {
		if (!isFull()) {
			if (front == -1) {
				front = 0;
			}
			rear = rear + 1;
			arr[rear] = data;

		}
	}

	public int deQueue() {
		int data = -999;
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
		if (!isEmpty()) {
			for (int i = front; i <= rear; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println("");
		} else
			System.out.println("Stack is empty");

	}
}
