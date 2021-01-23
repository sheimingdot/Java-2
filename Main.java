package com.company;

public class Main {

    public static void main(String[] args) {
        String[][] values = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
        };
        Calc arrayCalc = new Calc();
        arrayCalc.calc(values);
        arrayCalc.checkSize(values);
        System.out.println(arrayCalc.calc(values));
    }

}