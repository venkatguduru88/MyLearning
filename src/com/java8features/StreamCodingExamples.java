package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamCodingExamples {
	
	public static void removeDuplicates(List<Integer> list){
		List<Integer> distinctList=null;
		distinctList = list.stream().distinct().toList();
		System.out.println("Using Distinct : "+distinctList);
		
		Set<Integer> distinct = list.stream().collect(Collectors.toSet());
		System.out.println("Converting list to set : "+distinct);
		
		List<Integer> distinctList2 = list.stream().filter( n -> list.indexOf(n) == list.lastIndexOf(n)).toList();
		System.out.println("Using filter with index and last index methods : "+distinctList2);
			
	}
	
	private static void separationOfEvenOddNumberInList(List<Integer> list) {
		
		Map<Boolean, List<Integer>> evenAddOddSeparation =list.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
		evenAddOddSeparation.forEach((k,v) -> System.out.println("Key : "+k+" Value : "+v));
		
	}
	
	private static void characterFrequency() {
		String name ="Venkateswara";
		Map<Character, Long> collected = name.chars().mapToObj(ch -> (char)ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 System.out.println(collected);
		
	}
	

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2,1, 3, 4, 5, 8,6, 7,3,5 ,8, 9, 10);
		
		System.out.println(list.indexOf(1));
		System.out.println(list.lastIndexOf(1));
		removeDuplicates(list);
		
		separationOfEvenOddNumberInList(list);
		
		characterFrequency();
	}

}
