package utility;
import exceptions.InvalidColorException;
public class ColorPoint extends Point {
	String color;
	static String [] valid_colors;
	static
	{
		valid_colors=new String[5];
		valid_colors[0]="white";
		valid_colors[1]="black";
		valid_colors[2]="red";
		valid_colors[3]="green";
		valid_colors[4]="blue";
	}
	public ColorPoint()
	{
		color="white";
	}
	public ColorPoint(int x, int y, String color) throws InvalidColorException {
		super(x, y);
		boolean flag=false;
		for(String s: valid_colors)
		{
			if(s.equals(color))
			{
				this.color=color;
				flag=true;
				break;
			}
		}
		if(!flag)
			throw new InvalidColorException();
//		this.color="white";
		
	}
	public String toString()
	{
		return "The Point "+super.toString()+" is of "+color+" color.";
	}
	
	

}
