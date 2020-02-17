package my_exercises.arrays;
import com.google.gson.internal.$Gson$Preconditions;

import java.util.Arrays;
public class ExampleArrays {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[1] = 50;
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        String[] words = {"jeden", "dwa", "trzy"};
        words[0] = "0";
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);
        System.out.println("************************************************");

        String[] seasons = {"Wiosna", "Lato", "Jesień", "Zima"};
        int[] numeric = {34, 23, 89, 14, 63, 2, 55};
        int pory;
        for (pory = 0; pory < seasons.length; pory++) {
            System.out.println(seasons[pory]);
        }
        for (int i = numeric.length - 1; i >= 0; i--) {
            System.out.print(numeric[i] + " ");
        }
        System.out.println();
        for (String season : seasons) {
            System.out.println(season);
        }
        System.out.println("****************przykłądy****************");
        String[] a = new String[]{"ala", "ma", "kota"};
        System.out.println(Arrays.toString(a));
        System.out.println("************************kalendarz****************");
        String[] days = {"Pon", "Wt", "śr", "czw", "pt"};
        System.out.println(Arrays.toString(days));
        for (int i = 0; i < 20; i++) {
            System.out.print("-");
        }
        System.out.println("*************************ćwiczenia***************************");

//        for (int i=-20;i<=20;i++){
//            System.out.print(i+" " );
//        }
//        for (int i=-20;i<=-14;i++){
//            System.out.print(i+" ");
//        }
//        for (int i=-20;i<=20;i++){
//           if (i%2==0)
//            System.out.print(i+" " );
//        }
//        for (int i=-20;i<=20;i++){
//            if (i==5)
//                System.out.print(" " );
//            else System.out.print(i+" ");
//        }
        for (int i = -20; i <= 20; i++) {
            if (i % 3 == 0)
                System.out.println(i + " ");
            //  System.out.println("\n");
        }
//        int liczba1;
//        int liczna2;
//        while (liczba1<liczna2){
//            int suma =0;
//            for (int i=0; )
//        }

//        int[] liczby= new int[10];
//        liczby[5]=10;
//        liczby[6]=14;
//        System.out.println(Arrays.toString(liczby));
//        System.out.println(liczby.length);
//
//    }

    }
}


