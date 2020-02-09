package inheritance.bank;

public class Test {
    public static void main(String[] args) {
        AbstractBankAccount account = new DebitBankAccount("Paweł", 200, 100) ;
        System.out.println("Pobrałem "+ account.withdrow(50) + "zł" +"zł, pozostało " +account.getCashAmount());
        System.out.println("Pobrałem "+ account.withdrow(30) + "zł" +"zł, pozostało " +account.getCashAmount());
        System.out.println("Pobrałem "+ account.withdrow(90) + "zł" +"zł, pozostało " +account.getCashAmount());
        System.out.println("Pobrałem "+ account.withdrow(70) + "zł" +"zł, pozostało " +account.getCashAmount());
        System.out.println("Pobrałem "+ account.withdrow(50) + "zł" +"zł, pozostało " +account.getCashAmount());

    }
}
