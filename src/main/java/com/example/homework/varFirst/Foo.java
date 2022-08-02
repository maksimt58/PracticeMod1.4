package com.example.homework.varFirst;

public class Foo {

    public void first(Runnable r) {
        print("first");
    }

    public void second(Runnable r) {
        print("second");
    }

    public void third(Runnable r) {
        print("third");
    }

    private void print(String str) {
        System.out.print(str);
    }

}
