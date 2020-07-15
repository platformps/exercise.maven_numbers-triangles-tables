package com.github.perschola;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
            StringBuilder triangle = new StringBuilder();
        for(int i=0; i<numberOfRows; i++)
        {
            for(int j=0; j<=i; j++)
            {
                triangle.append("*");
            }
            triangle.append("\n");
        }
        System.out.println(triangle.toString());
        return triangle.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder triangle = new StringBuilder();
        for (int i = 0; i < numberOfStars; i++){
            triangle.append("*");


        }
        return triangle.toString();
    }

    public static String getSmallTriangle() {

        return getTriangle(4);
    }

    public static String getLargeTriangle() {

        return getTriangle(9);
    }
}
