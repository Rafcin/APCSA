package com.company.IFT;

public class Main {

    public static void main(String[] args) {
        int arraySizeMovies = 3;

        String[] array;
        array = new String[arraySizeMovies];
        array[0] = "Lord of the Rings The Fellowship of The Ring";
        array[1] = "Lord of the Rings The Two Towers";
        array[2] = "Lord of the Rings The Return of The King";

        int i;
        for (i=0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
