package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter q to quit");
		int n;int cnt=0;
		while((n=br.read())!='q')
		{
			cnt++;
			System.out.println((char)n);
		}
		br.close();
		System.out.println("Count of characters is: "+cnt);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
