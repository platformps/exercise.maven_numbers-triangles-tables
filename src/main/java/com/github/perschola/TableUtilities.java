package com.github.perschola;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String toReturn = "";
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if(i*j < 10)
                    toReturn = toReturn + "  " + j*i +" "+ "|";
                else
                    toReturn = toReturn + " " + j*i +" "+ "|";
            }
            toReturn = toReturn + "\n";
        }

        return toReturn;
    }

    public static String getLargeMultiplicationTable() {
        String toReturn = "";
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if(i*j >= 100)
                    toReturn = toReturn + j*i +" "+ "|";
                else if (i*j < 100 && (i*j >= 10))
                        toReturn = toReturn + " " + j*i +" "+ "|";
                    else
                        toReturn = toReturn + "  " + j*i +" "+ "|";
            }
            toReturn = toReturn + "\n";
        }

        return toReturn;
    }

    public static String getMultiplicationTable(int tableSize) {
        String toReturn = "";
        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                if(i*j >= 100)
                    toReturn = toReturn + j*i +" "+ "|";
                else if (i*j < 100 && (i*j >= 10))
                    toReturn = toReturn + " " + j*i +" "+ "|";
                else
                    toReturn = toReturn + "  " + j*i +" "+ "|";
            }
            toReturn = toReturn + "\n";
        }

        return toReturn;
    }
}
