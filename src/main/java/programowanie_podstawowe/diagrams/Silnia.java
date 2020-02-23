package programowanie_podstawowe.diagrams;

import com.google.gson.internal.$Gson$Preconditions;

import javax.swing.*;

public class Silnia {
    public static void main(String[] args) {

        int liczba = 4;
        int liczba1 = 4;
        int silnia = 1;
       // int a=silniaRek

        System.out.println(silnia(liczba));
        System.out.println(dodajRek(liczba1));
    }

    private static int silnia(int liczba) {
        if (liczba == 0) {
            return 1;
        } else {
            return liczba * silnia(liczba - 1);

        }
    }

    private static int dodajRek(int liczba1) {
        if (liczba1 == 0) {
            return 0;
        } else {
            return liczba1 + dodajRek(liczba1 - 1);

        }

    }

    private static int dodaj(int liczba1) {
        int suma = 0;
        int i = 0;

        while (i<liczba1) {
            i++;
            suma +=i;

        }
        return suma;

    }

}




