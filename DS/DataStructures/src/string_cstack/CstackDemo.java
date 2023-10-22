package string_cstack;

import java.util.Scanner;

public class CstackDemo {
    public static void main(String[] args) {
        int ch = -1;
        String str = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of stack");

        Cstack c = new Cstack(sc.nextInt());
        while (ch != 5) {
            System.out.println("Enter choice:\n1.Push\n2.Pop\n3.Display\n4.Peek\n5.Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1: {
                    System.out.println("Enter string");
                    str = sc.next();
                    c.push(str);
                    break;
                }
                case 2: {

                    System.out.println("Deleted element is: " + c.pop());

                    break;
                }
                case 3: {
                    System.out.println("The stack: ");
                    c.display();
                    break;
                }
                case 4: {
                    System.out.println("the element on top is: " + c.peek());
                    break;
                }

                default:
                    System.out.println("bye");
            }
        }
    }
}

