package com.github.perschola;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {

       String a = "";
        for (int i = start; i < stop; i++) {
            if ((i % 2) == 0) {
                a=a.concat(String.valueOf(i));
            }
        }

        return a;

    }


    public static String getOddNumbers(int start, int stop) {
        String a="";
        for(int i=start;i<stop;i++)
        {
            if((i%2)!=0)
            a=a.concat(String.valueOf(i));
        }
        return a;
    }


    public static String getSquareNumbers(int start, int stop, int step) {

        /** 5,10,5**/
        String a="";
        int square=0;
        for(int i=start;i<stop;i+=step) {
            square = i * i;
            a = a.concat(String.valueOf(square));
        }
        return(a);
    }

    public static String getRange(int start) {
        String a="";
        for(int i=0;i<start-1;i++)
        {
            a=a.concat(String.valueOf(i));
        }
        return(a);


    }

    public static String getRange(int start, int stop) {
        String a="";
        for(int i=start;i<stop;i++)
        {
            a=a.concat(String.valueOf(i));
        }
         return(a);
    }


    public static String getRange(int start, int stop, int step) {
        String a = "";
        for (int i = start; i < stop; i += step) {
            a = a.concat(String.valueOf(i));

        }
        return(a);
    }

    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String a="";
        for(int i=start;i<stop;i+=step)
        {
           double b= Math.pow(i,exponent);
           int inum=(int) b;
            a=a.concat(String.valueOf(inum));
        }
        return(a);
    }
}
