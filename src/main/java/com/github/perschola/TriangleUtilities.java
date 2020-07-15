package com.github.perschola;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String result="";

        int height=numberOfRows;
        for(int i=1;i<height;i++){
            result += getRow(i);
            result += "\n";
        }
        return result;
    }

    public static String getRow(int numberOfStars) {
        String row="";
        for(int i=0;i<numberOfStars;i++){
            row+="*";
        }
        return row;
    }

    public static String getSmallTriangle() {
        String result="";

        int height=4;
        for(int i=1;i<=height;i++){
                result += getRow(i);
                result += "\n";
        }
        return result;
    }

    public static String getLargeTriangle() {
        String result="";

        int height=10;
        for(int i=1;i<height;i++){
            result += getRow(i);
            result += "\n";
        }
        return result;
    }
}
