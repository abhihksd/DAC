package dynamicQ;

import java.util.Scanner;

public class DoubleQDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleEndedQ dq = new DoubleEndedQ();
//		deq.enQfront(10);
//		deq.enQfront(20);
//		deq.enQfront(30);
//		System.out.println(deq);
//		System.out.println(deq.deQfront());
//		System.out.println(deq.deQrear());
//		System.out.println(deq);
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			System.out.println("\n\nEnter choice 1. EnQFront 2.EnQEnd 3.DeQFront 4.EnQEnd 5.Display 0. exit:");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter num");
				dq.enQfront(sc.nextInt());
				break;
			case 2: 
				System.out.println("Enter num");
				dq.enQend(sc.nextInt());
			case 3:
				System.err.println(dq.deQfront());
				break;
			case 4:
				System.out.println(dq.deQrear());
				break;
			case 5:
				 System.out.println(dq);
			default:
				break;
			}

		} while (ch != 0);

	}

}
