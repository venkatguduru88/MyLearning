package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class WaysToIterateMap {

	public static void main(String[] args) {
		
		// Creating hash map
        Map<Integer, String> intType
            = new HashMap<Integer, String>();
 
        // Inserting data(key-value pairs) in HashMap
        // Custom inputs
        intType.put(1, "First");
        intType.put(2, "Second");
        intType.put(3, "Third");
        intType.put(4, "Fourth");
        
        Set<Integer> keySet = intType.keySet();
        Iterator itr = keySet.iterator();
        while(itr.hasNext()) {
        	Integer key = (Integer) itr.next();
        	System.out.println("Key : "+key + " Value : "+ intType.get(key));
        }
        
        
        //Set<Entry<Integer,String>> entry =intType.entrySet();
        
        System.out.println("Using entry set....");
        for( Entry<Integer,String> pair: intType.entrySet()) {
        	System.out.println("Key : " +pair.getKey() + " Value : "+pair.getValue());
        }
        
        System.out.println("Using lamda expression .....");
        
        intType.forEach((key,value) -> System.out.println("Key : " +key + " Value : "+value));
        
        System.out.println("Using stream api .....");
        
        intType.entrySet().stream().forEach(
                input
                -> System.out.println(input.getKey() + " : "
                                      + input.getValue()));
	}

}
