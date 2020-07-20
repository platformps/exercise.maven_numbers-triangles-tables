package com.github.perschola;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String a="";
        for(numberOfRows=1;numberOfRows<10;numberOfRows++){
            for(int j=1;j<numberOfRows;j++)
                a=a.concat("*");
        }

       return(a);
        
    }


    public static String getRow(int numberOfStars) {


        int width = 20;
        String a = "";
        for(numberOfStars=1;numberOfStars<=width;numberOfStars++){
            a = a.concat("*");
        }

    return(a);

    }

    public static String getSmallTriangle() {
       String a ="";
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                a=a.concat("*");
            }
            a=a.concat("\n");
       }
        return a;
    }

    public static String getLargeTriangle() {
        String a="";
        for(int i=1;i<=9;i++)
        {
            for(int j=1;j<=i;j++){
               a=a.concat("*"); }
            a=a.concat("\n");
        }
        return a;
    }
}
