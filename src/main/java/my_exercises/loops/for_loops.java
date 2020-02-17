package my_exercises.loops;

//import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Arrays;
import java.util.Scanner;

public class for_loops {
    public static void main(String[] args) {
        //      String napis = "pętla for";
//
//        for (int i=1; i<=10; i++){
//            System.out.println("Numer "+i+ " - "+ napis);
//        }
        // int liczba = 1;
//        for (int i=10; i>1  ; i--){
//            System.out.println("Numer "+i+ " - "+ napis);
//        }
//        String znak = "*";
//        int i = 1;
//        int j = 1;
//        for (int i = 0; i<6; i++){
//            for (int j = 0; j< i-1; j++)
//
//            for ( j=0;j<=i;j++)
//                System.out.println(znak);
//        }
//    }
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
        System.out.println("*******************pętla rozszerzona for each******************");
        int[] digits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i : digits) {
            System.out.println(i + " * ");
        }
        System.out.println("************************pętla for each z licznikiem**********************************");
        int[] digits2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int oddCount = 0;
        int allCount = 0;
        for (int i : digits2) {
            allCount++;
            if (i % 2 != 0) {
                oddCount++;
                System.out.println(i + " is odd");
            }
        }
        System.out.println("Count: all=" + allCount + ", odd=" + oddCount);
        System.out.println("**********************suma liczb w pętli********************************");
//        int firstNumber = 0;
//        int lastNumber = 10;
//        int y=0;
//        for ( int x = firstNumber ; x <= lastNumber ; x++)
//        {
//            y += x;
//        }
//        System.out.println("suma liczb wynosi "+y);
        System.out.println("*****************************suma liczb >=4*****************************");
//        int firstNumber = 0;
//        int lastNumber = 10;
//        int y=0;
//        for ( int x = firstNumber ; x <= lastNumber ; x++)
//            if (x>=4){
//        {
//
//            y += x;
//        }}
//        System.out.println("suma liczb wynosi "+y);
        System.out.println("**********************************wypisz wszystkie liczby i ich potęgi");
//        int potega;
//        for (int i = -20; i<=20;i++){
//            potega = i*i;
//            System.out.print( potega+"|");
//        }
//        System.out.println("\n");
//        for (int j = -20;j<=20;j++){
//
//            System.out.print(j+"|");
//        }

        System.out.println("****************************************modulo 10***************************************");

        for (int i = -20; i <= 20; i++) {

            System.out.print(i % 10 + "|");
        }
        System.out.println("\n");
        for (int j = -20; j <= 20; j++) {

            System.out.print(j + "|");
        }
        System.out.println("********************************************************");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cześć ile masz lat? ");
//
//        String text = age >= 18 ? "dorosły" : "niepełnoletni";
//        System.out.println("Jesteś " + text);


        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print(i + " ");
                //   if (i == 7) break;
            }
            System.out.println();

        }
//        System.out.println("********************************************************************************");
//        Scanner scannerr = new Scanner(System.in);
//        System.out.println("Podaj dodatnią liczbę całkowitą:");
//        int number = scanner.nextInt();
//        System.out.println("Cześć podałeś liczbę: " + number + "!");
//        for (int i=1;i<number;i++){
//            if (i%2!=0){
//                System.out.println("To jest liczba nieparzysta i mniejsza od podajej przez ciebie liczby: "+i);
//            }
//        }
        System.out.println("**************************************potęgi liczby 2**************************");
//
//        Scanner scan1 = new Scanner(System.in);
//        System.out.println("Podaj jakąś liczbę całkowitą: ");
//        int number_a = scanner.nextInt();
//
//        for (int i = 0; ; i++) {
//
//            int n = 2;
//            int potega = (int) Math.pow(n, i);
//            if (potega > number_a) break;
//
//            System.out.println(potega);
//
//        }
//        System.out.printf("N: ");
//        long n = new Scanner(System.in).nextLong();
//
//        for(int i=0; ; ++i) {
//            long x = (long) Math.pow(2, i);
//            if(x > n) break;
//            System.out.println(x);
//        }
        System.out.println("***********************************suma liczb z przedziału************************************");

//
//        Scanner ourscan = new Scanner(System.in);
//        System.out.printf("Podaj liczbę całkowitą: ");
//        int number1 = scanner.nextInt();
//
//        int suma1 = 0;
//        for (int i = 1; i < number1; i++) {
//
//            suma1 += i;
//        }
//        System.out.println("Suma liczb mniejszy od podanej:" + suma1);
//        System.out.println("**********************************suma liczb z przedziału liczby a i b (pętla for) *************************");
//        int numberA, numberB, suma;
//        Scanner myScaner1 = new Scanner(System.in);
//        System.out.printf("Podaj liczbę całkowitą A: ");
//         numberA = scanner.nextInt();
//        System.out.printf("Podaj liczbę całkowitą B: ");
//        numberB = scanner.nextInt();
//        suma = 0;
//        for (int i=0;i<numberB;i++){
//            if (i>numberA && i<numberB){
//                suma+=i;
//            }
//        }
//        System.out.println("Suma liczb z zakresu pomiędzy liczbą A i B wynosi: "+suma);

        System.out.println("**********************************suma liczb z przedziału liczby a i b (pętla while) *************************");

//
//
//                Scanner on = new Scanner(System.in);
//                System.out.println("Podaj liczbe");
//                int  t = on.nextInt();
//                int max = t;
//                int min = t;
//                int suma;
//
//                while(t!=0){
//                    if(t<min)
//                        t = min;
//                    if(t>max)
//                        t = max;
//                    t = on.nextInt();
//                    System.out.println(t);
//
//                }
//
//                suma = min+max;
//                System.out.println(suma);
        System.out.println("******************************szachownica z polami 2*2");
//        String jasne = "**##";
//        String ciemne = "##**";
//        for (int szach = 0; szach < 2; szach++) {
//
//            for (int i = 0; i < 2; i++) {
//                System.out.println(jasne + jasne);
//            }
//            for (int j = 0; j < 2; j++) {
//                System.out.println(ciemne + ciemne);
//            }
//
//        }
////        int i;
////        int j;
////        int wynik = i*j;
//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 10; j++) {
//
//                System.out.print("  "+i * j +"  ");
//            }
//            System.out.println("  ");
//        }
//
//        for (int i=1; i<=20; i++) {
//            if (i==13) {
//                continue;
//            }
//             System.out.print(i + " ");
//        }
        System.out.println("***************************pętla for rozszerzona inaczej zwana for each*******************");
//        int[] liczby = {1,2,3,4,5,6,7,8,9};
//        int iloscLiczb=0;
//        int pazyste=0;
//        for (int i: liczby){
//            iloscLiczb++;
//            System.out.println(iloscLiczb+ " ");
//            pazyste++;
//            if (i%2 ==0){
//                System.out.println("liczba "+pazyste+ " to jest liczba pażysta ");
//            }
//        }
        for (int i=1; i<=5; i++) {
            for (int j=1; j<=3; j++) {
                 System.out.print("   "+"*");
                  }
             System.out.println("  ");

            }





    }
}


