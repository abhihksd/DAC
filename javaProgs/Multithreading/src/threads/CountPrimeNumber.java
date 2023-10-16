package threads;

public class CountPrimeNumber implements Runnable {
	int num;
	Thread t;

	public CountPrimeNumber(int num) {
		this.num = num;
		t = new Thread(this);
	}

	public Thread getT() {
		return t;
	}

	@Override
	public void run() {
		boolean flag = false;
		for (int i = 2; i <=num; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = true;
					
				}
			}
			if (!flag)
				System.out.println(i);
			flag=false;

		}

	}

}
