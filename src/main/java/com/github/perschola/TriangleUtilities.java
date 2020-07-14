package com.github.perschola;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder triangle = new StringBuilder();
        int currentRow = 1;
        while(currentRow <= numberOfRows){
            triangle.append(getRow(currentRow));
            triangle.append("\n");
            currentRow++;
        }
        return triangle.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder row = new StringBuilder();
        String star = "*";
        for(int count = 0; count < numberOfStars; count++){
            row.append(star);
        }
        return row.toString();
    }

    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
