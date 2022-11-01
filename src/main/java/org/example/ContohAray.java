package org.example;

public class ContohAray {
    static int[] arrayInt;
    static String[] arrayString = new String[5];

    public static void main(String[] args) {
        arrayString[0] = "a";
        arrayString[1] = "b";
        arrayString[2] = "c";
        arrayString[3] = "d";
        arrayString[4] = "e";

        for(int i = 0; i < arrayString.length; i++) {
            System.out.println(arrayString[i]);
        }
    }
}
