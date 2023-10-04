import java.util.Scanner;

public class FruitDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String fn;
        boolean is = false;
        char v;
        System.out.println("Enter name of fruit");
        fn = sc.nextLine();
        System.out.println("Enter if it is seeded");
        is = sc.nextBoolean();
        System.out.println("Enter VItamin:");
        v = sc.next().charAt(0);
        Fruit f1 = new Fruit(fn, is, v);
        f1.display();
    }
}