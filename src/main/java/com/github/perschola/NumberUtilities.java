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
        int numSquared;
        String allSquaredString = "";
       while(start < stop){
           numSquared = start * start;
           allSquaredString += Integer.toString(numSquared);
           start += step;
       }
       return allSquaredString;

    }

    public static String getRange(int stop) {
        return getRange(0, stop, 1);
    }

    public static String getRange(int start, int stop) {
        return getRange(start, stop,1);
    }


    public static String getRange(int start, int stop, int step) {
        return getExponentiations(start,stop,step,1);
    }


    public static String getExponentiations(int start, int stop, int step, int exponent){
        StringBuilder allExpString = new StringBuilder();
        int total;
        while(start < stop){
            //reset
            int count = 1;
            total = start;

            while(count < exponent){
                total *= start;
                count++;
            }

            allExpString.append(total);
            start += step;
        }
        return allExpString.toString();
    }
}
