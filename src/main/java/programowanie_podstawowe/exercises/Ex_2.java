package programowanie_podstawowe.exercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex_2 {

    public static void main(String[] args) {

        int[] tab = {2, 6, 9, 12, 15, 18, 21, 25, 28, 30};
        System.out.println(Arrays.toString(tab));
        Scanner scannerIn = new Scanner(System.in);
        System.out.println("Podaj liczbę z tablicy z zakresu od 1 do 30 :" );
        int szukana = scannerIn.nextInt();
        int indeks = serchBinRecu(tab,0,9,szukana);
            System.out.println(" szukana liczba jest na indexie " + serchBinRecu(tab, szukana, 0, 9) + " tablicy.");
    }

    private static int serchBinRecu(int[] tab, int serchNumb, int L, int P) {
        int mid = (L + P) / 2;
        if (tab[mid] == serchNumb)
            return mid;
        if (L >= P)
            return -1;
        if (tab[mid] > serchNumb)
            return serchBinRecu(tab, serchNumb, L, mid - 1);
        else if (tab[mid]< serchNumb){
            return serchBinRecu(tab, serchNumb, mid + 1, P);
        }
        return -1;
    }
}
//    private static int serchBinRecu(int[] tab, int serchNum) {
//        int L = 0;
//        int R = tab.length - 1;
//
//        while (L <= R) {
//            int Mid = (L+ R)/2;
//            if (tab[Mid] == serchNum) {
//                return Mid;
//            }
//            if (tab[Mid]>serchNum){
//                R=Mid-1;
//
//            }else {
//                L=Mid+1;
//
//            }
//
//        }
//        return  -1;
//    }


