package com.training.forkjoin;

import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class Fibonacci extends RecursiveTask<Long> {

final long n;
    
    Fibonacci(long n) {
        this.n = n;
    }
    
    public Long compute() {
        if (n<=10) {
            return do_fibonacci(n);
        }
        ForkJoinTask<Long> subTask = new Fibonacci(n-1).fork();
        return new Fibonacci(n-2).compute() + subTask.join();
    }
    
    static long do_fibonacci(long n) {
        if ( n<=1 ) return n;
        return do_fibonacci(n-1) + do_fibonacci(n-2);
    }

}


