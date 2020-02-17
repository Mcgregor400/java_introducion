package my_exercises.fromTom.liczby;

public class Liczby {

    private   byte[] tablicaByte;
    private   short[] tablicaShort;
    private   int[] tablicaInt;
    //private  long[] tablicaLong;

    public Liczby(byte[] byteValBoxed){}
    public Liczby(short[] shortValBoxed){}
    public Liczby(int[] intValBoxed){}
    public Liczby(double[] doubleValBoxed){}
    public Liczby(float[] floatValBoxed){}


    public byte sum(byte tablicaByte[]) {
            this.tablicaByte = tablicaByte;
            byte suma = 0;
            for (byte j:tablicaByte) {
              //  suma = (byte) (suma + j);
                suma +=suma+j;

            }
            return  suma;
        }
        public short sum(short tablicaShort[]) {
            this.tablicaShort = tablicaShort;
            short suma = 0;
            for (short j:tablicaShort) {
                suma = (short) (suma + j);
            }
            return  suma;
        }

        public int sum(int tablicaInt[]) {
            this.tablicaInt = tablicaInt;
            int suma = 0;
            for (int j:tablicaInt) {
                suma = suma + j;
            }
            return  suma;
        }

        public int multiply(int tablicaInt[]) {
            this.tablicaInt = tablicaInt;
            int wynik = 1;
            for (int j : tablicaInt) {
                wynik = wynik * j;
            }
            return wynik;
        }

        public int divide(int tablicaInt[]) {
            this.tablicaInt = tablicaInt;
            int wynik = 1;
            for (int j : tablicaInt) {
                wynik = wynik / j;
            }
            return wynik;
        }
    }

