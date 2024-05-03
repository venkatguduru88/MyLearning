package com.corejava;

public class DefaultValues {

	// static values
    static byte b;
    static int i;
    static long l;
    static short s;
    static boolean bool;
    static char c;
    static String str;
    static Object object;
    static float f;
    static double d;
    static int[] Arr;
    Integer t;
    public void testDefaultValueForLocalVariable() {
    	int i ;
    	System.out.println("Defalut value for local variable");
        
       // System.out.println("int value" +i);
    	System.out.println("Primitive variable default values");
        
        System.out.println("Integr default value" + t);
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // byte value
        System.out.println("byte value" + b);
        // short value
        System.out.println("short value" + s);
        // int value
        System.out.println("int value" + i);
        // long value
        System.out.println("long value" + l);
        System.out.println("boolean value" + bool);
        System.out.println("char value" + c);
        System.out.println("float value" + f);
        System.out.println("double value" + d);
        System.out.println("string value" + str);
        System.out.println("object value" + object);
        System.out.println("Array value" + Arr);
        
        DefaultValues dv = new DefaultValues();
        dv.testDefaultValueForLocalVariable();
        
        

	}

}
