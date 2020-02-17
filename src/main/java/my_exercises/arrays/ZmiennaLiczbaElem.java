package my_exercises.arrays;

import java.util.Scanner;

public class ZmiennaLiczbaElem {
    public static void main(String[] args) {
        int[] tabl;
        Scanner inner = new Scanner(System.in);
        System.out.println("Podaj ilość elementów: ");
        int liczbaElementów = inner.nextInt();
        tabl = new int[liczbaElementów];
        for(int i=0; i<tabl.length; i++)
            tabl[i] = i+1;
        int licznik=0;
        while(licznik<tabl.length){
            System.out.print(tabl[licznik]+" ");
            licznik++;
        }

    }

}
