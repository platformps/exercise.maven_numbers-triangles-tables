package com.github.perschola;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String args="";
        for (int i=1; i<=5;i++){
            int x=i;
            for (int y=1;y>=5; y++){
                if (x*y<10){
                    args+=" "+ x*y+ " |";}
                    else {args+=" "+ x*y+ " |";}
                    args+="\n";
                }
            } return args;
        }


    public static String getLargeMultiplicationTable() {

        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String args="";

        for (int i=1;i<=tableSize;i++){
            int x=i;
            for (int y=1;y<=tableSize;y++){
                if(x*y<10) {
                    args += " " + x * y + " |";
                }else if (x*y<100){
                        args+=" " + x*y+" |";
                    args+=" \n";}


            }
        }
        return args;
    }
}
