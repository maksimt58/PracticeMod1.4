package com.example.homework.varThird;

import java.util.concurrent.locks.ReentrantLock;

public class Foo {

    ReentrantLock lock = new ReentrantLock();

    public void first(Runnable r) {
        lock.lock();
        print("first ");
        lock.unlock();
    }

    public void second(Runnable r) {
        try {
            Thread.sleep(1000);
            lock.lock();
            print("second");
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void third(Runnable r) {
        try {
            Thread.sleep(1500);
            lock.lock();
            print(" third");
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected void print(String str) {
        System.out.print(str);
    }

}
