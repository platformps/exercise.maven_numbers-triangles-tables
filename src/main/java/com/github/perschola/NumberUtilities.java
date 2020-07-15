package com.github.perschola;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder addValue = new StringBuilder();
        for (int i = start; i < stop ; i ++){
            if (i % 2 == 0) {
                addValue.append(i);
            }
        }
        return addValue.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder addValue = new StringBuilder();
        for (int i = start; i < stop; i+= 2){
            if (i % 2 != 0){
                addValue.append(i);
            }

        }
        return addValue.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder squareValue = new StringBuilder();
        for (int i = start; i < stop; i +=step) {
            squareValue.append(i * i);
        }

        return squareValue.toString();
    }

    public static String getRange(int start) {
        StringBuilder addValue = new StringBuilder();
        for (int i = 0; i < start; i++){
            addValue.append(i);
        }
        return addValue.toString();
    }

    public static String getRange(int start, int stop) {
        StringBuilder addRange = new StringBuilder();
        for (int i = start; i < stop; i++)
        {
            addRange.append(i);
        }
        return addRange.toString();
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder addRange = new StringBuilder();
        for (int i = start; i < stop; i+=step)
        {
            addRange.append(i);
        }
        return addRange.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder convertExp = new StringBuilder();
        for (int i = start; i < stop; i += step) {
            convertExp.append((int)Math.pow(i,exponent));
        }
        return convertExp.toString();
    }
}
