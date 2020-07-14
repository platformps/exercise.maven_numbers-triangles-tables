package com.github.perschola;

/**
 *Given two integers, start, and stop,
 * return a String concatenation of all even integers between start up to and not including stop.
 */

public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        if (start % 2 == 0)
            return getRange(start, stop, 2);
        else
            return getRange(start+1, stop, 2);

        //return null;
    }


    public static String getOddNumbers(int start, int stop) {
        if (start % 2 == 0)
            return getRange(start+1, stop, 2);
        else
            return getRange(start, stop, 2);
        //return null;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        return getExponentiations(start, stop, step, 2);
        //return null;
    }

    /**
     * Given an integer, stop, return a String concatenation of all integers between 0 up to and not including stop.
     * Example
     * @param stop
     * @return
     */
    public static String getRange(int stop) {
         return getRange(0, stop, 1);
        //return null;
    }

    /**
     * Given two integers, start, and stop, return a String concatenation of all integers between start up to and not including stop.
     * @param start
     * @param stop
     * @return
     */
    public static String getRange(int start, int stop) {
        return getRange(start, stop, 1);
        //return null;
    }

    /**
     * Given three integers, start, stop, and step return
     * a String concatenation of all integers between start, incrementing by step, up to and not including stop.
     * @param start
     * @param stop
     * @param step
     * @return
     */
    public static String getRange(int start, int stop, int step) {
        String result = "";
        for (int i = start; i < stop; i+=step){
            result += String.valueOf(i);
        }
        return result;
        //return null;
    }

    /**
     * Given four integers, start, stop, step, and exponent,
     * return a String concatenation of all values, raised to the specified exponent,
     * between start up to and not including stop, incrementing by the specified step.
     * @param start
     * @param stop
     * @param step
     * @param exponent
     * @return
     */
    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String result = "";
        for (int i = start; i < stop; i+=step)
            result += String.valueOf((int)Math.pow(i,exponent));
        return result;

        //return null;
    }
}
