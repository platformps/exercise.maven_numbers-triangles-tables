package com.github.perschola;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String s = "";
        for(int i = start; i < stop; i++){
            if (i % 2 == 0)
                s = s + i;
        }
        return s;
    }


    public static String getOddNumbers(int start, int stop) {
        String s = "";
        for(int i = start; i < stop; i++){
            if (i % 2 == 1)
                s = s + i;
        }
        return s;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String s = "";
        for(int i = start; i < stop; i = i + step)
            s = s + i*i;
        return s;
    }

    public static String getRange(int stop) {
        String s = "";
        for(int i = 0; i < stop; i++){
            s = s + i;
        }
        return s;
    }

    public static String getRange(int start, int stop) {
        String s = "";
        for(int i = start; i < stop; i++){
            s = s + i;
        }
        return s;
    }


    public static String getRange(int start, int stop, int step) {
        String s = "";
        for(int i = start; i < stop; i = i + step){
            s = s + i;
        }
        return s;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String s = "";
        for(int i = start; i < stop; i = i + step){
            int n = 1;
            for(int j = 0; j < exponent; j++)
                n = n * i;
            s = s + n;
        }
        return s;
    }
}
