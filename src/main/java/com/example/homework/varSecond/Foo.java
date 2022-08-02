package com.example.homework.varSecond;

public class Foo {

    boolean isPrint = false;
    boolean isPrintThird = false;

    public synchronized void first(Runnable r) {
        print("first");
        isPrint = true;
        notifyAll();
    }
    public synchronized void second(Runnable r) {
        while (!isPrint) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        print("second");
        isPrintThird = true;
        notify();
    }
    public synchronized void third(Runnable r) {
        while (!isPrintThird) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        print("third");
    }

    private void print(String str){
        System.out.print(str);
    }

}
