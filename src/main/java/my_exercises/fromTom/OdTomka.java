package my_exercises.fromTom;

public class OdTomka {
    public static void main(String[] args) {
        System.out.println("******************od Tomka***************");

        // write your code here
        int bok = 10;
        int dlWiersza = 1;
        int i;
        boolean znak = true;
        boolean parz_nie = true;
        String[] tablica = new String[bok * bok];

        //ładujemy do tablicy wartości odwracając co długość bok kolor -znak
        for (i = 0; i < (bok * bok); i++) {
            if (dlWiersza == bok + 1) {
                dlWiersza = 1;
                znak = parz_nie;
                parz_nie = !parz_nie;
            } else znak = !znak;
            if (znak) {
                tablica[i] = "X";
            } else {
                tablica[i] = "O";
            }
            dlWiersza++;
        }

        //wyświetlamy wartości z tablice foreachem w kontrolowany sposób
        dlWiersza = 1;
        for (String j : tablica) {
            if (dlWiersza == bok + 1) {
                dlWiersza = 1;
                System.out.println("");
            }
            System.out.print(j);
            dlWiersza++;

        }
    }
}
