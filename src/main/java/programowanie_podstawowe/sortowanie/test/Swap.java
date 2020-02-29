package programowanie_podstawowe.sortowanie.test;

public class Swap  {

    protected static void swap(int[] tab, int indL, int indR){

        int bufor = tab[indL];
        tab [indL] = tab[indR];
        tab[indR] = bufor;
    }
}
