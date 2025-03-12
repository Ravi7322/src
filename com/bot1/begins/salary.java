package com.bot1.begins;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class salary {

	public static void main(String[] args) {
		List<String> employee = new ArrayList<>();
		employee.add("ravi");
		employee.add("ram");
		employee.add("rahul");
		employee.stream()
		.filter(s -> s.length() >= 4)
		.map(s -> s.length())
		.forEach(System.out::println);
		employee.stream()
		.filter(s -> s.length() <=4) 
		.forEach(System.out::println);
//		employee.stream()
//		.filter(num -> num > 5000 & num < 10000)
//		.map(num -> num+((num*5)/100))
//		.forEach(System.out::println);
//		employee.stream()
//		.filter(num -> num > 10000)
//		.forEach(System.out::println);
//		if (s<5000) {
//			int a=s+((s*5)/100);
//			System.out.println("salary after hike:"+a);
//		}
//		else if (s>5000 & s<10000) {
//			int b=s+((s*6)/100);
//			System.out.println("salary after hike:"+b);
//			
//		}
//		else {
//			System.out.println("salary after hike:"+s);
//		}
//		scan.close();
		
		
		

	}

}
