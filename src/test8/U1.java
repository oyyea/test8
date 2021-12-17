package test8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class U1 {

	public static class book{
		int id;
		String name=new String();
		int price;
		String press=new String();  //出版社名称
		
		public void set(int id,String name,int price,String press) {
			this.id=id;
			this.name=name;
			this.price=price;
			this.press=press;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		List<book>l=new ArrayList<book>();
		Map<Integer,book>m=new HashMap<Integer,book>();
		int id;
		String name=new String();
		int price;
		String press=new String();
		
		System.out.print("输入书本数量：");
		int n;
		n=input.nextInt();
		for(int i=0;i<n;i++) {
			id=input.nextInt();
			name=input.next();
			price=input.nextInt();
			press=input.next();
			book b=new book();
			b.set(id, name, price, press);
			l.add(b);
			m.put(id, b);
		}
		
		System.out.println("链表输出：");
		for(int i=0;i<n;i++) {
			book b=l.get(i);
			System.out.printf("%-5d%-10s%-5d%-10s\n",b.id,b.name,b.price,b.press);
		}
		System.out.println("映射（map）输出：");
		for(Map.Entry<Integer, book>entry:m.entrySet()){
			book b=entry.getValue();
			System.out.printf("%-5d%-10s%-5d%-10s\n",b.id,b.name,b.price,b.press);
		}
	}

}
