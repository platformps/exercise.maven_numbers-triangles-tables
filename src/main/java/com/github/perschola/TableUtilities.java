package com.github.perschola;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {



        StringBuilder multiTable = new StringBuilder();
        for(int row = 1; row <= tableSize; row++){
            multiTable.append(getMutiplicationRow(row, tableSize));

        }
        return multiTable.toString();
    }
    public static String getMutiplicationRow(int number, int size){

        StringBuilder rowString = new StringBuilder("");
        int start_number = number;
        for(int count = 0; count < size; count++){
            if(start_number >= 100){

                rowString.append("" + start_number + " |");
            }
            else if(start_number >= 10){

                rowString.append(" " + start_number + " |");
            }
            else{

                rowString.append("  " + start_number + " |");
            }
            start_number += number;
        }
        return rowString + "\n";
    }
}
