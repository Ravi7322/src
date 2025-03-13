package com.bot1.begins;

import java.util.Arrays;
import java.util.List;

public class AVGofODD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
		double avgnum=numbers.stream()
		.filter(s -> s%2 !=0)
		.mapToInt(s -> s)
		.summaryStatistics().getAverage();
		System.out.println(avgnum);

	}

}
