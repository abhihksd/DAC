package circularq;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of queue");
		CQueue q=new CQueue(sc.nextInt());
		int ch;
		do
		{
			System.out.println("----queue ops----\n1. EnQ 2. DeQ 3. Display \nEnter choice:");
			ch=sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter number");
				q.enQ(sc.nextInt());
				break;
			case 2:
				int res;
				if((res=q.deQ())==-999)
				{
					System.out.println("Queue is empty");
				}else
					System.out.println("Element removed was: "+ res);

				break;
			case 3: 
				q.display();
				break;
			case 4:
			default:
				break;
			}
		}
		while(ch!=4);
		
		
		

	}

}
