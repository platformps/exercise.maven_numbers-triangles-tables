package com.github.perschola;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String count = "";
        if (start%2==0) {
            for (int i = start; i < stop; i += 2) {
                if (i < stop) {
                    count = count + i;
                }
            }
        } else {
            start = start+=1;
            for (int i = start; i <= stop; i += 2) {
                if (i < stop) {
                    count = count + i;
                }
            }

        }
        return count;
    }


    public static String getOddNumbers(int start, int stop) {
        String count = "";
        if (start%2!=0) {
            for (int i = start; i < stop; i += 2) {
                if (i < stop) {
                    count = count + i;
                }
            }
        } else {
            start = start+=1;
            for (int i = start; i <= stop; i += 2) {
                if (i < stop) {
                    count = count + i;
                }
            }

        }
        return count;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        return null;
    }

    public static String getRange(int start) {
        return null;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {
        return null;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        return null;
    }
}
