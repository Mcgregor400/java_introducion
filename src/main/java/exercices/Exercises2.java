package exercices;

public class Exercises2 {

    public static void main(String[] args) {

        User [] users = new User[]{
                new User("Jan","Jowalskii",50),
                new User("Grzegorz","Hys",56),
                new User("Tomasz","Letki",41),
                new User("Rafał","Idler",30),
        };
        for (int i=0;i<users.length;i++){
            if (users[i].getName().charAt(0)==users[i].getLastName().charAt(0)){
                System.out.println(users[i].getName()+users[i].getLastName());
            }
        }

    }
}
