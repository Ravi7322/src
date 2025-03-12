package com.bot1.begins;
import java.util.Scanner;
public class Sum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		System.out.println("Enter secound number: ");
		System.out.println("Enter target number: ");
		int first= scan.nextInt();
		int secound= scan.nextInt();
		int target=scan.nextInt();
		scan.close();
		int r=first+secound;
		if (r==target) {
			System.out.println("two number is equal to target");
		}
		else {
			System.out.println("two number is not equal to target");
			
		}
		
	}
}
