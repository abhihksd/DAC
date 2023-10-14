package threads;

public class CountDown implements Runnable {
	private Thread t;
	private String name;
	private int num;

	public CountDown(String name, int num) {
		this.name = name;
		this.num = num;
		this.t = new Thread(this);
	}

	public Thread getT() {
		return t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = num; i > 0; i--) {
			System.out.println(name + " counting : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
