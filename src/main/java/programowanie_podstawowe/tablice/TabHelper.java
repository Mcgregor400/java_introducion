package programowanie_podstawowe.tablice;

import java.util.Arrays;

public class TabHelper {

    public static void main(String[] args) {

        int[] tab = {1,2,3,4,5};
        System.out.println(Arrays.toString(tab));

        int lIndex = 0;
        int rIndex = 4;
        swap(tab, lIndex, rIndex);
        System.out.println(Arrays.toString(tab));
    }

    public static void swap(int[] tab, int lIndex, int rIndex) {

        int buff = tab[lIndex];
        tab[lIndex] = tab[rIndex];
        tab[rIndex] = buff;
    }

}
