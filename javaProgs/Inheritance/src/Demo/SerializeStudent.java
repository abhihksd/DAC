package Demo;

import people.DacStudent;
import java.io.*;

public class SerializeStudent {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("students.txt"));
		DacStudent [] students= new DacStudent[3];
		students[0]=new DacStudent("Abhi",12,12,2000,100,"DAC",90000.5,"120");
		students[1]=new DacStudent("Bbhi",1,1,2000,100,"DAC",90000.5,"121");
		students[2]=new DacStudent("Cbhi",12,12,2012,200,"DBDA",100000.5,"122");
		for(DacStudent ds:students)
		{
			oos.writeObject(ds);
			
		}
		oos.close();
		
		DacStudent [] empty=new DacStudent[3];
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("students.txt"));
		for(int i=0;i<empty.length;i++)
		{
			Object o=ois.readObject();
			if(o instanceof DacStudent)
			{
				empty[i]=(DacStudent)o;
			}
		}
		ois.close();
		for(DacStudent ds:empty)
		{
			System.out.println(ds);
		}
		
		
	}

}
