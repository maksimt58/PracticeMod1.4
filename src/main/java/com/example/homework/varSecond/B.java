package com.example.homework.varSecond;

public class B extends Thread{
    Foo f;

    public B(Foo f) {
        this.f = f;
        start();
    }

    @Override
    public void run() {
        f.second(this);
    }
}