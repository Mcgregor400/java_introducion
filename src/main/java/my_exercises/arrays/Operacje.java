package my_exercises.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Operacje {
    public static void main(String[] args) {
        int suma = 0;
        int mutiply=0;
        int iloczyn=0;
        int licznik =0;

        int[] tablica = {1, 2, 3};
        for (int i = 0; i < tablica.length; i++) {

          //  suma += tablica[i];
            iloczyn *= tablica[i]+1;
        }
        System.out.println("Suma liczb z tablicy wynosi " + suma);
        System.out.println("Iloczyn liczb z tablicy wynosi " + iloczyn);

        for (int elem : tablica) {
            if (elem % 3 == 0) {
                System.out.println(elem + " jest podzielny przez 3");
            }
        }
        for ( int t : tablica){
            if (t%2==0){
                System.out.print("to sa elementy parzyste tej tablicy");
                System.out.println();
                System.out.print(" "+t+" ");
            }
        }

    }
}

