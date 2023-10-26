package queues;

public class Book {
	int bookid;
	String bname;
	public Book()
	{
		bookid=0;
		bname="NA";
	}
	public Book(int id,String name)
	{
		bookid=id;
		bname=name;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bname=" + bname + "]";
	}
	

}
