package com.github.perschola;

import java.util.Collections;

public class TriangleUtilities {
    
    public static String getTriangle(int numberOfRows) {
        String value ="";
        for(int index = 1; numberOfRows > index; index++){
            value += getRow(index) + "\n";
        }
        return value;
    }
    
    public static String getRow(int numberOfStars) {
        return String.join("", Collections.nCopies(numberOfStars, "*"));
    }
    
    public static String getSmallTriangle() {
        return getTriangle(5);
    }
    
    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
