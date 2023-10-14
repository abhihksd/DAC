package multithreadular;

public class DisplayThreadName {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(t);
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println("After editing name and priority");
		t.setName("main_man");
		t.setPriority(10);
		System.out.println(t);
		
	}

}
