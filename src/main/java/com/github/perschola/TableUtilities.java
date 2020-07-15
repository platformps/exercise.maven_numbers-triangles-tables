package com.github.perschola;

import org.w3c.dom.ls.LSOutput;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String output = "";
        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                if(i*j >= 100)
                    output += j*i +" "+ "|";
                else if (i*j < 100 && (i*j >= 10))
                    output += " " + j*i +" "+ "|";
                else
                    output += "  " + j*i +" "+ "|";
            }
            output += "\n";
        }

        return output;
    }
}
