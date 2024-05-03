package com.java8features;

public class Myclass implements Interface1,Interface2{

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1(String str) {
		// TODO Auto-generated method stub
		
	}

	//MyClass won't compile without having it's own log() implementation
		//@Override
		public void log(String str){
			System.out.println();
			System.out.println("MyClass logging::"+str);
			Interface1.print("abc");
			Interface1.super.log("add");
		}
		
		public static void main(String[] args) {
			Myclass one = new Myclass();
			System.out.println();
			one.log("From My class");
		}
}
