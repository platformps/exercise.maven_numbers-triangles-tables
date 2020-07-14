package com.github.perschola;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {


        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {

        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder complete = new StringBuilder(1);
        int num = 0;
        for (int f = 1; f <= tableSize; f++) {
            int counter = 0;
            for (int i = 1; i <= tableSize; i++) {
                num = i * f;

                if(10>num){complete.append("  ");}
                else if(100>num){complete.append(" ");}
                complete.append((f * i));
                complete.append(" ");
                complete.append("|");

            }
                complete.append('\n');

        }

        return complete.toString();
    }



}
