package com.zeroten.javales.flow;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Cat extends Animal {
    private static Integer a1;
    private static int a2;
    protected int i;
    {
        this.i = 1;
    }

    public void eat() {
        i = 7;
        System.out.println("Cat is eating " + i);

        super.eat();

        super.i = 9;
        super.eat();

        System.out.println("Cat is eating " + i);

        String[] a = "aaa,bbb".split("[,]");
        System.out.println();
    }

    private static void plus1ForEvenIndex(int[] arr) {
        for (int index = 0; index < arr.length; index++) {
            if ((index + 1) % 2 == 0) {
                arr[index] = arr[index] + 1;
            }
        }
    }

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = "hello" + "world";
        String str4 = str2 + "world";
        String str5 = new String("hello");
        String str6 = new String("hello");
        String str7 = str6.intern();
        String str8 = new String("hello").intern();

        System.out.println("str1 = str2, " + (str1 == str2));
        System.out.println("str3 = str4, " + (str3 == str4));
        System.out.println("str1 = str5, " + (str1 == str5));
        System.out.println("str5 = str6, " + (str5 == str6));
        System.out.println("str1 = str7, " + (str1 == str7));
        System.out.println("str1 = str8, " + (str1 == str8));

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str5));
        System.out.println(System.identityHashCode(str6));
    }

}
