package programowanie_podstawowe.sortowanie.test;

import java.util.Arrays;

public class MainBuble {

    public static void main(String[] args) {

        int[] tab = {2,1,3,4,5,6};
        int indL =0;
        int indR = 5;
        System.out.println("Tablica nieposortowana " + Arrays.toString(tab));
        Swap.swap(tab, indL, indR);
        System.out.println("Tablica posortowana " + Arrays.toString(tab));
    }

}
