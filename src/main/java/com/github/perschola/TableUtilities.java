package com.github.perschola;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {

        String multitable = "";

        for(int row = 1; row <= tableSize; row++){
            multitable += getMutiplicationRow(row, tableSize);
        }
        return multitable;
    }
    public static String getMutiplicationRow(int number, int size){
        String rowString = "";
        int start_number = number;
        for(int count = 0; count < size; count++){
            if(start_number >= 100){
                rowString += "" + start_number + " |";
            }
            else if(start_number >= 10){
                rowString += " " + start_number + " |";
            }
            else{
                rowString += "  " + start_number + " |";
            }
            start_number += number;
        }
        return rowString + "\n";
    }
}
