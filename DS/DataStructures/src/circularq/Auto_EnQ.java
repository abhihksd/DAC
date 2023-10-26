package circularq;

public class Auto_EnQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CQueue c = new CQueue(5);
		for (int i = 1; i <8; i++) {
			if (c.isFull()) {
				c.deQ();
				c.enQ(i);
				
			}
			c.enQ(i);

		}
		c.display();

	}

}
