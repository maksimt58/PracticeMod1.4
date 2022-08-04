package com.example.homework.varThird;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Foo foo = new Foo();

        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();

        CompletableFuture.runAsync(() -> {
            foo.second(t2);
        });

        CompletableFuture.runAsync(() -> {
            foo.third(t3);
        });

        CompletableFuture.runAsync(() -> {
            foo.first(t1);
        });

        Thread.sleep(1000);
    }
}