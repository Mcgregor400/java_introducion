package programowanie_podstawowe.exercises;

import java.util.Arrays;

public class Rek_1 {
    // metoda odwraca elementy w przekazanej jako parametr tablicy
    public static void odwroc(int[] number) {

        int poczatek  = 0;// indeks pierwszego elementu
        int koniec = number.length-1;// indeks ostatniego elementu

        // dopóki indeks początkowy jest mniejszy od indeksu końcowego
        while (poczatek < koniec) {
            // zamieniamy elementy
            int pomoc = number[poczatek];
            number[poczatek]  = number[koniec];
            number[koniec] = pomoc;

            // przesuwamy się w kierunku środka wektora zwiększając i zmniejszając odpowiednio indeksy
            poczatek++;
            koniec--;
        }
    }

    // metoda wyświetla zawartość tablicy przekazanej jako parametr na ekranie
    public static void pokazTablice(int[] number) {
        // każdy element znajdujący się w tablicy wyświetlamy na ekranie
        for(int x : number) System.out.print (x + " ");
        System.out.println ();
    }

    public static void main(String[] args) {
        // tworzymy tablicę wypełniając ją od razu danymi
        int[] tablica = {4, 6, 1, 2, 3, 8, 7, 9, 5};

        // wyświetlamy tablicę na ekranie
        pokazTablice(tablica);

        // odwracamy tablicę
        odwroc(tablica);
        System.out.println("tablica odwrócona");
        // wyświetlamy odwróconą tablicę na ekranie
        pokazTablice(tablica);
    }

}
