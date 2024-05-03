package com.collections;

import java.util.Arrays;
import java.util.List;

public class ArraysToCollection {
	
	public static void main(String[] args) {
		
		String students[]= {"Ravi","Raja","Rakesk","Ram"};
		
		System.out.println(Arrays.toString(students));		
		
		List list =  Arrays.asList(students);
		
		System.out.println(list);
	}

}
