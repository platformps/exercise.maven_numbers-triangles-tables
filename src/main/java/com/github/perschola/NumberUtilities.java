package com.github.perschola;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String numbers = "";
        if (start % 2 == 0){
            start= start+1;
        }
        for (int i = start; i < stop; i++) {
            numbers += (i);
            i++;
        }
        return numbers;
    }


    public static String getOddNumbers(int start, int stop) {
        String numbers = "";
        if (start % 2 == 1){
            start= start+1;
        }
        for (int i = start; i < stop; i++) {
            numbers += (i);
            i++;
        }
        return numbers;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String squares = "";
        for (int i = start; i < stop; i+=5) {
            squares += i * i;
        }
        return squares;
    }

    public static String getRange(int stop) {
        return getExponentiations(0, stop, 1, 1);
    }

    public static String getRange(int start, int stop) {
        return getExponentiations(start, stop, 1, 1);
    }


    public static String getRange(int start, int stop, int step) {
       return getExponentiations(start, stop, step, 1);
    }



    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String numbers = "";
        for (int i = start; i < stop; i += step) {
            numbers += (int)(Math.pow(i, exponent));
        }
        return numbers.toString();
    }
}
