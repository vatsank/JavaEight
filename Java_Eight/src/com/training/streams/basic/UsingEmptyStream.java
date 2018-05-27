package com.training.streams.basic;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingEmptyStream {
	
	public static Stream<Integer> getMap(Stream<Integer>  intStream){
		

    List<Integer> list =  intStream.filter(e -> e % 2 ==0 ).map(e -> e* 2).collect(Collectors.toList());
		
     if(list.isEmpty())
		return Stream.empty();
     else return list.stream();
		
	}

	public static void main(String[] args) {
	
		//Stream<Integer> values = Stream.of(1,3,5);
		
		Stream<Integer> values = Stream.of(2,4,6);
 
		int result = (int)getMap(values).count();
		
		System.out.println(result);

	}

}
