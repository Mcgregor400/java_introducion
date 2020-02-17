package my_exercises;

import java.util.Scanner;

public class ScanerExercise {
    public static void main(String[] args) {

        Scanner scanin = new Scanner(System.in);
        System.out.println("Podaj jakąś liczbe zmiennoprzecinkową: ");
        double a = scanin.nextDouble();
        System.out.println("Podaj jeszcze jedną liczbę: ");
        double b = scanin.nextDouble();
        double suma = a+b;
        System.out.println("suma wynosi: "+suma);
        double iloczyn = a*b;
        System.out.println("Iloczyn liczb wynosi: "+iloczyn);
        double iloraz = a/b;
        System.out.println("Iloraz liczb wynosi: "+ iloraz);
        }
    }

