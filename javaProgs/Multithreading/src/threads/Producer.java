package threads;

import multithreadular.Stock;

public class Producer implements Runnable {
	Thread t;
	Stock s;
	boolean bRun;

	public Producer(Stock s)
	{
		this.s=s;
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
				s.produce();
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
