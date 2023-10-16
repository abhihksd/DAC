package multithreadular;

import java.io.*;

import threads.DivisorTask;

public class DivisorDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedWriter bw=new BufferedWriter(new FileWriter("divisor.txt"));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter num");
		int num=Integer.parseInt(br.readLine());
		
		DivisorTask d1=new DivisorTask(num,bw);
		DivisorTask d2=new DivisorTask(980,bw);
		DivisorTask d3=new DivisorTask(50,bw);
		d1.getT().start();
		d2.getT().start();
		d3.getT().start();
		d1.getT().join();
		d2.getT().join();
		d3.getT().join();
		br.close();
		bw.close();

	}

}
