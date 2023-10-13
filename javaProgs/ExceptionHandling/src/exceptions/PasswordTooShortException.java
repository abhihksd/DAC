package exceptions;

public class PasswordTooShortException extends Exception {
	String msg;
	public PasswordTooShortException()
	{
		msg="Password should be more than 6 character long";
		
	}
	public String toString()
	{
		return "Invalid Password:\n"+msg;
	}
	public String getMessage()
	{
		return msg;
	}


}
