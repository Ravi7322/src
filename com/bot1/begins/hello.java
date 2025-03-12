package com.bot1.begins;

import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		 Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		 System.out.println("Enter last units");
		 System.out.println("Enter current units");
         int last = myObj.nextInt(); 
         int curr = myObj.nextInt(); 
         myObj.close();
         int a=curr-last;
		 System.out.println("total units is: " + a);
		 int y=a-100;
		 System.out.println("Bills: " +y);
	     int p=2*a;
	     if (y>0) {
	    	 int t=5*y;
	    	 int r=p+t;
		 System.out.println("Bill: " +r);
		     
	}
}
}