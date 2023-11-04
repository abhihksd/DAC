package queues;

import java.util.Scanner;

public class QueueDemo {
    public static void main(String[] args) {
        Int_Queue q=new Int_Queue(10);
        int ch=-1;
        Scanner sc=new Scanner(System.in);
        while(ch!=4) {
            System.out.println("Enter choice 1. enqueue 2. dequeue 3. display");
            ch=sc.nextInt();
            switch (ch)
            {
                case 1:
                	System.out.println("Enter number");
                	int n=sc.nextInt();
                	q.enQueue(n);
                break;
                case 2: int data=q.deQueue();
                if(data==-999)
                	System.out.println("Queue is empty");
                else System.out.println("Dequeued: "+data);
                break;
                case 3: q.display();
            }

        }
    }
}
