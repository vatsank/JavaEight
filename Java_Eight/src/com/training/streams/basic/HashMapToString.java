package com.training.streams.basic;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public class HashMapToString {

	public static void main(String[] args) {
		Map<String, String> hashMap = new HashMap<>();

		hashMap.put("RED", "#FF0000");
		hashMap.put("BLUE", "#0000FF");
		hashMap.put("BLACK", "#000000");
		hashMap.put("GREEN", "#008000");
		hashMap.put("BROWN", "#A52A2A");

		String filteredMap = hashMap.entrySet()
								.stream()
								.filter(entry -> entry.getKey().startsWith("B"))
								.map(Map.Entry::toString).collect(Collectors.joining(", ", "{", "}"));

		System.out.println(filteredMap);
		

             Map<String, String> filteredMap2 = hashMap.entrySet().stream()
		.filter(entry -> entry.getKey().startsWith("B"))
		.collect(Collectors.toMap(Map.Entry::getKey, 
								Map.Entry::getValue)
				);

System.out.println(filteredMap);
}
}



