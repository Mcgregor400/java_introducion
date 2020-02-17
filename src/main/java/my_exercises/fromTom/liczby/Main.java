package my_exercises.fromTom.liczby;

public class Main {
    // write your code here

    //inicjacja tablic
    public static void main(String[] args) {

        byte[] byteValBoxed = {0, 3, 4, 3, 6, 7, 11, -5, -10, 87};
        short[] shortValBoxed = {0, 3, 4, 3, 6, 7, 11, -5, -10, 87};
        int[] intValBoxed = {1, 3, 4, 3, 6, 7, 11, -5, -10, 87};
        long[] longValBoxed = {0, 3, 4, 3, 6, 7, 11, -5, -10, 87};
        double[] doubleValBoxed = {0, 3, 4, 3, 6, 7, 11, -5, -10, 87};
        float[] floatValBoxed = {0.2F, 30, 4.5F, -3, 6, 7, 11, -5, -10, 87};
        char[] charValBoxed = {0, 3, 4, 3, 6, 'a', 1, 'B', '#', '!'};
        boolean[] booleanValBoxed = {true, false, false, true, true, false, false, true, false, true};

        Liczby liczbyByte = new Liczby(byteValBoxed);
        System.out.println("Wynik z dodawania Byte:");
        System.out.println(liczbyByte.sum(byteValBoxed));

        Liczby liczbyShort = new Liczby(shortValBoxed);
        System.out.println("Wynik z dodawania Short:");
        System.out.println(liczbyByte.sum(shortValBoxed));


        Liczby liczby1 = new Liczby(intValBoxed);
        System.out.println("Wynik z dodawania Int:");
        System.out.println(liczby1.sum(intValBoxed));

        System.out.println("Wynik z mnożenia Int: ");
        System.out.println(liczby1.multiply(intValBoxed));

        System.out.println("Wynik z dzielenia Int: ");
        System.out.println(liczby1.divide(intValBoxed));
    }
}
