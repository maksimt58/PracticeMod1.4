package com.example.homework.varFirst;

public class Main {
    public static void main(String[] args) {
        Foo f = new Foo();

        A obA = new A(f);
        B obB = new B(f);
        C obC = new C(f);

        try {
            obA.join();
            obB.join();
            obC.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }


    }
}
