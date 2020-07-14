package com.github.perschola;

public class TriangleUtilities {

    /**
     * Given one integer, n, generate a String representation of a triangle whose base height and width
     * is equal to n.
     * @param numberOfRows
     * @return
     */
    public static String getTriangle(int numberOfRows) {
        String traingle = "";
        for (int i = 1; i<numberOfRows; i++){
            traingle += getRow(i) + "\n";
        }
        return traingle;
        //return null;
    }

    /**
     * In the class, Triangles Write a method that returns a String representation of a row of asterisks
     * whose length is equal to the width specified.
     * @param numberOfStars
     * @return
     */
    public static String getRow(int numberOfStars) {
        String row = "";
        for (int i = 0; i < numberOfStars; i++)
            row += "*";
        return row;
        //return null;
    }

    /**
     * In the class, Triangles Write a method that returns a String representation of a small triangle,
     * whose base height and base width is 4 asterisks.
     * @return
     */
    public static String getSmallTriangle() {
        return getTriangle(5);
        //return null;
    }

    /**
     * In the class, Triangles Write a method that returns a String representation of a large triangle,
     * whose base height and base width is 10 asterisks.
     * @return
     */
    public static String getLargeTriangle() {
        return getTriangle(10);
        //return null;
    }
}
