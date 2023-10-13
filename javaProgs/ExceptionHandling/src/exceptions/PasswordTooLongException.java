package exceptions;

public class PasswordTooLongException extends Exception {
	String msg;
	public PasswordTooLongException()
	{
		msg="Password can't be more than 12 character long";
		
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
