package com.training.lambda.ifaces;

@FunctionalInterface
public interface MyFilter<T> {

	public boolean test(T obj);
}
