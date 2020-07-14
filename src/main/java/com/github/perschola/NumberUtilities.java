package com.github.perschola;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String allEvenNumbers = "";
        while(start < stop){

            if(start % 2 == 0){
                allEvenNumbers += Integer.toString(start);
                start += 2;
            }
            else{
                start++;
            }
        }
        return allEvenNumbers;
    }


    public static String getOddNumbers(int start, int stop) {
        String allOddNumbers = "";
        while(start < stop){
            if(start % 2 != 0){
                allOddNumbers += Integer.toString(start);
                start += 2;
            }
            else{
                start++;
            }
        }
        return allOddNumbers;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        int numSqaured;
        String allSquaredString = "";
       while(start < stop){
           numSqaured = start * start;
           allSquaredString += Integer.toString(numSqaured);
           start += step;
       }
       return allSquaredString;

    }

    public static String getRange(int stop) {
        int start = 0;
        String rangeOfNums = "";
        while(start != stop){
            String nextNumber = Integer.toString(start);
            rangeOfNums += nextNumber;
            start++;
        }
        return rangeOfNums;
    }

    public static String getRange(int start, int stop) {
        String rangeOfNums = "";
        while(start < stop){
            String nextNumber = Integer.toString(start);
            rangeOfNums += nextNumber;
            start++;
        }
        return rangeOfNums;
    }


    public static String getRange(int start, int stop, int step) {
        String rangeOfNums = "";
        while(start < stop){
            String nextNumber = Integer.toString(start);
            rangeOfNums += nextNumber;
            start += step;
        }
        return rangeOfNums;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent){
        String allExpoString = "";
        int total = start;
        while(start < stop){
            //reset
            int count = 1;
            total = start;

            while(count < exponent){
                total *= start;
                count++;
            }

            allExpoString += Integer.toString(total);
            start += step;
        }
        return allExpoString;
    }
}
