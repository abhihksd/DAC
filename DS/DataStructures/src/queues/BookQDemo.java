package queues;

import java.util.Scanner;

public class BookQDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Book b=null;
		BookQ bq=new BookQ(5);
		int ch;
		do
		{
			System.out.println("----queue ops----\n1. EnQ 2. DeQ 3. Display \nEnter choice:");
			ch=sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter number");
				bq.enQueue(new Book(sc.nextInt(),sc.next()));
				break;
			case 2:
				Book temp;
				if((temp=bq.deQueue())==null)
				{
					System.out.println("Queue is empty");
				}else
					System.out.println("Element removed was: "+temp);

				break;
			case 3: 
				bq.display();
				break;
			case 4:
			default:
				break;
			}
		}
		while(ch!=4);
		

	}

}
