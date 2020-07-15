package com.github.perschola;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String toReturn = "";
        for (int i = 1; i < numberOfRows; i++) {
            toReturn =toReturn + getRow(i) + "\n";
        }
        return toReturn;
    }

    public static String getRow(int numberOfStars) {
        String toReturn = "";
        for (int i = 0; i < numberOfStars; i++) {
            toReturn = toReturn + "*";
        }
        return toReturn;
    }

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
