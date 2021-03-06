package my_exercises.loops;
//package homework.workbook.calendar;

import java.time.LocalDate;
import java.util.Scanner;

public class Kalendarz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date: [yyyy-MM-dd]");
        String input = scanner.nextLine();
        LocalDate localDate = LocalDate.parse(input);

        int today = localDate.getDayOfMonth();
        int monthLength = localDate.lengthOfMonth();
        LocalDate firstDate = LocalDate.parse(input.substring(0, 8) + "01");
        int firstDayOfWeek = firstDate.getDayOfWeek().getValue();
        int[] calendar = new int[monthLength + firstDayOfWeek];
        System.out.println(localDate.getMonth());
        System.out.println("Pn Wt Śr Cz Pt Sb Nd");
        System.out.println("--------------------");
        int count = 0;
        for (int i = firstDayOfWeek - 3; i <= monthLength + firstDayOfWeek - 2; i++) {
            calendar[i] = count;
            count++;
        }
        int countBreak = 0;
        for (int i : calendar) {
            if (countBreak == 7) {
                System.out.println();
                countBreak = 0;
            }
            if (i == today) {
                System.out.print("[" + i + "]");
                countBreak++;
            } else {
                if (i == 0) {
                    System.out.print("   ");
                    countBreak++;
                } else if (i < 10) {
                    System.out.print("  " + i);
                    countBreak++;
                } else {
                    System.out.print(" " + i);
                    countBreak++;
                }
            }
        }
    }

}
