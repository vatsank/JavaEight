package com.training.stream.parallel;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class CompareSeqAndParallel {

	public static void main(String[] args) {
		
		int max = 100000;
		List<String> values = new ArrayList<>(max);
		for (int i = 0; i < max; i++) {
		    UUID uuid = UUID.randomUUID();
		    values.add(uuid.toString());
		}
		
		
		long t0 = System.nanoTime();

		long count = values.stream().sorted().count();
		System.out.println(count);

		long t1 = System.nanoTime();

		long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
		System.out.println(String.format("sequential sort took: %d ms", millis));

		
		
		long pt0 = System.nanoTime();

		long pcount = values.parallelStream().sorted().count();
		System.out.println(pcount);

		long pt1 = System.nanoTime();

		long pmillis = TimeUnit.NANOSECONDS.toMillis(pt1 - pt0);
		System.out.println(String.format("parallel sort took: %d ms", pmillis));

	}

}
