package multithreadular;

import threads.*;
public class MultiThread {

	public static void main(String[] args) throws InterruptedException {
		
		//extending the thread way
		Thread t=new MyThread();
		t.start();
		for(int i=0;i<=5;i++)
		{
			System.out.println("MAin thread: "+i);
			Thread.sleep(500);
		}
		
		
		// implement runnable 1st way 
		//MyTask is not self sustaining this way
		Runnable r=new MyTask();
		Thread t2=new Thread(r);
		t2.start();// r.run() will be called implicitly i.e MyTask Thread will get in the thread pool
		for(int i=0;i<5;i++)
		{
			System.err.println("Differnet Thread from main: "+i);
			Thread.sleep(500);
		}
		//2nd way to implement runnable
		//here Thread reference is being provided by the class itself
		MyBetterTask t3=new MyBetterTask();
		t3.getThread().start();

	}

}
