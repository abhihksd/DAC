package multithreadular;

import threads.Producer;
import threads.Consumer;

public class StockDemo {

	public static void main(String[] args) throws InterruptedException {
		Stock s=new Stock();
		Producer p=new Producer(s);
		Consumer c=new Consumer(s);
		p.getT().start();
		c.getT().start();
		
		Thread.sleep(500);
		p.stopNow();
		c.stopNow();
		
		System.out.println("QtyProduced: "+s.qtyProduced);
		System.out.println("QtyConsumed: "+s.qtyConsumed);

	}

}
