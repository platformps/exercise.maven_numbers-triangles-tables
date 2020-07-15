package com.github.perschola;

import org.w3c.dom.ls.LSOutput;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String output = "";
        for(int i = 1 ;i<=tableSize;i++) {
                output += i;
            }
return output;
    }
}
