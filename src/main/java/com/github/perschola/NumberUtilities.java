package com.github.perschola;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder str= new StringBuilder();
        for(int i=start ;i<stop;i++) {
            if (i%2==0){
                str.append(i);
            }
        }
        return str.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        String str="";
        for(int i=start ;i<=stop;i++) {
            if (i%2!=0){
                str+=i;
            }
        }
        return str;

    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String str="";
        for(int i=start;i<stop;i+=step){
            str+=(int)(Math.pow(i,2));
    }
        return str;
    }

    public static String getRange(int stop) {
        StringBuilder str= new StringBuilder();
        for(int i=0;i<stop;i++) {
            str.append(i);
        }
        return str.toString();
    }

    public static String getRange(int start, int stop) {
        StringBuilder str= new StringBuilder();
        for(int i=start;i<stop;i++) {
            str.append(i);
        }
        return str.toString();
    }


    public static String getRange(int start, int stop, int step) {
        String str="";
        for(int i=start;i<stop;i+=step ) {
            str+=i;

        }
        return str;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String str="";
        for(int i=start;i<stop;i+=step ) {
          str+=(int)(Math.pow(i,exponent));

        }
        return str;
    }
}
