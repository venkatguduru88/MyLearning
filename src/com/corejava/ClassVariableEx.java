package com.corejava;

public class ClassVariableEx {

	public static int ctr = 0;
    public ClassVariableEx() { ctr++; }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassVariableEx obj1 = new ClassVariableEx();
        ClassVariableEx obj2 = new ClassVariableEx();
        ClassVariableEx obj3 = new ClassVariableEx();
        System.out.println("Number of objects created are "
                           + ClassVariableEx.ctr);

	}

}
