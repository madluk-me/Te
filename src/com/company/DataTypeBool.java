package com.company;

import java.sql.SQLOutput;

public class DataTypeBool {
    public static void main(String[] args) {
        boolean varBoolTrue = true;
        boolean varBoolFalse = false;

        System.out.println(varBoolFalse);
        System.out.println(varBoolTrue);

        //<>==
        System.out.println("------------------------------------------");
        System.out.println(1>4);
        System.out.println(1<4);
        System.out.println(1==4);
        System.out.println(4==4);
        System.out.println('A'=='A');
        System.out.println('A'=='a');
        System.out.println(true ==false);

        System.out.println("------------------");
        int number1 = 688;
        int number2 = 33;

        boolean checkLessThan = number1 < number2;
        boolean checkGreaterThan = number1 > number2;
        boolean checkEqualsThan = number1 == number2;

        System.out.println("Is number "+ number1+ " less than "+number2);
        System.out.println("It is "+checkLessThan);
        System.out.println("Is number "+ number1+ " greater than "+number2);
        System.out.println("It is "+checkGreaterThan);
        System.out.println("Is number "+ number1+ " equal "+number2);
        System.out.println("It is "+checkEqualsThan);




    }
}
