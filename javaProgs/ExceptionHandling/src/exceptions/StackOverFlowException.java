package exceptions;

public class StackOverFlowException extends Exception {
	String msg;
	public StackOverFlowException()
	{
		msg="Stack is full";
	}
	
	public String getMessage() {
	
		return "Stack is full";
	}
	
	public String toString() {
	
		return msg;
	}
	

}
