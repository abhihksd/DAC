package multithreadular;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import threads.CopyData;
public class CopyDataThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\smshu\\OneDrive\\Desktop\\DAC\\javaProgs\\Multithreading";
		
		System.out.println("Enter file source and destination respectively: ");
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String file1="",file2="";
//		File f=new File(file1);
//		if(!f.exist)
//		{
//			//enter file 
//		}
		try {
		System.out.println("Source: ");
		file1=br.readLine();
		System.out.println("Destination: ");
		file2=br.readLine();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		CopyData d1=new CopyData(path+"\\"+file1,path+"\\"+file2);
		d1.getT().run();
	}

}
