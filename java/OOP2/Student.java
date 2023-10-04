class Student
{
 private int id;
 private float percent;
	public void showGrade()
	{
               String grade="Not Valid";
		if(percent>=90)
		{
			grade="Excellent";
		}
		else if( percent<90 && percent >=80)
		{ 
			grade="Very Good";
		}
		else if( percent<80 && percent >=70)
		{ 
			grade="Good";
		}
		else if( percent<70 && percent >=60)
		{ 
			grade="Average";
		}
		else if( percent<60 && percent >=40)
		{ 
			grade="Pass";
		}
		else if( percent<40)
		{ 
			grade="Fail";
		}
		
		System.out.println("Grade of rollno: "+id+" is "+ grade); 
		
	}
	public Student()
	{
		id=0;
		percent=0.0f;
		
	}
	public Student(int id,float p)
	{
		this.id=id;
		percent=p;
	}
}