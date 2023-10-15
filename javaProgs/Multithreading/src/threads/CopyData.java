package threads;

import java.io.*;

public class CopyData implements Runnable {
private	Thread t;
	String f1, f2;
	
int i;
	public CopyData(String f1, String f2) {
		
		this.f1 = f1;
		this.f2 = f2;
		t = new Thread(this);
	}

	public Thread getT() {
		return t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new FileReader(f1));
			BufferedWriter bw = new BufferedWriter(new FileWriter(f2));
			
			String str;
			while((str=br.readLine())!=null)
			{
				bw.write(str);
				bw.newLine();
			
			}
			
			bw.close();
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
