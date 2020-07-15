package com.github.perschola;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String triangle="";
        String str="";
        int i=1;

        while (i<=numberOfRows){
            str=getRow(i)+"\n";
            triangle+=str;
            i++;
        }
        return triangle;
    }

    public static String getRow(int numberOfStars) {
        String args="";
        for (int i=0; i<numberOfStars;i++){
            args+="*";
        }
        return args;
    }

    public static String getSmallTriangle() {

        return getTriangle(4);
    }

    public static String getLargeTriangle() {

        return getTriangle(10);
    }
}
