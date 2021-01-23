package com.company;

public class Calc {
    public void checkSize(String[][] values){
        if (values.length != 4) {
            throw new MyArraySizeException("Size must be exactly 4");
        }
        for (int i = 0; i < values.length; i++){
            if (values[i].length != 4) {
                throw new MyArraySizeException("Size must be exactly 4");
            }
        }
    }

    public int calc(String[][] values){

        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                try {
                    sum += Integer.parseInt(values[i][j]);
                } catch (NumberFormatException e) {
                    String message = String.format("Array[%s][%s] contains no digit", i, j);
                    throw new MyArrayDataException(message, e);
                }
            }
        }

        return sum;
    }
}