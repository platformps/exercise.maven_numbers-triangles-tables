package com.github.perschola;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String args="";
        for (int i=start; i <stop;i++) {
            if (i % 2 == 0) {
                args += i;
            }
        }
        return args;
    }


    public static String getOddNumbers(int start, int stop) {
        String args="";
        for (int i=start; i <stop;i++) {
            if (i % 2 != 0) {
                args += i;
            }
        }
        return args;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String args="";
        for (int i=start; i < stop; i+=step){
            args+=i*i;
        }
        return args;
    }

    public static String getRange(int stop) {
        String args="";
        for (int i=0; i < stop; i++){
            args+=i;
        }
        return args;

    }

    public static String getRange(int start, int stop) {
        String args="";
        for (int i=start; i < stop; i++){
            args+=i;
        }
        return args;
    }


    public static String getRange(int start, int stop, int step) {
        String args="";
        for (int i=start; i < stop; i+=step){
            args+=i;
        }
        return args;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String args="";
        for (int i=start; i < stop; i+=step){
            int x=1;
            for (int y=0; y<exponent; y++){
                x*=i;
                args+=x;
            }
        }
        return args;
    }
}
