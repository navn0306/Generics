package com.bridge.maximum;

import java.util.*;

public class Maximum<T extends Comparable> {

    T a, b, c;

    //constructor
    public Maximum(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T Maximum() {
        return Maximum.maximum(a, b, c);
    }

    public static <T extends Comparable> T maximum(T a, T b, T c) {
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
            return a;
        } else if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
            return b;
        } else {
            return c;
        }
    }

    public static <T extends Comparable> T getMax(T a, T b, T c) {
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
            return a;
        } else if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Integer intMax = getMax(7, 2, 9);
        System.out.println(intMax);
        double floatMax = getMax(7.5, 9.9, 10.4);
        System.out.println(floatMax);
        String stringMax = getMax("Mango", "Apple", "Pineapple");
        System.out.println(stringMax);
    }

    public static <T extends Comparable> T Maximum(T... a) {
        Arrays.sort(a);
        return a[a.length - 1];
    }

    @Override
    public String toString() {
        return "Maximum{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}