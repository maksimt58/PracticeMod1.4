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
            Thread.sleep(100);
            lock.lock();
            print("second");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void third(Runnable r) {
        try {
            Thread.sleep(150);
            lock.lock();
            print(" third");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    protected void print(String str) {
        System.out.print(str);
    }

}
