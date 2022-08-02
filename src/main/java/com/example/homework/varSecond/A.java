package com.example.homework.varSecond;

public class A extends Thread{
    Foo f;

    public A(Foo f) {
        this.f = f;
        start();
    }

    @Override
    public void run() {
        f.first(this);
    }
}
