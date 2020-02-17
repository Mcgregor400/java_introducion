package my_exercises;

public class Begin {
    public static void main(String[] args) {
       Integer intValBoxed = 10;
       Long longValBoxed  = 10L;
       Short shortValBoxed = 10;
       Double doubleValBoxed = 10.0;
       Float floatValBoxed = 10.0F;
        System.out.println(intValBoxed + longValBoxed + shortValBoxed + doubleValBoxed + floatValBoxed);

        System.out.println("***************trójkąt********************");
        System.out.println("");
        for (int i=0;i<4;i++){
            for (int j=1;j<2;j++){
                System.out.print("*"+"#");
            }
            System.out.println("*"+"#");
        }
        for (int z=500;z<=800;z++){
            System.out.printf("%d : %c \n ",z,z);
        }
        int a = 449;
        int b = 749;
        int c = 215;
        System.out.printf("%c%c%c%c%c",a,b,b,a,c);
        }
    }

