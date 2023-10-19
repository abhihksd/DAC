
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateAndCalenderAssignment {

	public static void main(String[] args) throws Exception {
		
		// 1. Display Current Date And Time		
		System.out.println("1. Display Current Date And Time");
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		System.out.println(formatter.format(Calendar.getInstance().getTime()));
		System.out.println("-------------------------------");
		
		// 2. Display Week Of the Year From Current Date
		System.out.println("2. Display Week Of the Year From Current Date");
		Calendar cal = Calendar.getInstance();	
		System.out.println("Current week of year is : " +cal.get(Calendar.WEEK_OF_YEAR));
	    System.out.println("Current week of month is : " +cal.get(Calendar.WEEK_OF_MONTH));
	    System.out.println("-------------------------------");
	    
	    // 3. Display Current date and time in particular format. 
	    System.out.println("3. Display Current date and time in particular format.");
	    SimpleDateFormat formatter1= new SimpleDateFormat("dd MMM yyyy HH:mm:ss a");
	    Date d1 = new Date();	    
	    System.out.println(formatter1.format(d1));
	    System.out.println("-------------------------------");
	    
	    // 4. Add 3 Years in Current Date and Display in it Short Form.
	    System.out.println("4. Add 3 Years in Current Date and Display in it Short Form.");
	    DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
	    Calendar cal1 = Calendar.getInstance();
		cal1.add(Calendar.YEAR,3);
		System.out.println(df.format(cal1.getTime()));
		System.out.println("-------------------------------");
	    
	   // 5. Extract Year from current date and check year is leap year or not.
		System.out.println("5. Extract Year from current date and check year is leap year or not.");
	   int year = cal.get(Calendar.YEAR);	   
	   String check = ((year%4==0 && year%100!=0) || (year%400==0)) ? "yes" : "no";	      
	   if(check.equals("yes"))
	       System.out.println(year+ " is a Leap Year.");
	   else
	       System.out.println(year+ " is not a Leap Year.");
	   System.out.println("-------------------------------");
	      
	    // 6. Accept Date as a String and Convert it into Date. 
	    System.out.println("6. Accept Date as a String and Convert it into Date.");
	   	Scanner sc  = new Scanner(System.in);
	 	SimpleDateFormat sdf1 = new SimpleDateFormat("dd-mm-yyyy");
	 	System.out.println("Enter Date Should be in format of dd-mm-yyyy");
	 	Date date1 = sdf1.parse(sc.next());
	 	System.out.println("Entered Date Is : "+date1);
	 	System.out.println("-------------------------------");
	}
}




create collection
which store string
in order of lesser no of word to high no of words
if two have same number
then they should arrenge alphabatically