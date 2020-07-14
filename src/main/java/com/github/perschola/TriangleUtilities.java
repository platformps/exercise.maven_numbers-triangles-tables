package com.github.perschola;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String result = "";
        for (int i = 1; i<numberOfRows; i++){
            result += getRow(i) + "\n";
        }
        return result;

    }

    public static String getRow(int numberOfStars) {
        //Tried another method and it works!!!
        char[] charArray = new char[numberOfStars];
        java.util.Arrays.fill(charArray,  '*');
        String result = new String(charArray);
        return (result);
/*  A simple method      String row = "";
                 for (int i = 0; i < numberOfStars; i++)
                 row += "*";
                 return row;  */
    }

    public static String getSmallTriangle() {
        int n=5;
        return getTriangle(n);
    }

    public static String getLargeTriangle() {
        int n=10;
        return getTriangle(n);
    }
}
