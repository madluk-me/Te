package com.company;

public class TaskVariable {
    //psvm
    public static void main(String[] args) {

        int farenHeitTemp  = 130;
        int c = (farenHeitTemp -32) * 5 / 9;
       // System.out.println("C = "+ c);

    double min = 10000.00;
    double day = min * 0.000694;
        System.out.println("Days= "+day);
    double years = min / 525600;
        System.out.println("Years = "+years);

        int getMin = 10000;
        int getH = getMin / 60;
        int getD = getH / 24;
        int getY = getD / 365;
        System.out.println(getMin +" min to days "+getD);
        System.out.println(getMin +" min to yers "+getY);





    }


}

