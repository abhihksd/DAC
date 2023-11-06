package array_of_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayOfList {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int ch = -1;
		do {
			System.out.println("Enter choice : "
					+ "1.  add \n"
					+ "2.  delete \n"
					+ "3.  display\n"
					+"4.   size \n"
					+"5.   Use advanced loop \n"
					+"6.   Use Iterator\n"
					+"7.   Reverse order\n"
					+"8.   Using ForEach\n"
					+"9.   Sorting the array\n"
					+"10.  Find the array");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter string");
				l.add(sc.next());
				break;
			case 2:
				System.out.println("Enter index to remove :");
				l.remove(sc.nextInt());
				break;
			case 3:
				for (int i = 0; i < l.size(); i++) {
					System.out.println(l.get(i));
				}
				break;
			case 4:
				System.out.println("No of elements are : " + l.size());
				break;
			case 5:
				System.out.println("Using advanced for loop: ");
				for (String s : l) {
					System.out.println(s);
				}
				break;
			case 6:
				Iterator<String> i = l.iterator();
				while (i.hasNext()) {
					System.out.println(i.next());
				}
				break;
			case 7:
				ListIterator<String> i1 = l.listIterator();
				while (i1.hasNext())
					i1.next();
				while (i1.hasPrevious())
					System.out.println(i1.previous());
				break;
			case 8:
				l.forEach((String s)->{System.out.println(s);});
				break;
			case 9:
				System.out.println("Sorting the array: ");
				Collections.sort(l);
				break;
			case 10:
				System.out.println("Enter string to find:");
				String find=sc.next();
				System.out.println("The index of element is:"+ Collections.binarySearch(l, find));
				break;
			default:
				break;
			}

		} while (ch != 0);

	}
}
