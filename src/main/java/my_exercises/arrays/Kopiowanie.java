package my_exercises.arrays;

import java.util.Arrays;

public class Kopiowanie {
    public static void main(String[] args) {

//        int[] tablicaA = new int[]{10,20,30};
//        int[] tablicaB = new int[5];
//        tablicaB[3] = 55;
//        tablicaB[4] = 66;
//         System.arraycopy(tablicaA,0,tablicaB,0,tablicaA.length);
//       // System.out.println(Arrays.toString(tablicaB));
//       for (int i:tablicaB){
//           System.out.println( i);
//       }
//        String[] pierwsza = new String[]{"na pozycji zero jest A","na pozycji jeden jest B","na pozycji dwa jest C"};
//        String[] druga = new String[5];
//        druga[3] = "dodany element na pozycji 3";
//        druga[4] = "dodany element na pozycji 4";
//        System.arraycopy(pierwsza,0,druga,0,pierwsza.length);
//        for (String j:druga){
//            System.out.print(j +" | ");
//        }
//        int[] numbersA = new int[]{10,20,30,40};
//        int[] numbersB = new int[4];
//        numbersB[4]= 100;
//        System.arraycopy(numbersA,0,numbersB,0,numbersA.length);
//        for (int num:numbersB){
//            System.out.print(num);
//        }

        int[][] tabDwuelem = new int[3][3];
        tabDwuelem[0][0] = 5;
        tabDwuelem[0][1] = 10;
        tabDwuelem[0][2] = 15;
        tabDwuelem[0][0] = 20;
        tabDwuelem[1][0] = 25;
        tabDwuelem[2][0] = 30;
        System.out.println("*************************************for each********************************");
        for (int[] i:tabDwuelem) {
            //System.out.println(Arrays.toString(tabDwuelem));
            System.out.println(tabDwuelem.length);
        }
        System.out.println("************************for***************************");
        for (int j=0;j<tabDwuelem.length;j++){
            for (int k=0;k<tabDwuelem[j].length;k++){
                System.out.print(Arrays.toString(tabDwuelem[j]));
                System.out.println(Arrays.toString(tabDwuelem[k]));
            }
        }
        System.out.println("*************************while**************************");
        int l=0;
        while (l<tabDwuelem.length){
            //l++;
            System.out.println("to jest drugi lement tablicy"+tabDwuelem[l]);
            l++;
        }



        }

    }



