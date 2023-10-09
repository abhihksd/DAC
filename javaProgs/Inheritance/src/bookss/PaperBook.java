package bookss;

public class PaperBook extends Book {
	private float charges;

	public PaperBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaperBook(int bookid, String title, float price) {
		super(bookid, title, price);
		// TODO Auto-generated constructor stub
	}
	public float calCost()
	{
		if(price<=500)
			charges=4f;
	else if(price> 500&&price <=1000)
	charges=5.0f;
	else if(price>1000&& price <=5000)
		charges=7f;
		
		return price+price*charges/100;
	}
	

}
