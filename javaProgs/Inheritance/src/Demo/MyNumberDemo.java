package Demo;
import utility.MyNumber;
import interfaces.IntOperation;
public class MyNumberDemo{
	public static void main(String[] args) {
		IntOperation n=new MyNumber();
		System.out.println(n.isEven(5));
		System.out.println(n.isOdd(5));
		System.out.println(n.isPrime(5));
		System.out.println(n.calFactorial(5));
		
	}
	

}
