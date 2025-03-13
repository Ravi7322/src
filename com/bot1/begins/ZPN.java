package com.bot1.begins;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class sudent{
	String name;
	int rollno;
	int age;
	String branch;
	
	public sudent(String name,int roolno,int age,String branch) {
		this.name=name;
		this.rollno=rollno;
		this.age=age;
		this.branch=branch;
	}

	@Override
	public String toString() {
		return "sudent [name=" + name + ", rollno=" + rollno + ", age=" + age + ", branch=" + branch + "]";
	}
	
	
}

public class ZPN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number = Arrays.asList(-2,-1,0,1,2,3);
		Map<Object, List<Integer>> NumberbyZPN = number.stream()
				.collect(Collectors.groupingBy(n -> n<0 ? "Negitve" : n > 0 ? "Postive" : "zero"));
		System.out.println(NumberbyZPN);
		List<sudent> sudent = Arrays.asList(
				new sudent("ravi",04,21,"EIE"),
				new sudent("ravi",02,22,"ECE"),
				new sudent("ravi",01,26,"CSE"),
				new sudent("ravi",06,27,"EEE")
				);
		Map<Object, List<sudent>>namebyage = sudent.stream()
				.collect(Collectors.groupingBy(name -> name.age>24 ? "child" : "adult"));
		System.out.println(namebyage);

	}

}
