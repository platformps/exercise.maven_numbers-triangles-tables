package com.github.perschola;


import jdk.nashorn.internal.runtime.NumberToString;

public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String evenNumbers = "";
        for (int i = start; i < stop; i++) {
            if(i%2==0){
                evenNumbers+= i;
            }
        } return evenNumbers;
    }


    public static String getOddNumbers(int start, int stop) {
        String oddNumbers = "";
        for (int i = start; i < stop; i++) {
           if(i%2!=0){
               oddNumbers+=i;
           }

        }
        return oddNumbers;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String result = "";
        for (int i = start; i < stop; i+=step) {
          result+= i * i;

        }
        return result;
    }

    public static String getRange(int start) {
        String result = "";
        for (int i = 0; i < start; i++) {
             result+=i;

        }
        return result;
    }

    public static String getRange(int start, int stop) {
        String result = "";
        for (int i = start; i < stop; i++) {
             result+= i;

        }
        return result;
    }


    public static String getRange(int start, int stop, int step) {
        String result = "";
        for (int i = start; i < stop; i+=step) {
             result+= i;

        }
        return result;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String result = getRange(start, stop, step);
        String exponentNum = "";
        for (int i = start; i < stop; i+=step) {
           int num = Integer.parseInt(result.valueOf(i));
            exponentNum+= (int)Math.pow(num, exponent);
        }
        return exponentNum;
    }
}
