package Demo;
import bookss.*;
import java.util.Scanner;
public class BookDemo {

	public static void main(String[] args) {
		int id;
		String title;
		float price;
		Book[] books=new Book[1];
		Scanner sc=new Scanner(System.in);
		

		for(int i=0;i<books.length;i++)
		{System.out.println("Enter type of book");
		String str=sc.nextLine();
			
			if(str.equals("ebook"))
			{
				System.out.println("Enter book id,title and price");
				id=sc.nextInt();
				title=sc.next();
				price=sc.nextFloat();
				books[0]=new Ebook(id,title,price);
			}
			else if(str.equals("pbook"))
			{
				System.out.println("Enter book id,title and price");
				id=sc.nextInt();
				title=sc.nextLine();
				price=sc.nextFloat();
				books[0]=new PaperBook(id,title,price);
			}
			
		}
		
		for(Book b:books)
		{
			System.out.println(b.calCost());
		}
		sc.close();
	}


}

