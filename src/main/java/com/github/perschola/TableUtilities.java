package com.github.perschola;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String table = "";
        int product;
        int rows = 1;
        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                product = j * i;
                //the following accounts for differing product lengths
                if ( product < 10) {
                    table += "  " + product + " |";
                }
                if (product >=10 && product < 100) {
                    table += " " + product + " |";
                }
                if (product >= 100) {
                    table += product + " |";
                }
                //if j*i/tableSize = rows end the row then increment rows
                if (product / tableSize == rows) {
                    table += "\n";
                    rows++;
                }
            }
        }
        return table;
    }
}
