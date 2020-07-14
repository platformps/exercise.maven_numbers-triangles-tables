package com.github.perschola;


import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumberUtilities {
    
    /**
     * String representation of all even numbers
     *
     * @param start of the range
     * @param stop  of the range
     * @return String that contains all even numbers given in a range with no spaces
     */
    public static String getEvenNumbers(int start, int stop) {
        //First determine if even or not, if not make so
        if (start % 2 != 0) {
            start++;
        }
        return getRange(start, stop, 2);
    }
    
    /**
     * String representation of all odd numbers
     *
     * @param start of the range (inclusive)
     * @param stop  of the range
     * @return String that contains all odd numbers given in a range with no spaces
     */
    public static String getOddNumbers(int start, int stop) {
        //First determine if odd or not, if not make so
        if (start % 2 == 0) {
            start++;
        }
        return getRange(start, stop, 2);
    }
    
    /**
     * String representation of all square numbers
     *
     * @param start of the range (inclusive)
     * @param stop  of the range (exclusive)
     * @return String that contains all square numbers given in a range with no spaces
     */
    public static String getSquareNumbers(int start, int stop, int step) {
        return getRange(start, stop, step, new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return Integer.toString((int) Math.pow(integer, 2));
            }
        });
    }
    
    /**
     * String representation of all values in a range
     *
     * @param stop of the range (exclusive)
     * @return String that contains all numbers given in a range starting at 0 with no spaces, steping at 1
     */
    public static String getRange(int stop) {
        return getRange(0, stop, 1);
    }
    
    /**
     * String representation of all values in a range
     *
     * @param start of the range (inclusive)
     * @param stop  of the range (exclusive)
     * @return String that contains all numbers given in a range with no spaces, steping at 1
     */
    public static String getRange(int start, int stop) {
        return getRange(start, stop, 1);
    }
    
    /**
     * String representation of all values in a range
     *
     * @param start of the range (inclusive)
     * @param stop  of the range (exclusive)
     * @param step  of the next value in range
     * @return String that contains all numbers given in a range with no spaces
     */
    public static String getRange(int start, int stop, int step) {
        return getRange(start, stop, step, String::valueOf);
    }
    
    /**
     * String representation of all values in a range
     *
     * @param start        of the range (inclusive)
     * @param stop         of the range (exclusive)
     * @param step         of the next value in range
     * @param intConverter function that converts an int to a String
     * @return String that contains all numbers given in a range with no spaces
     */
    public static String getRange(int start, int stop, int step, Function<Integer, String> intConverter) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = start; stop > index; index += step) {
            stringBuilder.append(intConverter.apply(index));
        }
        return stringBuilder.toString();
    }
    
    /**
     * Stream of Integers given between a range
     *
     * @param start of the range (inclusive)
     * @param stop  of the range (exclusive)
     * @param step  of the next value in range
     * @return Stream of Integers that fall between a certain range while stepping a certain amount
     */
    public static IntStream getRangeS(int start, int stop, int step) {
        return IntStream.iterate(start, value -> value + step).limit(stop);
    }
    
    /**
     * String representation of values given in range
     *
     * @param start    of range
     * @param stop     of range
     * @param step     of the next value in range
     * @param exponent of the step, step^exponent
     * @return a String that contains all values within a range each step exponentially
     */
    public static String getExponentiations(int start, int stop, int step, int exponent) {
        return getRange(start, stop, step, new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return Integer.toString( (int) Math.pow(integer.doubleValue(), exponent));
            }
        });
    }
}
