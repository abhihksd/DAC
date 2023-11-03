package smpleTree;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Tree t = new Tree();
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter size of tree:");
//		int sz = sc.nextInt();
//		for (int i = 0; i < sz; i++) {
//			System.out.println("Enter data");
//			t.addNode(sc.nextInt());
//		}
//		t.display();
		int ch=-1;

		do {
			System.out.println("Enter choice: 1. add node 2. display 0. exit");
			ch=sc.nextInt();
			switch (ch) {
			case 1 :
				System.out.println("enter data:");
				t.addNode(sc.nextInt());
				break;
			case 2:
				t.display();
				break;

			default:
				break;
			}
		} while (ch != 0);

		sc.close();
	}

}
