package com.example.homework.varSecond;

public class C extends Thread{
    Foo f;

    public C(Foo f) {
        this.f = f;
        start();
    }

    @Override
    public void run() {
        f.third(this);
    }
}