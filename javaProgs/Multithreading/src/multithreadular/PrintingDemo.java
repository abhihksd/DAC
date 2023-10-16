package multithreadular;

import threads.Printer;
import threads.PrintingThread;

public class PrintingDemo {

	public static void main(String[] args) {
		Printer p=new Printer();
		PrintingThread p1=new PrintingThread("{","Welcome to Java","}",p);
		PrintingThread p2=new PrintingThread("[","This is multi threading","]",p);
		PrintingThread p3=new PrintingThread("(","Synchronizing the threads",")",p);
		p1.getT().start();
		p2.getT().start();
		p3.getT().start();

	}

}
