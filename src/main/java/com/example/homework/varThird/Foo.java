package com.example.homework.varThird;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class Foo {

    Semaphore s1 = new Semaphore(1);
    Semaphore s2 = new Semaphore(0);
    Semaphore s3 = new Semaphore(0);

    public void first(Runnable r) {
        try {
            s1.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        print("first ");
        s2.release();
    }

    public void second(Runnable r) {
        try {
            s2.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        print("second");
        s3.release();
    }

    public void third(Runnable r) {
        try {
            s3.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        print(" third");
        s1.release();

    }

    protected void print(String str) {
        System.out.print(str);
    }

}
