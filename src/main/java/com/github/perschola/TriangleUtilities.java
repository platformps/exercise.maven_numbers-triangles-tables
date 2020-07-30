package com.github.perschola;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {

        String result ="";
        for (int i = 1; i < numberOfRows; i++) {

            result = result + getRow(i) +"\n";

        }

        return result;


    }
    public static String getRow(int numberOfStars) {
        String result = "";
        String star= "*";
        for (int i = 0; i < numberOfStars; i++) {

            result= result+ star;

        }

        return result;
    }

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
