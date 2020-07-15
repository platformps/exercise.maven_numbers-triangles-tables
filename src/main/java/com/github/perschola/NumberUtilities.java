package com.github.perschola;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        if(start % 2 != 0) {
            start += 1;
        }
        return getRange(start, stop, 2);
    }


    public static String getOddNumbers(int start, int stop) {
        if(start % 2 == 0) {
            start += 1;
        }
        return getRange(start, stop, 2);
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String result = "";
        for (int i = start; i < stop; i += step) {
            result += i*i;
        }

        return result;
    }


    public static String getRange(int stop) {
        return getRange(0, stop, 1);
    }


    public static String getRange(int start, int stop) {
        return getRange(start, stop, 1);
    }


    public static String getRange(int start, int stop, int step) {
        String result = "";
        for (int i = start; i < stop; i += step) {
            result += i;
        }

        return result;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String result = "";
        for (int i = start; i < stop; i += step) {
            result += (int)Math.pow(i, exponent);
        }

        return result;
    }
}
