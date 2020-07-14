package com.github.perschola;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        int size = 5;
        int start_number;
        int muitply;
        String rowString = "";
        String mulitTable = "";

        for(int row = 0; row < size; row++){
            rowString = "";
            muitply = (row + 1);
            start_number = (row + 1);
            for(int column = 0; column < size; column++){
                if(start_number >= 10){
                    rowString += " " + Integer.toString(start_number) + " |";
                }
                else {
                    rowString += "  " + Integer.toString(start_number) + " |";
                }
                start_number += muitply;
            }
            mulitTable += rowString + "\n";
        }
        return mulitTable;
    }

    public static String getLargeMultiplicationTable() {
        return null;
    }

    public static String getMultiplicationTable(int tableSize) {
        return null;
    }
}
