package programowanie_podstawowe.sortowanie.exercises;

import com.google.gson.internal.$Gson$Preconditions;

import java.util.Arrays;

public class exercisesArray {

    public static void main(String[] args) {
        int[] tab= {1,2,3,4,5,6,7,8,9};
        System.out.println(serch(tab,8));
      //  System.out.println(serch(tab,5));
        int notFoundNumbar =7;
        int index = serch(tab,notFoundNumbar);
        if (index==-1){
            System.out.println("nie znaleziono elementu" +8 + "w tablicy"+ Arrays.toString(tab));
        }
    }
private static int serch(int[] tab, int serchNumber) {
    int left = 0;
    int right = tab.length - 1;
    while (left<=right) {
        int srodek = (left + right) / 2;
        if (tab[srodek] == serchNumber) {
            return srodek;
        }
        if (tab[srodek] > serchNumber) {
            right = srodek - 1;
        } else {
            left = srodek + 1;
        }
    }
    return -1;
}

}




