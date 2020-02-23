package programowanie_podstawowe.diagrams;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {

        System.out.println("Poadaj jakąś liczbę całkowitą: ");

        Scanner scanA = new Scanner(System.in);
        int a = scanA.nextInt();
        int suma=0;
        while (a!=0){
            a = scanA.nextInt();
            suma +=suma;
        }
        System.out.println(suma);
//        do {
//            int a=scanA.nextInt();
//            suma +=0;
//        } while (a !=);



    }
}



