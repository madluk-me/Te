package com.company;

public class DataTypeNumberic {

    public static void main(String[] args) {
        int intNumber = 20;
        long longNumber = 20005L;
        byte byteNumber = 127;
        short shortNumber = 2000;

        double doubleNumber = 20.00000000000000999999;
        float floatNumber = 21.666666999999994f;

        // S = a * b
        // P = a * 2 + b * 2
        //int type
        //double type
        int a = 30;
        int b = 20;

        int s = a * b;
        int p =  a * 2 + b * 2;
        System.out.println("Area is:" + s);
        System.out.println("Perimeter is:" + p);

        double aDouble = 30;
        double bDouble = 20;
        double sDouble = aDouble * bDouble;
        double pDouble = aDouble * 2 + bDouble * 2;

        System.out.println("Area is:" + sDouble);
        System.out.println("Perimeter is:" + pDouble);



    }
}