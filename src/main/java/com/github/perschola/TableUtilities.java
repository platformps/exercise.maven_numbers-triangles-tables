package com.github.perschola;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(4);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String result = "";
        for (int i = 1; i <= tableSize; i++) {
             result += getLine(i, tableSize);
        }
        return result;
    }

    public static String getLine(int lineNumber, int tableSize) {
        String result = "  " + lineNumber + " | ";
        if(lineNumber >= 10) result = " " + lineNumber + " |";
        if(lineNumber >= 100) result = "" + lineNumber + " | ";
        for (int i = 2; i <= tableSize; i++) {
            if(i * lineNumber < 10) {
                result += (i * lineNumber) + " |  ";
            } else if(i * lineNumber >= 10) {
                result += (i * lineNumber) + " | ";
            } else {
                result += (i * lineNumber) + " |";
            }

        }
        return result + "\n";
    }
}
