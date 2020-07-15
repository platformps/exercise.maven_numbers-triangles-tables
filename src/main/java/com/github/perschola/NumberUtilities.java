package com.github.perschola;


public class NumberUtilities {

    public static String getEvenNumbers(int start, int stop) {
        String even = "";
        for (int i = start; i < stop; i++) {
            if(i%2 == 0){
                even = even + i;
            }
        }
        return even;
    }


    public static String getOddNumbers(int start, int stop) {
        String odd = "";
        for (int i = start; i < stop; i++) {
            if(i%2 != 0){
                odd = odd + i;
            }
        }
        return odd;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String square = "";
        for (int i = start; i < stop; i=i+step) {
                square = square + (i*i);
        }
        return square;
    }

    public static String getRange(int stop) {
        String range = "";
        for (int i = 0; i < stop; i++) {
            range = range + i;
        }
        return range;
    }

    public static String getRange(int start, int stop) {
        String range = "";
        for (int i = start; i < stop; i++) {
            range = range + i;
        }
        return range;
    }


    public static String getRange(int start, int stop, int step) {
        String range = "";
        for (int i = start; i < stop; i = i+step) {
            range = range + i;
        }
        return range;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String exp = "";
        for (int i = start; i < stop; i = i+step) {
            exp = exp + ((int)(Math.pow(i, exponent)));
        }
        return exp;
    }
}
