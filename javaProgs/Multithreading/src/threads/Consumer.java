package threads;

import multithreadular.Stock;

public class Consumer implements Runnable {
	private Thread t;
	private Stock s;
	private boolean bRun;

	public Consumer(Stock s) {

		this.s = s;
		t=new Thread(this);
		bRun=true;
	}
	public Thread getT()
	{
		return t;
	}
	@Override
	public void run() {
		while(bRun)
		{
			try {
				s.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	public void stopNow()
	{
		bRun=false;
	}

}
