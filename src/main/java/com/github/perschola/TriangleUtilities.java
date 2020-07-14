package com.github.perschola;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String triangle = "";
        String rowString = "";
        int currentRow = 1;
        while(currentRow <= numberOfRows){
            rowString = getRow(currentRow) + "\n";
            triangle += rowString;
            currentRow++;
        }
        return triangle;
    }

    public static String getRow(int numberOfStars) {
        String row = "";
        for(int count = 0; count < numberOfStars; count++){
            row += "*";
        }
        return row;
    }

    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
