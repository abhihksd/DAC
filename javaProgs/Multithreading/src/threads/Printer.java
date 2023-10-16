package threads;

public class Printer {
	public void print(String head, String body, String tail) {
		try {
		System.out.print(head);
		Thread.sleep(500);
		System.out.print(body);
		Thread.sleep(500);
		System.out.print(tail);
		System.out.println();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
