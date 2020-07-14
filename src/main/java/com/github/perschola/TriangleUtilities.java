package com.github.perschola;

public class TriangleUtilities {

    public static String getTriangle(int rows) {
        if(0 == rows)return "";
        StringBuilder tRi= new StringBuilder(1);
      for(int i=1;i<rows;i++){
          tRi.append(getRow(i));
          if(i!=rows)tRi.append('\n');
      }
        return tRi.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder aS=new StringBuilder(1);
        for(int i=0;i<numberOfStars;i++)
            aS.append("*");
        return aS.toString();
    }

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
