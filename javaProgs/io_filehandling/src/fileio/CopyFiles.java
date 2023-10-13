package fileio;

import java.io.*;

public class CopyFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			OutputStream os1 = new FileOutputStream("test1.txt");
			InputStream is = new FileInputStream("C:\\Users\\smshu\\OneDrive\\Desktop\\DAC\\javaProgs\\io_filehandling\\src\\fileio\\testing.txt");  //to print on console
			
			OutputStream os = new FileOutputStream("C:\\Users\\smshu\\OneDrive\\Desktop\\DAC\\javaProgs\\io_filehandling\\src\\fileio\\testing2.txt"); // to write in file
			int n;
			while((n=is.read())!=-1)
			{
				os.write((char)n);
			}
			os.close();
			is.close();
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
