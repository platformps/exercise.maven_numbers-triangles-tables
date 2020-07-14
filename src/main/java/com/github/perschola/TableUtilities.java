package com.github.perschola;

import java.util.function.Function;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }
    
    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }
    
    public static String getMultiplicationTable(int tableSize) {
        String value = "";
        for (int index = 1; index <= tableSize; index++) {
            value += NumberUtilities.getRange(index, (tableSize+1)*index, index, new Function<Integer, String>() {

                @Override
                public String apply(Integer integer) {
                    return String.format("%5s", (Integer.toString(integer) + " |"));
                }
            });
            value += "\n";
        }
        return value;
    }
}
