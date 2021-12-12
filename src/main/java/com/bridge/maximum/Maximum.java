package com.bridge.maximum;

public class Maximum {
    public static void main(String[] args) {

        //for Integers
        Integer a = 5, b = 9, c = 1;
        int intMax = Maximum.getIntMax(a, b, c);
        System.out.println("Integer Maximum : " + intMax);

        //for Floats
        Double x = 5.6, y = 3.4, z = 7.8;
        double floatMax = Maximum.getFloatMax(x, y, z);
        System.out.println("Float Maximum : " + floatMax);

        //for Strings
        String s1 = "apple", s2 = "peach", s3 = "mango";
        String maxString = Maximum.getStringMax(s1, s2, s3);
        System.out.println(maxString);

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

    public static String getStringMax(String s1, String s2, String s3) {
        if (s1.compareTo(s2) < 0) {
            if (s1.compareTo(s3) < 0) {
                return s1;
            }
        } else if (s2.compareTo(s1) < 0) {
            if (s2.compareTo(s3) < 0) {
                return s2;
            }
        } else
            return s3;
        return s3;
    }
}

