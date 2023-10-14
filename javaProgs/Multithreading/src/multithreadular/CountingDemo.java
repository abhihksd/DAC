package multithreadular;
import threads.CountDown;
public class CountingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountDown c1=new CountDown("Counter 1",150);
		CountDown c2=new CountDown("Counter 2",100);
		CountDown c3=new CountDown("Counter 3",50);
		c1.getT().start();
		c2.getT().start();
		c3.getT().start();
	}

}
