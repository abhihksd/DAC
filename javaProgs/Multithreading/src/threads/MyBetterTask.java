package threads;

public class MyBetterTask implements Runnable {
	private Thread t;

	public MyBetterTask() {
		t = new Thread(this);  //instance of thread instantiate with runnable
	}
	public Thread getThread()
	{
		return t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			System.out.println("MY BETTER TASK IS RUNNING : "+i);
		}

	}

}
