package com.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingCustomListOfObjects {
	
	public static void main(String[] args) {
		List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
				  new Product(14, "orange"), new Product(13, "lemon"),
				  new Product(23, "bread"), new Product(15, "sugar"));
		
		System.out.println("Before Sorting : "+productList);
		
		//productList.sort(Comparator.comparing(Product::getProductName));
		
		productList.sort((Product p1,Product p2) -> p1.getProductName().compareTo(p2.getProductName()));
		
		System.out.println("After Sorting : "+productList);
		
		productList.sort(Comparator.comparing(Product::getProductId).thenComparing(Product::getProductName));
		
		System.out.println("After Sorting : "+productList);
		
		// Creating ArrayList
        List<Integer> numbersList = new ArrayList<>();
 
        // Adding values to List
        numbersList.add(150);
        numbersList.add(50);
        numbersList.add(250);
        numbersList.add(500);
        numbersList.add(350);
 
        // printing before sorting
        System.out.println("Before sorting : " + numbersList);
 
        List<Integer> descendingList = numbersList.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
 
        // printing the final list after reverse order sorting. Original list only
        // sorted.
        System.out.println("After sorting : " + descendingList);
		
		
	}

}
