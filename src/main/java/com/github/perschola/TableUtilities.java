package com.github.perschola;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String result="";
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                result+=(i*j)+" | ";
            }
            result+="\n";
        }
        return result;
    }

    public static String getLargeMultiplicationTable() {
        String result="";
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                result+=(i*j)+" | ";
            }
            result+="\n";
        }
        return result;
    }

    public static String getMultiplicationTable(int tableSize) {
        String result="";

        for(int i=1;i<=tableSize;i++){
            for(int j=1;j<=tableSize;j++){
                result+=(i*j)+" | ";
            }
            result+="\n";
        }
        return result;
    }
}
