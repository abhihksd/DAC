class Book{
 static int cnt;
 int bookid;
 float price;
static
 {
  cnt=0;
 }
 public void display()
 {
  System.out.println("Book id: "+bookid);
  System.out.println("Book price: "+price);	
 }
 public Book()
 {
   cnt++;
   bookid=cnt;
   price=100;
 }
  public Book(int price)
  {
    cnt++;
    bookid=cnt;
    this.price=price;
  }
public static void main(String [] args)
{
	Book b1=new Book(300);
	Book b2=new Book(400);
	b1.display();
	b2.display();
}
}