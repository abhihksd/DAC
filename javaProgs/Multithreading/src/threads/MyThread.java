package threads;

public class MyThread extends Thread  { //creating threads by extensions
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("my thread:"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
