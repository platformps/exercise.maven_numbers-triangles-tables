package com.github.perschola;

import com.sun.javadoc.SourcePosition;

public class TableUtilities {
    public static String getSmallMultiplicationTable()
    {
        String result = "";
        for (int i = 1; i <= 5; i++) {
            int k = i;
            for (int j = 1; j <= 5; j++)
                if(k * j < 10)
                    result = result + "  " + k * j + " |";
                else result = result + " " + k * j + " |";
            result = result + "\n";
        }
        return result;
    }

public static String getLargeMultiplicationTable(){
        return getMultiplicationTable(10);
}



    public static String getMultiplicationTable(int tableSize) {
        {
            String result = "";
            for (int i = 1; i <= tableSize; i++) {
                int k = i;
                for (int j = 1; j <= tableSize; j++)
                    if(k * j < 10)
                        result = result + "  " + k * j + " |";
                    else if(k * j < 100)
                        result = result + " " + k * j + " |";
                    else result = result + k*j + " |";
                    result=result + "\n";
            }
            return result;
        }
    }
}
