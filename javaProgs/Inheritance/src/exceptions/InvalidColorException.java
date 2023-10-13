package exceptions;

public class InvalidColorException extends Exception {
	String msg;
	public InvalidColorException()
	{
		msg="Invalid color selection";
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Color selected is invalid\n"+msg;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return msg;
	}
	

}
