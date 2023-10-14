package fileio;

import java.io.*;

public class MaxString {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name of file");
		String filename = br.readLine();
		br.close();
		String path = "C:\\Users\\smshu\\OneDrive\\Desktop\\DAC\\javaProgs\\io_filehandling\\src\\io";
		File f = new File(path + "\\" + filename);
		BufferedReader br1 = new BufferedReader(new FileReader((path + "\\" + filename)));
		BufferedReader br2 = new BufferedReader(new FileReader((path + "\\" + filename)));
		BufferedReader br3 = new BufferedReader(new FileReader((path + "\\" + filename)));
		String str, str2;
		int maxlen = 0, cnt = 0, line_cnt = 0;
		while ((str = br1.readLine()) != null) {

			if (maxlen < str.length()) {
				maxlen = str.length();
			}
			System.out.println(++cnt + str);

		}
		while ((str = br3.readLine()) != null) {
			line_cnt++;
			if (maxlen == str.length()) {
				break;
			}
		}
		System.out.println("Line with max len is:" + maxlen);
		System.out.println("Line with max charcter is : " + line_cnt);
		int spaces = 0;
		while ((str2 = br2.readLine()) != null) {
			spaces = maxlen - str2.length();
			for (int i = 0; i < spaces; i++) {
				str2 = "-" + str2;
			}
			System.out.println(str2);
		}

	}

}
