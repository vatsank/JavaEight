package com.training.example.two;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;



	 public class EightVersion {    
		 
	  public static Map<Integer, List<String>> groupByScores(
	    Map<String, Integer> scores) {
	                                    
	    return scores.keySet()
	                 .stream()
	                 .collect(Collectors.groupingBy(scores::get));
	    
      
	  } 
	  
	  public static void main(String[] args) {
	    Map<String, Integer> scores = new HashMap<>();
	    
	    scores.put("Ramesh", 12);
	    scores.put("Suresh", 15);
	    scores.put("Magesh", 11);
	    scores.put("Nagesh", 15);
	    scores.put("Naresh", 15);
	    scores.put("Janaki", 11);
	    
			    System.out.println(groupByScores(scores));
	  }              
	}


