package programowanie_podstawowe.sortowanie.exercises;

import java.util.Arrays;

public class BobleSort {
    public static void main(String[] args) {
        int[] liczbyB = {1,32,4,45,63,66,21,643,22};
       boble(liczbyB);
        System.out.println(Arrays.toString(liczbyB));
    }

    private static void boble(int[] tab){
        for (int i=1;i<tab.length-1;i++){
            for (int j=0;j<tab.length-i-1;j++){
                if (tab[j]>tab[j+1]) {
                    TabHelper.swap(tab,j,j+1);
                }
            }
        }
    }
}
