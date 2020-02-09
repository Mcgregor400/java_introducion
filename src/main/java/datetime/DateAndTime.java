package datetime;

import java.time.LocalDate;

import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

    public static void main(String[] args) {

        LocalDate currenttime = LocalDate.now();
        System.out.println("Aktualny data i czas: " + currenttime);
        System.out.println("Dziś jest  " +currenttime.getDayOfYear() + "dzień roku");
        String someDate = "2010/03/23";
        String format = "yyyy/MM/dd";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        LocalDate someDateParsed = LocalDate.parse(someDate, formatter);
        System.out.println("jakaś data to " +someDateParsed);
        System.out.println("Jakaś data to: " + someDateParsed);
        System.out.println("czy teraz jest przed jakąć  2020/03/23" + currenttime.isBefore(someDateParsed));

       Period period = Period.between( someDateParsed, currenttime);
       int yearsBetweenTwoDates = period.getYears();
        System.out.println("Twój wiek: " + yearsBetweenTwoDates);


    }
}
