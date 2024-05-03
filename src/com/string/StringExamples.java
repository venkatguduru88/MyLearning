package com.string;

public class StringExamples implements Cloneable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = new String("Welcom");
		String str2 = new String("Welcome");
		
		System.out.println("Using new operator");
		
		if(str == str2) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
		
		System.out.println("Using literal...");
		
		String str3 = "Hello";
		String str4 = "Hello";
		
		if(str3 == str4) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
		
		StringExamples se = new StringExamples();
		
		try {
			StringExamples se2 = (StringExamples) se.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
