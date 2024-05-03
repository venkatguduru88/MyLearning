package com.corejava;

import java.util.Optional;
import java.util.function.BiFunction;

public class Test {
	
	public static void main(String[] args) {
		//A a= a -> a.length();
		//A x = y -> { return y;}; 
		
		//A s="2" -> Integer.parseInt(s);
		
		A b =(String) -> 1;
		
		/*
		 * Optional.of(24) .filter(v -> v%4==0) .map(v -> { System.out.println(v);
		 * return v/2; }) .filter(s -> s!=0) .map(s -> s/6) .map(s -> {
		 * System.out.println(s); return s; }).orElseThrow(() -> new
		 * Exception("Data error"));
		 */
		
		BiFunction<String, String, Boolean> compreStrin = (x,y) -> x.equals(y);
		System.out.println(compreStrin.apply("Java8","Java8"));
		
	}

}
