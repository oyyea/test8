package test8;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class U2 {

	public static class Student{
		int id;
		String name=new String();
		int age;
		
		public void set(int id,String name,int age) {
			this.id=id;
			this.name=name;
			this.age=age;
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Map<Integer,Student>m=new HashMap<Integer,Student>();
		Scanner input=new Scanner(System.in);
		int n;
		int id;
		String name=new String();
		int age;
		
		System.out.print("请输入学生人数：");
		n=input.nextInt();
		
		for(int i=0;i<n;i++) {
			id=input.nextInt();
			name=input.next();
			age=input.nextInt();
			Student student=new Student();
			student.set(id, name, age);
			m.put(age, student);
		}
		
		File file = new File("test.txt");
		try(PrintWriter output=new PrintWriter(file);){
			for(Map.Entry<Integer, Student>entry:m.entrySet()){
				Student student=entry.getValue();
				output.printf("%-5d%-10s%-5d\n",student.id,student.name,student.age);
			}	
		}
		
	}

}
