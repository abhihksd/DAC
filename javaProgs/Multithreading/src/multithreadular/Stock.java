package multithreadular;

public class Stock {
	 int qtyProduced, qtyConsumed;
	 boolean bProduced;
	 public Stock()
	 {
		 qtyProduced=qtyConsumed=0;
		 bProduced=false;
	 }
	 public synchronized void produce() throws InterruptedException
	 {
		 if(bProduced)
		 {
			 wait();
		 }
		 qtyProduced++;
		 System.out.println("Produced: "+qtyProduced);
		 bProduced=true;
		 notify();
	 }
	 public synchronized void consume() throws InterruptedException {
		 if(!bProduced)
		 {
			 wait();
		 }
		 qtyConsumed++;
		 System.out.println("Consumed: "+qtyConsumed);
		 bProduced=false;
		 notify();
	 }

}
