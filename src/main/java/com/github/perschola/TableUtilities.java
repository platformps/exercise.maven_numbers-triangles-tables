package com.github.perschola;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        int size = tableSize;
        String rowString = "";
        String multitable = "";

        for(int row = 1; row <= size; row++){
            multitable += getMutiplicationRow(row, tableSize);
        }
        return multitable;
    }
    public static String getMutiplicationRow(int number, int size){
        String rowString = "";
        int start_number = number;
        for(int count = 0; count < size; count++){
            if(start_number >= 100){
                rowString += "" + Integer.toString(start_number) + " |";
            }
            else if(start_number >= 10){
                rowString += " " + Integer.toString(start_number) + " |";
            }
            else{
                rowString += "  " + Integer.toString(start_number) + " |";
            }
            start_number += number;
        }
        return rowString + "\n";
    }
}
