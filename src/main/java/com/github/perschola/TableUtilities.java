package com.github.perschola;

import java.util.function.Function;

public class TableUtilities {
    
    /**
     * Produce a small multiplication table (5x5)
     * @return String that represents a multiplication table (5x5)
     */
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }
    
    /**
     * Produce a large multiplication table (10x10)
     * @return String that represents a multiplication table (10x10)
     */
    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }
    
    /**
     * Produce a multiplication table (tableSize x tableSize)
     * @return String that represents a multiplication table (tableSize x tableSize)
     */
    public static String getMultiplicationTable(int tableSize) {
        String value = "";
        for (int index = 1; index <= tableSize; index++) {
            value += NumberUtilities.getRange(index, (tableSize + 1) * index, index, new Function<Integer, String>() {
                
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
