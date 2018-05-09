package com.training.stream.parallel;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.stream.Stream;

public class SeqParallelComparison {

	public static void main(String[] args) {
        String[] names = {"Ramesh", "Suresh", "Ganesh", "Magesh", "Rajesh", "Sudan", "Jagan", "Madan"};

        System.out.println("-------Running sequential -------");
        
        run(Arrays.stream(names).sequential());
        
        System.out.println("-------\n Running parallel\n-------");
        run(Arrays.stream(names).parallel());
	}


    public static void run (Stream<String> stream) {

        stream.forEach(s -> {
            System.out.println(LocalTime.now() + " - value: " + s +
                                " - thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }


	}


