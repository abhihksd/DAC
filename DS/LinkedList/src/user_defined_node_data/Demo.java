package user_defined_node_data;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		Scanner sc=new Scanner(System.in);
		int ch;
		do
		{
			System.out.println("Enter 1.add 2. dis");
			ch=sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter id and name");
				l1.addNode(new Book(sc.nextInt(),sc.next()));
				break;
			case 2: 
				System.out.println(l1);

			default:
				break;
			}
		}while(ch!=0);

	}

}
