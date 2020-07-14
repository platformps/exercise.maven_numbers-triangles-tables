package com.github.perschola;

public class TableUtilities {
    /**
     * Generate a String representation of a multiplication table whose dimensions are 4 by 4
     * @return
     */
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);//changing input tablesize to match the tests
        //return null;
    }

    /**
     * Generate a String representation of a multiplication table whose dimensions are 9 by 9
     * @return
     */
    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);//changing input tablesize to match the tests
        //return null;
    }

    /**
     * Given one integer, width, generate a String representation of a multiplication table
     * whose dimensions are width by width
     * Example 1
     *
     * @param tableSize
     * @return
     */
    public static String getMultiplicationTable(int tableSize) {
        String table = "";
        String tableRow = "";
        String bar = "|";
        int multiplier = 1;
        int count = tableSize;
        int i = 1;//counter for for loop
        int j = 1;//counter for for loop
        int tabledata = 1;
        int maxDataWidth = (String.valueOf(tableSize*tableSize)).length();
        int tableDataWidth = 1;
        /*Figure out how many spaces to be inserted before each output value*/


        while (count > 0) {
            for (i = 1; i <= tableSize; i++) {
                tabledata = i * multiplier;
                tableDataWidth = (String.valueOf(tabledata)).length();
                for (j = maxDataWidth; j > tableDataWidth; j--)
                    tableRow += " ";
                tableRow += tabledata + " " + bar;
            }
            table += tableRow + "\n";
            tableRow = "";
            multiplier++;
            count--;
        }
        return table;
        //return null;
    }
}
