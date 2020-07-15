package com.github.perschola;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String even = "";
        if (start % 2 == 0){
            start= start+1;
        }
        for (int i = start; i < stop; i++) {
            even += (i);
            i++;
        }
        return even;
    }


    public static String getOddNumbers(int start, int stop) {
        String odd = "";
        if (start % 2 == 1){
            start+=1;
        }
        for (int i = start; i < stop; i++) {
            odd += (i);
            i++;
        }
        return odd;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String square = "";
        for (int i = start; i < stop; i+=step) {
            square += (i*i);
        }
        return square;
    }

    public static String getRange(int start) {
        String range = "";
        for (int i = 0; i < start; i++) {
            range += i;
        }
        return range;
    }

    public static String getRange(int start, int stop) {
        String range = "";
        for (int i = start; i < stop; i++) {
            range += i;
        }
        return range;
    }


    public static String getRange(int start, int stop, int step) {
        String range = "";
        for (int i = start; i < stop; i += step) {
            range += i;
        }
        return range;
    }


    public static String getExponentiation(int start, int stop, int step, int exponent) {
        String exp = "";
        for (int i = start; i < stop; i += step) {
            exp += ((int)(Math.pow(i, exponent)));
        }
        return exp;
    }
}
