package com.training.example.first;

import java.util.*;

class Sample {    
  public static Map<Integer, List<String>> groupByScores(
    Map<String, Integer> scores) {
    
    Map<Integer, List<String>> byScores = new HashMap<>();
    for(String name : scores.keySet()) {
      int score = scores.get(name);

      List<String> names = new ArrayList<>();
      if(byScores.containsKey(score))
        names = byScores.get(score);

      names.add(name);
      byScores.put(score, names);
    }                            

    return byScores;
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
