package multithreadular;

import threads.CountPrimeNumber;

public class PrimeListDemo {

	public static void main(String[] args) {
		CountPrimeNumber c=new CountPrimeNumber(100);
		c.getT().start();

	}

}
