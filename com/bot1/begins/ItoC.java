package com.bot1.begins;
import java.util.Scanner;
public class ItoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter height in inches");
		float a=scan.nextFloat();
		scan.close();
		float r= (float)(a*2.54);
		System.out.println("Height in centmeters: "+r);	

	}

}
