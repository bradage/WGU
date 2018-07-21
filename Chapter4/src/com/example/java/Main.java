package com.example.java;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        byte b = 1;
        short sh = 1;
        int i = 1;
        long l = 1;

        float f = 1f;
        double d = 1d;

        d= .012;

        System.out.println("Byte: " + b);
        System.out.println("Byte: " + sh);
        System.out.println("Byte: " + i);
        System.out.println("Byte: " + l);
        System.out.println("Byte: " + f);
        System.out.println("Byte: " + d);

        double pSum = d+d+d;
        System.out.println("Sum of Primitives: " + pSum);

        String strValue = Double.toString(d);
        System.out.println("strValue: " + strValue);
        BigDecimal bigValue = new BigDecimal(strValue);

        BigDecimal bSum = bigValue.add(bigValue).add(bigValue);

        System.out.println("Sum of BigDecimals: "+ bSum.toString());
    }
}