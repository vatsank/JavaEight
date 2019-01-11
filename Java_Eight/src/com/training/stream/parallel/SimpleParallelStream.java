package com.training.stream.parallel;
import java.util.Arrays;
import java.util.function.*;
import java.util.stream.*;
public class SimpleParallelStream {

	public void count() {
		final long count = IntStream.range(1, 50)
	            .parallel()
	            .filter(number -> isPrime(number)).count();
	    System.out.println("Count - " + count);
	}
	 
	public boolean isPrime(final int number) {
	    return number > 1
	            && IntStream.rangeClosed(2, (int) Math.sqrt(number)).noneMatch(
	                    divisor -> number % divisor == 0);
	}
	public static void main(String[] args) {
		   
		SimpleParallelStream obj = new SimpleParallelStream();
		obj.count();
		
		Stream.of("Ramesh", "Suresh", "Ganesh", "Magesh", "Rajesh", "Sudan", "Jagan", "Madan").parallel().forEach(System.out::println);
		
		Stream parallelStream = Arrays.asList("Ramesh", "Suresh", "Ganesh", "Magesh", "Rajesh", "Sudan", "Jagan", "Madan").parallelStream(); 
		
		Stream.of("John", "Mike", "Ryan","Donald", "Matthew").parallel().forEach(System.out::println);
		
		Long sum = Stream.iterate(1L, (i)->{return i +1;}).limit(10).reduce(1L,Long::sum);
		
		System.out.println(sum);
		
		
Long sum2 = Stream.iterate(1L, (i)->{return i +1;}).limit(10).parallel().reduce(0L,Long::sum);
		
		System.out.println(sum2);
		
	}
              
	
}
