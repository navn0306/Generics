package com.bridge.maximum;

public class Maximum {
    public static void main(String[] args) {

        Integer a = 5, b = 9, c = 1;
        int intMax = Maximum.getIntMax(a, b, c);
        System.out.println("Integer Maximum : "+intMax);

        Double x = 5.6, y = 3.4, z = 7.8;
        double floatMax = Maximum.getFloatMax(x, y, z);
        System.out.println("Float Maximum : "+floatMax);
    }

    public static int getIntMax(Integer a, Integer b, Integer c) {
        if (a > b && a > c)
            return a;
        else if (b > a && b > c)
            return b;
        else
            return c;
    }

    public static double getFloatMax(Double x, Double y, Double z) {
        if (x > y && x > z)
            return x;
        else if (y > x && y > z)
            return y;
        else
            return z;
    }
}

