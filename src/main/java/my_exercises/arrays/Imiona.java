package my_exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Imiona {

    public static void main(String[] args) {
        String[] imiona = new String[5];
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj imię: ");

        for (int i = 0; i <= 5; i++) {
            imiona[i] = odczyt.next();

            for (int j = 0; j < 5; j++)
                System.out.println("Witaj: " + imiona[j]);

        }
    }
}
