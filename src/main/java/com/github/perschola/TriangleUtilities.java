package com.github.perschola;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String output = "";
        for (int i=1; i<numberOfRows; i++){
            for (int j=0; j<i; j++){
                output += "*";
            }
            output += "\n";
        }
        return output;
    }

    public static String getRow(int numberOfStars) {
        String output = "";
        for (int i = 1; i <=numberOfStars; i++) {
            output += "*";
        }
        return output;
    }

    public static String getSmallTriangle() {
        String output = "";
        for (int i=1; i<5; i++){
            for (int j=0; j<i; j++){
                output += "*";
            }
            output += "\n";
        }
        return output;
    }

    public static String getLargeTriangle() {
        String output = "";
        for (int i=1; i<10; i++){
            for (int j=0; j<i; j++){
                output += "*";
            }
            output += "\n";
        }
        return output;
    }
}
