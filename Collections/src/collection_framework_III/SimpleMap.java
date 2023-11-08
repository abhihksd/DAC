package collection_framework_III;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class SimpleMap {
	public static void main(String[] args) {
		Map<Integer,String> map=new TreeMap<>();
		map.put(100,"one hundered only");
		map.put(1000, "one thousand only");
		map.put(1100, "one thousand one hundered only");
		map.put(1110, "one thousand one hunderd one and ten ");
		map.forEach(new BiConsumer<Integer,String>(){

			@Override
			public void accept(Integer t, String u) {
				// TODO Auto-generated method stub
				System.out.println(t+"-> "+u);
				
			}
			
		});
	}

}
