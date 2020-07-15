package com.github.perschola;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String num="";
        for (int i=start;start<stop;i+=2){
            if(i%2==0){
                num+=Integer.toString(i);
            }
        }
        return num;
    }


    public static String getOddNumbers(int start, int stop) {
        String num="";
        for (int i=start;start<stop;i+=2){
            if(i%2!=0)
            num+=Integer.toString(i);
        }
        return num;
    }


    public static String getSquareNumbers(int start, int stop, int step) {

        String num="";
        int sq=0;
        for (int i=start;i<stop;i+=step)
        {
            sq=i*i;
            num+=Integer.toString(sq);
        }
        return num;
    }

    public static String getRange(int start) {

        String num="";
        for (int i=0;i<start;i++){

            num+=Integer.toString(i);
        }
        return num;
    }

    public static String getRange(int start, int stop) {
        String num="";
        for (int i=start;i<stop;i++){

            num+=Integer.toString(i);
        }
        return num;
    }


    public static String getRange(int start, int stop, int step) {
        String num="";
        for (int i=start;i<stop;i+=step)
        {
            num+=Integer.toString(i);
        }
        return num;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String num="";
        int ex=0;
        int con=0;
        for (int i=start;i<stop;i+=step)
        {
            ex= (int)Math.pow( i, exponent);
            num+=Integer.toString(ex);
        }
        return num;
    }
}
