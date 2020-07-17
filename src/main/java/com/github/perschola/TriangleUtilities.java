package com.github.perschola;

public class TriangleUtilities {
    /**
     * @param numberOfRows
     * @return given one integer:n, returns String representation
     * of a row of "*" whose len is equal to wid
     */

    public static String getTriangle(int numberOfRows) {
        String result = "";
        for (int i = 1; i <numberOfRows; i++)
            result += getRow(i) + "\n";
            return result;
        }

    /**
     * write method that returns String rep of small triangle
     * whose base height and base width is 4 "*"
     *
     * @param numberOfStars
     * @return
     */

    public static String getRow(int numberOfStars) {
        String result = "";
        for (int i = 0; i < numberOfStars; i++)
            result += "*";

        return result;
    }

    /**
     * Write a String representation oflarge Triangle,
     * whose base height and base width is 10 "*"
     */

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    /**
     * Write a String representation of Triangle,
     * whose base height and base width is equal to n.
     */

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}

