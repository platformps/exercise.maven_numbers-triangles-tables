package com.github.perschola;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        int tableSize = 5;


        /***String expected =
                        "  1 |  2 |  3 |  4 |  5 |\n" +
                        "  2 |  4 |  6 |  8 | 10 |\n" +
                        "  3 |  6 |  9 | 12 | 15 |\n" +
                        "  4 |  8 | 12 | 16 | 20 |\n" +
                        "  5 | 10 | 15 | 20 | 25 |\n";  **/


        String a="";
        for(int i=1;i<=tableSize;i++)
        {
            for (int j = 1; j <= tableSize; j++) {
                a = a.concat(String.valueOf(i*j)+" | ");

            }
       //     System.out.println(" "+a);
            a=a.concat(" "+"\n");

        }
        return (a);


    }
    public static String getLargeMultiplicationTable() {
        int tableSize=10;
        String a="";
        for(int i=1;i<=tableSize;i++)
        {
            for (int j = 1; j <= tableSize; j++) {
                a = a.concat(String.valueOf(i*j)+" | ");

            }
            //     System.out.println(" "+a);
            a=a.concat(" "+"\n");

        }
        return (a);


    }

    public static String getMultiplicationTable(int tableSize) {
        tableSize = 20;
        String a = "";
        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                a = a.concat(String.valueOf(i * j) + " | ");

            }
            //     System.out.println(" "+a);
            a = a.concat(" " + "\n");

        }
        return (a);
    }

}

