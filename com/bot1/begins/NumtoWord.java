package com.bot1.begins;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
class NumtoWord {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int a=scan.nextInt();
		scan.close();
		ArrayList<String> f=new ArrayList<String>();
		String u=Integer.toString(a);
		Dictionary<Integer,String> d=new Hashtable<>();
		d.put(1, "one");
		d.put(2, "two");
		d.put(3, "three");
		d.put(4, "four");
		d.put(5, "five");
		d.put(6, "six");
		d.put(7, "seven");
		d.put(8, "eight");
		d.put(9, "nine");
		d.put(0, "zero");
		for (int i=0;i<=u.length()-1;i++) {
			int r=a%10;
			String j=d.get(r);
			f.add(j);
			a=a/10;
		}
		System.out.println(f);
		
	}

}
