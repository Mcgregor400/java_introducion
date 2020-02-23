package my_exercises.timesAndDates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Dates {
    public static void main(String[] args) {
//        LocalDate dzis = LocalDate.now();
//        System.out.println(dzis);
//        LocalDate zatydzień = dzis.plusDays(7);
//        DayOfWeek dzień = zatydzień.getDayOfWeek();

        System.out.println("Podaj datę: yyyy:mm:dd : ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        LocalDate data = LocalDate.parse(input);

        System.out.println(data);
        System.out.println("Podaj dataę urodzenia:");
        String inputDateOfBearth = scan.nextLine();
        LocalDate bearth_date = LocalDate.parse(inputDateOfBearth);
        System.out.println("Urodziłeś się w "+bearth_date +" roku");
        Period wiek = Period.between(data,bearth_date);
        int a = wiek.getYears();
        System.out.println("Masz " +a+ " lat");






    }
}
