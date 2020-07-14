package com.github.perschola;


import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        //First determine if even or not, if not make so
        if(start % 2 != 0){
            start++;
        }
        return getRange(start, stop, 2);
    }


    public static String getOddNumbers(int start, int stop) {
        //First determine if odd or not, if not make so
        if(start % 2 == 0){
            start++;
        }
        return getRange(start, stop, 2);
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder  stringBuilder = new StringBuilder();
        for(int index = start; stop > index; index += step){
            stringBuilder.append(Integer.toString((int)Math.pow(index, 2)));
        }
        return stringBuilder.toString();
    }

    public static String getRange(int stop) {
        return getRange(0, stop, 1);
    }

    public static String getRange(int start, int stop) {
        return getRange(start, stop, 1);
    }


    public static String getRange(int start, int stop, int step) {
        return getRange(start, stop, step, String::valueOf);
    }
    
    public static String getRange(int start, int stop, int step, Function<Integer, String> intConverter){
        StringBuilder  stringBuilder = new StringBuilder();
        for(int index = start; stop > index; index += step){
            stringBuilder.append(intConverter.apply(index));
        }
        return stringBuilder.toString();
    }
    
    public static IntStream getRangeS(int start, int stop, int step){
       return IntStream.iterate(start, value -> value + step).limit(stop);
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        return getRange(start, stop, step, new Function<Integer, String>(){
            @Override
            public String apply(Integer integer) {
                return Integer.toString((int)Math.pow(integer, exponent));
            }
        });
    }
}
