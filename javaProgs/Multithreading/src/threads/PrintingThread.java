package threads;

public class PrintingThread implements Runnable {
	Thread t;
	String head,body,tail;
	Printer p;
	public PrintingThread(String head,String body,String tail,Printer p)
	{
		this.head=head;
		this.body=body;
		this.tail=tail;
		this.p=p;
		t=new Thread(this);
	}
	public Thread getT()
	{
		return t;
	}
	
	@Override
	public void run() {
		synchronized(p) {
		p.print(head, body, tail);
		}

	}

}
