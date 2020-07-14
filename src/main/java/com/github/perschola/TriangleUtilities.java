package com.github.perschola;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String s = "";
        for(int i = 1; i < numberOfRows; i++){
            for(int j = 0 ; j < i; j++){
                s = s + "*";
            }
            s = s + '\n';
        }
        return s;
    }

    public static String getRow(int numberOfStars) {
        String s = "";
        for(int i = 0; i < numberOfStars; i++)
            s = s + "*";
        return s;
    }

    public static String getSmallTriangle() {

        return getTriangle(5);
    }

    public static String getLargeTriangle() {

        return getTriangle(10);
    }
}
