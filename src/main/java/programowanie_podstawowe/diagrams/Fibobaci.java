package programowanie_podstawowe.diagrams;

import java.util.Scanner;

public class Fibobaci {
    public static void main(String[] args) {
        System.out.println();
    }
    private static int reku (int number){
        if (number==0){
            return 0;
        }else if(number==1){
           return 1;
        }else {
         return    reku(number-1) +reku(number-2);}

    }
}
