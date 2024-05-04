package com.java8features;

import java.util.Arrays;
import java.util.Collection;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExamples {

	public Stream<String> empty(List<String> list){
		
		return list == null || list.isEmpty() ? Stream.empty() : list.stream();
	}
	
	public static void main(String[] args) {
		
		StreamExamples se= new StreamExamples();
		//empty stream creation
		Stream<String> stream = Stream.empty();
		
		se.empty(null);
		
		//stream using array
		Stream<String> streamofarray = Stream.of("a","b","c");
		
		String[] array = new String[] {"a","b","c"};
		
		Stream<String> streamOfFullArray = Arrays.stream(array);
		
		Stream<String> streamOfArrayPart = Arrays.stream(array, 0, 2);
		
		streamOfArrayPart.forEach(n -> System.out.println(n));
		
		//stream using collections
		
		Collection<String> collection = Arrays.asList("a","b","c");
		Stream<String> collStream = collection.stream();
		
		
		//stream builder
		Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").build();
		System.out.println("Using stream builder");
		streamBuilder.forEach(n -> System.out.println(n));
		
		//stream generate
		Stream<String> streamUsingGenate = Stream.generate(() -> "Hello").limit(5);
		System.out.println("Using stream genrate");
		streamUsingGenate.forEach(n -> System.out.println(n));
		
		//stream iterator
		Stream<Integer> streamItertor = Stream.iterate(40, n -> n+2).limit(10);
		System.out.println("Using stream iterate");
		streamItertor.forEach(n -> System.out.println(n));
		
		List<String> list = Arrays.asList("abc1", "abc2", "abc3");
		long size = list.stream().skip(1)
		  .map(element -> element.substring(0, 3)).sorted().count();
		
		List<String> sortedList = list.stream().skip(1)
				  .map(element -> element.substring(0, 3)).sorted().toList();
		System.out.println("List");
		System.out.println(sortedList);
		
		//reduced
		
		OptionalInt reduced =
				  IntStream.range(1, 4).reduce((a, b) -> a + b);
		System.out.println("Reduced : "+reduced);
		
		int reducedTwoParams =
				  IntStream.range(1, 4).reduce(10, (a, b) -> a + b);
		
		System.out.println("reducedTwoParams : "+reducedTwoParams);
		
		
		int reducedParallel = Arrays.asList(1, 2, 3).parallelStream()
			    .reduce(10, (a, b) -> a + b, (a, b) -> {
			    	System.out.println("combiner was called");
			       return a + b;
			    });
		System.out.println("reducedParallel : "+reducedParallel);
		
		List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
				  new Product(14, "orange"), new Product(13, "lemon"),
				  new Product(23, "bread"), new Product(13, "sugar"));
		
		List<String> collectorCollection = 
				  productList.stream().map(Product::getProductName).collect(Collectors.toList());
		
		System.out.println(" Product names using map : "+collectorCollection);
		
		String listToString = productList.stream().map(Product::getProductName)
				  .collect(Collectors.joining(", ", "[", "]"));
		
		System.out.println("Product anmes as a String : "+listToString);
		
		//summingInt
		Integer sum =productList.stream().collect(Collectors.summingInt(Product::getProductId));
		System.out.println("Sum of product ids : "+sum);
		
		IntSummaryStatistics statistics = productList.stream()
				  .collect(Collectors.summarizingInt(Product::getProductId));
		
		System.out.println("statistics : "+statistics);
		
		double averagePrice = productList.stream()
				  .collect(Collectors.averagingInt(Product::getProductId));
		
		System.out.println("averagePrice : "+averagePrice);
		
		Product[] products = productList.stream().toArray(Product[]::new);
		
		for(Product p : productList) {
			System.out.println(p.toString());
		}
		
		Map<String, List<Product>> map=productList.stream().collect(Collectors.groupingBy(Product::getProductName));
		System.out.println(map);

		
		
		
		

	}

}
