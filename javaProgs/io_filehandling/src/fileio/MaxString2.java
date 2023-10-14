package fileio;

import java.io.*;

public class MaxString2 {

	public static void main(String[] args) throws Exception {
		try {
			String filename = "test.txt";
			BufferedReader br = new BufferedReader(new FileReader(filename));
			  
				String line;
				String largestLine = "";
				int largestLineLength = 0,cnt=0,largestcnt=0;
				while ((line = br.readLine()) != null) {
					++cnt;
					if (line.length() > largestLineLength) {
						largestLine = line;
						largestLineLength = line.length();
						largestcnt=cnt;
					} 
					
				}
				System.out.println("the largest line is: " + largestLineLength);
				System.err.println("The longest line no is:"+ largestcnt);
				System.out.println(largestLine);
				br.close();

			

		} catch (Exception e) {
			System.out.println("Error");
		}
	}

}
