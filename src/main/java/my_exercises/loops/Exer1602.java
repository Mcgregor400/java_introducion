package my_exercises.loops;

public class Exer1602 {
    public static void main(String[] args) {
        for (int i = -20; i <= 20; i++) {
            if (i == 6) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println('\n');

        for (int j = 15; j <= 20; j++) {
            System.out.print(j + " ");
        }
        for (int l = -20; l <= 20; l++) {
            if (l%3 == 0) {
                System.out.println("liczby podzielne przez 3" + l);
            }
        }
        int sum= 0;
        int k=0;
        while (k<20){
            sum+=k;
            k++;
            System.out.println("suma liczb wynosi "+sum);
        }
    }
}
