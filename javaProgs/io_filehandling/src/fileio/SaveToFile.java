package fileio;
import java.io.*;
public class SaveToFile {

	public static void main(String[] args) {
		try{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		OutputStream os=new FileOutputStream("C:\\Users\\smshu\\OneDrive\\Desktop\\DAC\\javaProgs\\io_filehandling\\src\\fileio\\test.txt");
		System.out.println("Enter stop to quit");
		String str;
		while(!((str=br.readLine()).equals("stop")))
		{
			byte[] arr=str.getBytes();
			os.write(arr);
		}
		br.close();
		os.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
