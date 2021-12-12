package com.bridge.maximum;

public class Maximum {
    public static void main(String[] args) {

        Integer a = 5, b = 9, c = 1;
        int max = Maximum.getMax(a, b, c);
        System.out.println(max);
    }

    public static int getMax(Integer a, Integer b, Integer c) {
        if (a > b && a > c)
            return a;
        else if (b > a && b > c)
            return b;
        else
            return c;
    }
}

