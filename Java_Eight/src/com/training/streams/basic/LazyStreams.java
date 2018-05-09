package com.training.streams.basic;
import java.util.stream.Stream;

public class LazyStreams {

	public static void main(String[] args) {

	    Stream.iterate(0, n->n+2)
        .peek(num -> System.out.println("Peeked at:"+num))
        .limit(5)
        .forEach(System.out::println);
}

	

}
