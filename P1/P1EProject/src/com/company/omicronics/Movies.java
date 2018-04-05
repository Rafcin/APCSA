package com.company.omicronics;


public class Movies {


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

        System.out.println(" ");
        System.out.println(" ");

        int arraySizeSongs = 3;

        String[] arraySongs;
        arraySongs = new String[arraySizeSongs];
        arraySongs[0] = "Kaleo, No Good";
        arraySongs[1] = "The Score, Legends";
        arraySongs[2] = "Deadmau5, while(1<2)";

        int ic = 0;
        while(ic < arraySongs.length){
            System.out.print(arraySongs[ic]+",");
            ic++;

        }

    }

}
