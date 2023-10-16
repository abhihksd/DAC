package threads;

import java.io.*;

public class DivisorTask implements Runnable {
	Thread t;
	BufferedWriter bw;
	int num;

	public DivisorTask(int num, BufferedWriter bw) {
		this.num = num;
		this.bw = bw;
		t = new Thread(this);
	}

	public Thread getT() {
		return t;
	}

	@Override
	public void run() {
		synchronized (bw) {
			try {

				bw.write("The divisor of " + num + " are: ");
				for (int i = 1; i <= num; i++) {
					if (num == i) {
						bw.write(" " + i);
					} else if (num % i == 0) {

						bw.write(" "+i + " ,");

					}
				}
				bw.write("\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}

	}

}
