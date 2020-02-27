package programowanie_podstawowe.sortowanie.exercises;

import java.util.Arrays;

public class TabHelper {
    public static void main(String[] args) {
        int[] tab = {1,2,3,4,5};
        System.out.println(Arrays.toString(tab));
        swap(tab,2,3);
        System.out.println(Arrays.toString(tab));
      //  System.out.println(Arrays.toString());
    }

    protected static void  swap(int[] tab, int lIndex, int rIndex){
        int buff = tab[lIndex];
        tab[lIndex]=tab[rIndex];
        tab[rIndex]=buff;
    }
}
