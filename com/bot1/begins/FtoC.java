package com.bot1.begins;

import java.util.Scanner;

public class FtoC {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter height in feet");
		float a=scan.nextFloat();
		scan.close();
		float r= (float)(a*12);
		System.out.println("Height in inches: "+r);	

	}
}
