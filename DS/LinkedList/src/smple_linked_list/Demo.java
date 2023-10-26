package smple_linked_list;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ls=new LinkedList();
//		ls.addNode(10);
//		ls.addNode(20);
//		ls.addNode(30);
		//ls.createLinkedList(5);
		//ls.display(); 
		Scanner sc=new Scanner(System.in);
		int ch;
		do
		{
			System.out.println("\n1. Add Node \n2. display \n0. Exit.\nEnter the choice");
			ch=sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter data");
				ls.addNode(sc.nextInt());
				break;
			case 2:
				ls.display();
				break;
			case 3: 
				System.out.println("enter element");
				ls.sort(sc.nextInt());
			default:
				break;
			}
			
		}
		while(ch!=0);
		
			
		

	}

}
