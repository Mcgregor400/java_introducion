package my_exercises.loops;

public class for_choinka {
    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                int wynik = i * j;
                if (wynik >= 10) {
                    System.out.print(wynik + " ");
                } else {
                    // dla jednocyfrowych wynikow dodajemy spacje
                    // na poczatku, by wynik byl ladnie sformatowany
                    System.out.print(" " + wynik + " ");
                }
            }
            System.out.println(); // pusta linia
        }
//        int heigh = 5;
//
//        for (int i = 0; i < heigh; i++) {
//            for (int a = 0; a < heigh - i; a++) {
//                System.out.print(" ");
//            }
//            for (int a = 0; a <= i * 2; a++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        System.out.println("    **");


//        int heigh = 5;
//        int middle = heigh;
//
//        for (int i = 0; i < heigh; i++) {
//            for (int a = 0; a < heigh - i; a++) {
//                System.out.print(" ");
//            }
//            for (int a = 0; a <= i * 2; a++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//
//        for (int i = 0; i <= middle + 1; i++) {
//            if (i >= middle - 1) {
//                System.out.print("*");
//            } else {
//                System.out.print(" ");
//            }
//        }
        System.out.println("**********************************************************************");
//        int row = 6;
//        int col = 6;
//
//
//        for (row = 0; row <= 6; row++) {
//            // for (col = 0; col< row; col++) {
//            System.out.println("*");
//        }
        System.out.println("***********************choinka***********************************************");


        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
             //   if (i == 7) break;
            }
            System.out.println();
        }
        System.out.println("**************************choinka odwrócona*********************************************");
        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j <6-i; j++) {
                System.out.print("*" + " ");
                   //if (i == 7) break;
            }
            System.out.println();
        }
        System.out.println("*****************pętla for each********************************************");
        int[] digits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int oddCount = 0; int allCount = 0;
        for (int i : digits) {
            allCount++;
             if (i%2 != 0) {
                  oddCount++;
                  System.out.println(i + " is odd");
                    }
        }
        System.out.println("Count: all=" + allCount + ", odd=" + oddCount);





    }
    }






