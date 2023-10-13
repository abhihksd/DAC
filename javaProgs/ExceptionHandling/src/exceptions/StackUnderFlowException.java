package exceptions;

public class StackUnderFlowException extends Exception {
	String msg;

	public StackUnderFlowException() {
		msg="Stack is Empty";
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Invaid Move\n"+msg;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Stack is Empty";
	}
	
}
