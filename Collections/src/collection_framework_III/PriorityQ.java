package collection_framework_III;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQ {

	public static void main(String[] args) {
		Queue<String> pq=new PriorityQueue<>();
		pq.add("Welcome");
		pq.add("To");
		pq.add("Not");
		pq.add("Studying");
		pq.add("For");
		pq.add("VIVA");
		System.out.println("---------------THe queue-----------------");
		for(String str:pq)
		{
			System.out.println(str);
		}
		
		System.out.println("--------------Now removing--------------");
		while(pq.size()!=0)
		{
			System.out.println(pq.poll());
			
		}

	}

}
