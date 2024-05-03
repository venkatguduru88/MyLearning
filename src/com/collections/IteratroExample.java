package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratroExample {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			 int i = (int) itr.next();
			 
			if (i % 2 != 0)
                itr.remove();
			//System.out.println(itr.next());
			
		}
		
		System.out.println(list);
	}

	
}
