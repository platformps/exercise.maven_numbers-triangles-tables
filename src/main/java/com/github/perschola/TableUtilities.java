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
        String result = "";

        for(int i = 1; i <= tableSize; i++) {
            result += getLine(i, tableSize);
            result += "\n";
        }

        return result;
    }

    public static String getLine(int lineNumber, int tableSize) {
        String line = "";
        for(int i = 1; i <= tableSize; i++) {
            if((i*lineNumber < 10) && (i*lineNumber >= 0)) { line += "  "; }
            else if((i*lineNumber >= 10) && (i*lineNumber < 100)) { line += " "; }

            line += i*lineNumber + " |";
        }
        return line;
    }

}
