package io;

import java.io.*;

import person.Student;

public class AcceptStudent {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Enter student details");
			int sid = Integer.parseInt(br.readLine());
			String name = br.readLine();
			float marks = Float.parseFloat(br.readLine());
			
			Student s=new Student(sid,name,marks);
			System.out.println(s);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
