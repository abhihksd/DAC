package bookss;

public class Ebook extends Book{
	private float discount;
	
	public Ebook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ebook(int bookid, String title, float price) {
		super(bookid, title, price);
		// TODO Auto-generated constructor stub
	}

	public float calCost()
	{
		if(price<=500)
				discount=4.0f;
		else if(price> 500&&price <=1000)
			discount=5.0f;
		else if(price>1000&& price <=5000)
			discount=7f;
		return price- (price*discount/100);
		
	}
}
