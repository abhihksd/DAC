package fileio;

import java.io.*;

public class AcceptFileName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter file name");
			//String filename = br.readLine();// entering the name of the file
			File f=new File(br.readLine());
			System.out.println(f.getName());

			Writer os = new FileWriter(f.getName());// write data to the file
			
			

			InputStream is = new FileInputStream(f.getName());// print data to the console

			// Input data using writer
			System.out.println("Enter text and write stop to save");
			String str;
			while (!((str = br.readLine()).equals("stop"))) {
				os.write(str);
			}
			os.close();

			// to print data on console
			int i;
			while ((i = is.read()) != -1) {
				
				System.out.print((char) i);

			}
			is.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
