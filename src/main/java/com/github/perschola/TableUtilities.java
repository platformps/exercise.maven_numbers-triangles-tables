package com.github.perschola;

public class TableUtilities {

    public static String getSmallMultiplicationTable() {
        String table="";
        for (int i=1;i<=5;i++)
        {
            table+="  "+lineMulti(i,5);
        }
        return table;
    }

    public static String getLargeMultiplicationTable() {
        String table="";
        for (int i=1;i<=10;i++)
        {
            if(i<10){
                table+="  "+lineMulti(i,10);
            }
            else
            {
                table+=" "+lineMulti(i,10);
            }

        }
        return table;
    }

    public static String getMultiplicationTable(int tableSize) {
        String table="";
        for (int i=1;i<=tableSize;i++)
        {
            if(i<10){
                table+="  "+lineMulti(i,tableSize);
            }
            else
            {
                table+=" "+lineMulti(i,tableSize);
            }

        }
        return table;
    }
    public static String lineMulti(int first,int last)
    {
        Integer baseNumber=0;
        String line="";
        for(int i=1;i<=last;i++)
        {
            baseNumber=i*first;
            if(baseNumber<10)
            {
                if(i!=last) {
                    if (((i+1)*first>=10)){
                        line+=Integer.toString(baseNumber)+" | ";   // for when there is a double digit up next from a single digit
                    }
                    else {
                        line += Integer.toString(baseNumber) + " |  ";  //double space lead for less than t0
                    }

                }
                else{
                    line += Integer.toString(baseNumber) + " |";    // last part of numbers less than double digit
                }
            }
            else if (baseNumber>=10&&baseNumber<=100){
                if (i!=last)
                {
                    if (((i+1)*first>=100)){
                        line+=Integer.toString(baseNumber)+" |";   // for when there is a triple digit up next from a double digit
                    }
                    else {
                        line += Integer.toString(baseNumber) + " | ";  //double space lead for less than 100
                    }

                }
                else {
                    line+=Integer.toString(baseNumber)+" |";    // for the last line of numbers over 10
                }

            }

            else {
                line+=Integer.toString(baseNumber)+" |";   // for when there is a triple digit
//                if (i!=last)
//                {
//                    line+=Integer.toString(baseNumber)+" |";   // for when there is a double digit up next from a single digit
//
//                }
//                else {
//                    line+=Integer.toString(baseNumber)+" |";    // for the last line of numbers over 10
//                }
            }

        }
        return  line+"\n";

    }
}



