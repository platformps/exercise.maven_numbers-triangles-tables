package com.github.perschola;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String tri="";
        for (int i=1;i<numberOfRows;i++)
        {
            tri+=getRow(i)+"\n";
        }
        return  tri;
    }

    public static String getRow(int numberOfStars) {

        String stars="";
        for (int i=0;i<numberOfStars;i++)
        {
            stars+="*";
        }
        return stars;
    }

    public static String getSmallTriangle() {
        String tri="";
        for (int i=1;i<5;i++)
        {
            tri+=getRow(i)+"\n";
        }
        return  tri;
    }

    public static String getLargeTriangle() {
        String tri="";
        for (int i=1;i<10;i++)
        {
            tri+=getRow(i)+"\n";
        }
        return  tri;
    }
}
