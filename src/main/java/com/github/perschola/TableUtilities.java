package com.github.perschola;

public class TableUtilities {
    public static String getSmallMultiplicationTable(int tableSize) {
        String product = "";
            for(int i=1; i<=4; i++) {
                tableSize = 4;
                product = String.valueOf(i * (i++));
    }
            return product;
}
    public static String getLargeMultiplicationTable(int tableSize) {
        String product = "";
        tableSize = 10;
            for(int i=1; i<=tableSize; i++) {
                product = String.valueOf(i * (i++));
            }
            return product;
    }

    public static String getMultiplicationTable(int tableSize) {
        String product = "";
        tableSize = 4;
            for(int i=1; i<=tableSize; i++) {
                product = String.valueOf(i * (i++));
            }
            return product;
        }

}
