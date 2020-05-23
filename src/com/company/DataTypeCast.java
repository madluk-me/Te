package com.company;

public class DataTypeCast {
    public static void main(String[] args) {
        //implicit casting

        byte byteVar = 45;
        short shortVar = byteVar;
        int intVar = shortVar;
        long longVar = intVar;
        float floatVar = longVar;
        double doubleVar = floatVar;

        System.out.println(doubleVar);

        short testVar = 1000;
        byte testByteVAr = (byte)testVar;

        System.out.println(testByteVAr);

        //Expilct casting
        double doubleVarCast = 44.2d;
        float floatVarCast = (float) doubleVarCast;
        long longVarCast = (long)floatVar;
        int intVarCast = (int) longVarCast;
        short shortVarCast = (byte) intVarCast;
        byte byteVarCast = (byte) shortVarCast;

        System.out.println(shortVarCast);

        double getDouble = 49.0;
        double resultDouble = getDouble +getDouble;
        int result = (int)getDouble + (int)getDouble;

        System.out.println("Redult from double:"+resultDouble);
        System.out.println("Result casted from double:"+result);




    }
}
