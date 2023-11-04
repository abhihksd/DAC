package dynamicQ;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicQueue dq=new DynamicQueue();
//		dq.enQ(10);
//		dq.enQ(20);
//		dq.enQ(30);
//		dq.enQ(40);
		System.out.println(dq);
		Scanner sc=new Scanner(System.in);
		int ch;
		do {
			System.out.println("\n\nEnter choice 1. EnQ 2.DeQ 3. display 0. exit:");
			ch=sc.nextInt();
			
			switch (ch) {
			case 1:
				System.out.println("Enter num");
				dq.enQ(sc.nextInt());
				break;
			case 2: 
				
					System.err.println(dq.deQ());
			case 3:
				System.out.println(dq);
				break;
			default:
				break;
			}
			
		}while(ch!=0);
		

	}

}
