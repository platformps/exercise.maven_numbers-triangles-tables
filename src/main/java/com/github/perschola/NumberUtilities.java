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
        String result = "";
        for (int i = start; i < stop; i+=step) {
            result = result + i*i;
        }
        return result;
    }

    public static String getRange(int start) {
        String result = "";

        for (int i = 0; i < start; i++) {
            result = result + i;
        }
        return result;
    }

    public static String getRange(int start, int stop) {
        String result = "";

        for (int i = start; i < stop; i++) {
            result = result + i;
        }
        return result;
    }


    public static String getRange(int start, int stop, int step) {
        String result = "";

        for (int i = start; i < stop; i+=step) {
            result = result + i;
        }
        return result;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String result = "";
        for (int i = start; i < stop; i+=step) {
            int newNum = (int)Math.pow(i, exponent);
            result = result +  newNum;
        }
        return result;
    }
}
