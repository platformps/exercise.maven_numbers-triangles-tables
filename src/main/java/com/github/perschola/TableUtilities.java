package com.github.perschola;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        int tableSize = 5;
        String result = getMultiplicationTable(tableSize);
        return result;
    }

    public static String getLargeMultiplicationTable() {
        int tableSize = 10;
        String result = getMultiplicationTable(tableSize);
        return result;
    }

    public static String getMultiplicationTable(int tableSize) {
        int counter = 1;
        int multiplier = 1;
        String result = "";
        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {

               if(counter<10 && j < tableSize){
                   result+= " ";
                counter= i * j;
                result+= counter+ " | ";
               }
               else if(counter>=10 && j<tableSize){
                   result+="";
                   counter= i * j;
                   result+= counter+ " |";


               }
               else if(counter>=100){
                   result+="";
//                counter+= counter * multiplier;
                   result += counter+"|";
               }
               if(j==tableSize){
                   result+=" ";
                   counter= i * j;
                   result+= counter+" |\n";
               }
            }

        }
        return result;
    }
}
