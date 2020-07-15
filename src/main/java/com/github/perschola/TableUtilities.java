package com.github.perschola;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder multiplicationTable = new StringBuilder();
        int multiply;
        for (int i = 1; i <= tableSize; i++) {

            for (int j = 1; j <= tableSize; j++) {
                multiply = i * j;
                if (multiply < 10)
                    multiplicationTable.append("  ");
                else if (multiply < 100)
                    multiplicationTable.append(" ");
                multiplicationTable.append(multiply + " |");
            }
            multiplicationTable.append("\n");
        }
        return multiplicationTable.toString();
    }
}


