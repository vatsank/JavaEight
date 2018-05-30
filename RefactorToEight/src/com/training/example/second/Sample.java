package com.training.example.second;

import java.io.*;

public class Sample {    
  public static void main(String[] args) {
    try {
      String searchWord = "localhost";
      String path = "/etc/hosts";
      
      long count = 0;
      BufferedReader bufferedReader =
        new BufferedReader(new FileReader(path));

      String line = null;

      while((line = bufferedReader.readLine()) != null) {
        if(line.contains(searchWord))
          count++;
      }

      System.out.printf("The word %s occured %d times\n", searchWord, count);
    } catch(IOException ex) {
      System.out.println(ex.getMessage());
    }
  }              
}
