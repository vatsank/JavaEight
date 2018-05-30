package com.training.nio.stream;
import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.stream.*;

import javax.naming.directory.BasicAttributes;


public class ReadingFiles {

	 public static void readFiles(){
		 
		   try {
	            long noOfWords = Files.lines(Paths.get("F:\\data\\Country.txt"))
	                                    .flatMap(line->Arrays.stream(line.split(",")))
	                                    .distinct()
	                                    .count();
	            System.out.println("noOfWords: "+noOfWords);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	 }
	public static void listFiles(String directory){
		
		try (Stream<Path> stream = Files.list(Paths.get(directory))) 
		{ 
		Stream<String> capStream = stream.map(String::valueOf) .peek(e -> System.out.println(e)).filter(path -> path.endsWith(".txt"));
		    	capStream.forEach(System.out::println); 
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
	
	public static void findFiles()
	{
		try (Stream<Path> stream = Files.find(Paths.get("F:\\javaSE"), 3,
				   (path, attr) -> String.valueOf(path).endsWith(".txt"),FileVisitOption.FOLLOW_LINKS)) 
		            {
			          stream.map(String::valueOf).forEach(System.out::println); 
			         } catch (IOException e) {
						e.printStackTrace();
					}

		


	}
	public static void main(String[] args) {

//		  listFiles("F:\\data");
	  
		//  findFiles();
		  
		  readFiles();
	
	}

}


