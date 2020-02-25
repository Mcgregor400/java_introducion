//package programowanie_podstawowe.sortowanie.exercises;
//
//import java.util.Scanner;
//
//public class exer_11 {
//    public static void main(String[] args) {
//        wydajReszte(259);
//
//    }
//
//    private static int wydajReszte(int reszta) {
//        int[] nominaly = {100, 50, 20, 10, 5, 2, 1};
//        for (int nomilal : nominaly) {
//            if (nomilal <= reszta) {
//                int krotnosc = 0;
//                do {
//                    reszta = reszta - nomilal;
//                    krotnosc++;
//                } while (reszta >= nomilal);
//                System.out.println("Krotność:" + krotnosc + ", nominał: " + nomilal);
//            }
//        }
//
//    }
//}
//
