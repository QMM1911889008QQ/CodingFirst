package com.zeroten.javales.flow;

public class Animal {
    protected int i = 5;
    protected void eat() {
        System.out.println("Animals eat." + i);
        i = i + 1;
    }
}
