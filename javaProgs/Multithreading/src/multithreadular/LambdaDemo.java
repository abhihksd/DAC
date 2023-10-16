package multithreadular;

public class LambdaDemo {

	public static void main(String[] args) {
		Runnable r = () -> {
			for (int i = 1; i < 101; i++)

				System.out.println(i);
		};
		Thread t = new Thread(r);
		t.start();

	}

}
