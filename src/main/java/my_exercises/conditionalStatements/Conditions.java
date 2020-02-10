package my_exercises.conditionalStatements;

import java.time.format.DateTimeFormatter;

public class Conditions {

    public static void main(String[] args) {
//int result;
//        int result = (int) (Math.random() * 6 + 1);
//    if ( result %2=0){
//        System.out.println("liczba jes parzysta.");
//
//    }
//    else
//        System.out.println("liczba jest niepażysta.");
        // int min value
        int a= Integer.MIN_VALUE -1;
        System.out.println("int min: "  +Integer.MIN_VALUE  );
        System.out.println("int min zmniejszona o 1: "  +a  );
        // int max value
        System.out.println("int max: " + Integer.MAX_VALUE);
        // that's how you create int var
        int intVar = 10;

        // long min value
        System.out.println("long min: " + Long.MIN_VALUE);
        // long max value
        System.out.println("long max: " + Long.MAX_VALUE);
        // that's how you create long var
        long longVar = 10L;

        // double min value
        System.out.println("double min: " + Double.MIN_VALUE);
        // double max value
        System.out.println("double max: " + Double.MAX_VALUE);
        // that's how you create double var
        double doubleVar = 10D;

        // float min value
        Float af = Float.MIN_VALUE-1;
        Float bf = Float.MAX_VALUE +1;
        System.out.println("float min: " + Float.MIN_VALUE);
        System.out.println("float min zmniejszona o 1: " + af);
        // float max value
        System.out.println("float max: " + Float.MAX_VALUE);
        System.out.println("float max zwiększone o 1: " + bf);
        // that's how you create float var
        float floatVar = 10F;

        // char type - just a single character - note '' instead of ""
        char charVar = '@';
        System.out.println("Char var: " + charVar);
    }
}
