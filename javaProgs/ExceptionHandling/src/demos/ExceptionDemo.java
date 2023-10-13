package demos;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
		int i=Integer.parseInt(args[0]);
		int j=Integer.parseInt(args[1]);
		System.out.println(i/j);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
//			e.printStackTrace();
			System.out.println("2 Arguments expected");
		}
		catch (ArithmeticException e)
		{
			System.out.println("Can't divide by zero");
		}
	}

}
