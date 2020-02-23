package my_exercises.arrays;

import com.google.gson.internal.$Gson$Preconditions;

import java.util.Arrays;

public class TestArray {

    public static void main(String[] args) {
        String[] tekst = new String[3];
        tekst[0] = "Ala";
        tekst[1] = "ma";
        tekst[2] = "kota";
        System.out.println(Arrays.toString(tekst));

        System.out.println("***********tablica dwuwymiarowa**********");
        int[][] numery = new int[2][8];
        numery[0][0] = 99;
        numery[0][1] = 10;
        numery[0][2] = 20;
        numery[0][3] = 30;
        numery[0][4] = 40;
        numery[0][5] = 50;
        numery[0][6] = 60;
        numery[1][0] = 15;
        numery[1][1] = 25;

        for (int i = 0; i < numery.length; i++) {
            for (int j = 0; j < numery[i].length; j++)
                System.out.print(numery[i][j]);
        }
        System.out.println();


        System.out.println("***********tablica dwuwymiarowa**********");
        int[][] tab = new int[3][3];
        tab[0][0] = 0;
        tab[0][1] = 1;
        tab[0][2] = 2;
        tab[1][0] = 3;
        tab[1][1] = 4;
        tab[1][2] = 5;
        System.out.println("*******************  for *******************") ;
        for (int r =0; r<tab.length;r++){
            System.out.println(Arrays.toString(tab[r]));
        }
        System.out.println("******************  for each *****************");
        //int t=0;

        for (String tek :tekst){
            System.out.println(Arrays.toString(tekst));
        }

        System.out.println("************************ while**************************");
        int w = 0;
        while (w < tab.length) {
            System.out.println(Arrays.toString(tab[w]));
            w++;
        }
        System.out.println("************************* do while*************************");
        int y = 0;
        do {
            System.out.println(Arrays.toString(tab[y]));
            y++;
        }

        while (w<tab.length);

        System.out.println("Koniec petli.\n"+ "Nowa\n linia");




    }

}
