package com.github.perschola;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {

        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder result = new StringBuilder();
        int counter = 1;
        int multiplier = 1;
        String space = " ";
        for(int i = 1;i<=tableSize*tableSize;i ++){
            if (multiplier*counter <10)
                space = "  ";
            else if(multiplier*counter >= 10 && multiplier*counter<100)
                space = " ";
            else if (multiplier*counter >=100)
                space = "";
            if (i % tableSize == 0) {
                    result.append(space).append(counter * multiplier).append(" |\n");
                multiplier++;
                counter = 1;
            } else {
                result.append(space).append(counter * multiplier).append(" |");
                counter++;
            }
        }
        return result.toString();
    }
}
