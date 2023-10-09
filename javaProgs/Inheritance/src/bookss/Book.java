package bookss;

public abstract class Book {
	private int bookid;
	private String title;
	protected float price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookid, String title, float price) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.price = price;
	}
	public abstract float calCost();
	
	

}
