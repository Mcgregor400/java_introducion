package exercices;

import java.util.Scanner;

public class Exercises3 {
    public static void main(String[] args) {
        User [] users = new User[3];
        Scanner scan = new Scanner(System.in);

        for (int i=0; i<users.length;i++){
            System.out.println("Podaj dane: ");
            String userText = scan.nextLine();
            String [] userData = userText.split(" ");
            int age = Integer.valueOf(userData[2]);
            User newUser = new User(userData[0], userData[1], age);
            users[i] = newUser;

        }
        for (int i=0; i<users.length;i++){
            System.out.println(users[i].getName());
            System.out.println(users[i].lastName);
            System.out.println(users[i].getAge());
    }




    }
}
