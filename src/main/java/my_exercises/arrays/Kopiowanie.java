package my_exercises.arrays;

import java.util.Arrays;

public class Kopiowanie {
    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.println(Arrays.toString(array));
        System.err.println();

    }
    public class ArrayAddElementTest {
        /**
         * Creates a new array containing all {@code source} elements
         * followed by {@code newElements}.
         *
         * @param source      a source array
         * @param newElements any number of new elements to "add" to the
         *                    {@code source} array
         * @return the new array containing all {@code source} elements
         * followed by {@code newElements}
         */
//        private static String[] addElements(String[] source, String...
//                newElements) {
//            int newArrayLength = source.length + newElements.length;
//            String[] newArray = new String[newArrayLength];
//            int idx = 0;
//            for (String elem:
//            source){
//                newArray[idx] = elem;
//                idx++;
//            }
//            return  newArray;
//            // TODO: implement this method according to the specification
//            return null;
//        }
//
//        public static void main(String[] args) {
//            runTest();
//        }
//
//        private static void runTest() {
//            String[] source = {"A", "B", "C"};
//            String[] newArray = ArrayAddElementTest.addElements(source,
//                    "D", "E", "F");
//            assertIndex(newArray, 0, "A");
//            assertIndex(newArray, 1, "B");
//            assertIndex(newArray, 2, "C");
//            assertIndex(newArray, 3, "D");
//            assertIndex(newArray, 4, "E");
//            assertIndex(newArray, 5, "F");
//            System.out.println("Implementation OK!");
//        }
//
//        private static void assertIndex(String[] array, int index, String
//                expected) {
//            if (!array[index].equals(expected)) {
//                throw new RuntimeException(MessageFormat.format("Bad "
//                        + "implementation. Array[{0}] != {1}. Actual "
//                        + "is {2}.", index, expected, array[index]));
//            }
//        }
    }


}
