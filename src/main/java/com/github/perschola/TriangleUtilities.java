package com.github.perschola;

import java.util.Collections;

public class TriangleUtilities {
    
    /**
     * Produce a right angle triangle (bottom left betting corner)
     * @param numberOfRows the triangle will have
     * @return a String that represents a right angle triangle
     */
    public static String getTriangle(int numberOfRows) {
        String value ="";
        for(int index = 1; numberOfRows > index; index++){
            value += getRow(index) + "\n";
        }
        return value;
    }
    
    /**
     * Produce a line of asterisks
     * @param numberOfStars of stars in a single row
     * @return a String whose length is equal to numberOfStars that is filled with asterisks
     */
    public static String getRow(int numberOfStars) {
        return String.join("", Collections.nCopies(numberOfStars, "*"));
    }
    
    /**
     * Produce a right angle triangle (bottom left betting corner) (5 rows)
     * @return a String that represents a right angle triangle with 5 rows
     */
    public static String getSmallTriangle() {
        return getTriangle(5);
    }
    
    /**
     * Produce a right angle triangle (bottom left betting corner) (10 rows)
     * @return a String that represents a right angle triangle with 10 rows
     */
    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
