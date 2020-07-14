package com.github.perschola;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder s= new StringBuilder(1);
int i=start;
while(i<stop){
    if(i%2 !=0)
    {s.append(String.valueOf(i));}
    i++;
}
        return s.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder s= new StringBuilder(1);
        int i=start;
        while(i<stop){
            if(i%2 ==0)
            {s.append(String.valueOf(i));}
            i++;
        }
        return s.toString();
    }



    public static String getSquareNumbers(int start, int stop, int step) {
        int toBeReturned =start;
        StringBuilder s= new StringBuilder(1);
        while(stop>toBeReturned){
            {s.append(String.valueOf(toBeReturned*toBeReturned));}
            toBeReturned=5+toBeReturned;
        }

        return s.toString();
    }

    public static String getRange(int stop) {
         StringBuilder toBeReturned = new StringBuilder(1);

        for(int i =0; i<stop;i++)
          toBeReturned.append(i);
        return toBeReturned.toString();
    }

    public static String getRange(int start, int stop) {
        StringBuilder toBeReturned = new StringBuilder(1);

        for(int i =start; i<stop;i++)
            toBeReturned.append(i);
        return toBeReturned.toString();
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder toBeReturned = new StringBuilder(1);
        for(int i =start; i<stop;i+=step)
            toBeReturned.append(i);
        return toBeReturned.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder toBeReturned = new StringBuilder(1);
        for(int i =start; i<stop;i+=step)
            toBeReturned.append((int)Math.pow(i,exponent));
        return toBeReturned.toString();

    }
}
