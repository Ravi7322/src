package com.bot1.begins;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ZPN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number = Arrays.asList(-2,-1,0,1,2,3);
		Map<Object, List<Integer>> NumberbyZPN = number.stream()
				.collect(Collectors.groupingBy(n -> n<0 ? "Negitve" : n > 0 ? "Postive" : "zero"));
		System.out.println(NumberbyZPN);

	}

}
