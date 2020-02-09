package exercices;

import javax.swing.*;
import java.util.Arrays;

public class Exercises1 {
    public static void main(String[] args) {
        User [] users = new User[]{
                new User("Jan","Kowalskii",50),
                new User("Grzegorz","Hys",56),
                new User("Tomasz","Letki",41),
                new User("Rafał","Idler",30),
        };
        int maxLenght = 0;
        int maxIndex = 0;
        int sum = 0;
        double averageAge = 0;
        double sumAge = 0;
        for (int i=0;i<=3 ;i++){

            int namelength = users[i].getName().length();
            int lastNameLength = users[i].getLastName().length();
            int suma= namelength+lastNameLength;
           // System.out.println("długość imienia "+namelength+ "długość nazwiska"+lastNameLength);
            System.out.println("suma = "+suma);
         //   System.out.println(users[i]);
            if (suma>maxLenght){
                sumAge+=users[1].age;
                maxLenght = suma;
                maxIndex = i;
            }



        }
        System.out.println("Maksymalna ilość znaków "+maxLenght + "jest to  " +users[maxIndex].getName()+" "+users[maxIndex].getLastName());
        System.out.println("śrenia wieku wynosi " + sumAge);

    }


}
