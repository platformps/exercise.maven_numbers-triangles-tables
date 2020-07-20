package com.github.perschola;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String starPattern = "";
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j <= i; j++) {
                starPattern += "*";
            }
            starPattern +=" ";
        }
        return starPattern;
    }

    public static String getRow(int numberOfStars) {
        String starPattern = "";
        for (int i = 0; i < numberOfStars; i++) {
            starPattern += "*";
        }
        return starPattern;
    }

    public static String getSmallTriangle(int numberOfRows) {
        return getTriangle(5);
    }

    public static String getLargeTriangle(int numberOfRows) {
        return getTriangle(10);
    }
}
