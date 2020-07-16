package com.github.perschola;


public class NumberUtilities {

    public static String getEvenNumbers(int start, int stop) {
        String result = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        return result;
    }


    public static String getOddNumbers(int start, int stop) {
        String result = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 == 1) {
                result += i;
            }
        }
        return result;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String result = "";
        for (int i = start; i < stop; i += step) {
            result += i * i;

        }

        return result;
    }

    public static String getRange(int stop) {
        String result = "";
        for (int i = 0; i < stop; i++) {
            result += i;
        }
        return result;
    }

    public static String getRange(int start, int stop) {
        String result = "";
        for (int i = start; i < stop; i++) {
            result += i;
        }
        return result;
    }


    public static String getRange(int start, int stop, int step) {
        String result = "";
        for (int i = start; i < stop; i += step) {
            result += i;
        }
        return result;
    }
/**
four integers: start, stop, step, exponent
 return a String concatenation of all values, raised to the specified exponent,
 between start up to and not including stop, incrementing by the specified step.

*/


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String result = "";
        for (int i = start; i < stop;  i = i+step) {
            result = result + String.valueOf((int) Math.pow(i, exponent));
        }
        return result;
    }


    }