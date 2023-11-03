package ops_on_linkedList;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		Scanner sc=new Scanner(System.in);
		l1.addNode(50);
		l1.addNode(23);
		l1.addNode(20);
		l1.addNode(45);
		l1.display();
		l1.sort();
		l1.findMid();
		l1.display();
//		LinkedList rev=new LinkedList();
//		l1.reverse(l1.head,rev);
//		rev.display();
//		l1.insert(50,1);
//		l1.display();
//		l1.delete(20);
//		l1.display();
//		System.out.println("\n\nLinked list normal:");
//		rev.display();
//		System.out.println("\n\nSorting the linked list");
//		rev.sort();
//		rev.display();
//		System.out.println("\n\nreversing it again :");
//		rev.rev();
//		rev.display();
//		System.out.println("\n\nL1 linked list");
//		l1.display();
//		System.out.println("\n\nL2 linked list");
//		rev.display();
//		l1.merge(rev);
//		System.out.println("\n\nMErged lil");
//		l1.display();
//		
		//l1.split();
//		LinkedList l3=new LinkedList();
//		int ch;
//		do {
//			System.out.println("\n\nEnter choice 1. enter 2. display 0. exit:");
//			ch=sc.nextInt();
//			
//			switch (ch) {
//			case 1:
//				System.out.println("Enter num");
//				l3.mirror(sc.nextInt());
//				break;
//			case 2:
//				l3.display();
//				break;
//			default:
//				break;
//			}
//			
//		}while(ch!=0);

	}

}
