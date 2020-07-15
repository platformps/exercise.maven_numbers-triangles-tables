package com.github.perschola;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String stars = "";
        for (int i = 1; i < numberOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                 stars += "*";
            }
            stars +="\n";
        }
        return stars;
    }


    public static String getRow(int numberOfStars) {
        String stars = "";
        for (int i = 0; i < numberOfStars; i++) {
             stars += "*";
        }
        return stars;
    }

    public static String getSmallTriangle() {

        return getTriangle(5);
    }

    public static String getLargeTriangle() {

        return getTriangle(10);
    }
}
