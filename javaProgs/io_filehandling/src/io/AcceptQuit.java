package io;
import java.io.*;
public class AcceptQuit {

	public static void main(String[] args) {
		try{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter quit to quit");
		String str;
		while(!((str=br.readLine()).equals("quit")))
		{
			System.out.println(str);
		}
		br.close();
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
