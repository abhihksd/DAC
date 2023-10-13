package fileio;

import java.io.*;

public class LineNumbers {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:\\Users\\smshu\\OneDrive\\Desktop\\DAC\\javaProgs\\io_filehandling\\src\\fileio\\test.txt");
			int n, cnt = 0;
			String line="";
			while ((n = is.read()) != -1) {
				line+=(char)n;
				if ((char) n == '\n') {
					System.out.print(++cnt+" ");
					System.out.print(line);
					line="";
				}
				
				
			}
			//System.out.println(cnt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
