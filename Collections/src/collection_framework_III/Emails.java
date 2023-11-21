package collection_framework_III;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Emails {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String path="C:\\Users\\abhis\\OneDrive\\Desktop\\cdac\\DAC\\Collections\\src\\collection_framework_III\\emails.txt";
		//String path="emails.txt";
		BufferedReader br=new BufferedReader(new FileReader(path));
		Map<String , Integer> map=new HashMap<>();
		String str;
		while((str=br.readLine())!=null)
		{
			int index=str.indexOf('@');
			String sub=str.substring(index+1);
			if(map.containsKey(sub))
			{
				map.replace(sub, map.get(sub)+1);
			}
			else
			{
				map.put(sub, 1);
				
			}	
		}br.close();
		
		map.forEach((String c, Integer i) -> {
			System.out.println(c + "==>" + i);

		});

	}

}
