package com.github.perschola;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String s = "";
        for (int i = 1; i <= 5; i++) {
            int k = i;
            for (int j = 1; j <= 5; j++)
                if(k * j < 10)
                    s = s + "  " + k * j + " |";
                else s = s + " " + k * j + " |";
            s = s + "\n";
        }
        return s;
    }


    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String s = "";
        for (int i = 1; i <= tableSize; i++) {
            int k = i;
            for (int j = 1; j <= tableSize; j++)
                if(k * j < 10)
                    s = s + "  " + k * j + " |";
                else if(k * j < 100)
                    s = s + " " + k * j + " |";
                else s = s + k*j + " |";
            s = s + "\n";
        }
        return s;
    }
}
