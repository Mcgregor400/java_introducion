package inheritance.bank;

public abstract class AbstractBankAccount {

    protected   String  owner;
    protected   int cashAmount;

    public AbstractBankAccount(String owner, int cashAmount) {
        this.owner = owner;
        this.cashAmount = cashAmount;
    }


    public int withdrow(int amount) {
        int returnAmount = 0;
        if (getMaxAmount() >= amount) {
            cashAmount -= amount;
            return amount;
        } else {
            System.out.println("Nie masz wystarczjącej kwoty na koncie! Pozostało " + cashAmount);
            // return 0;
        }
        return returnAmount;
    }

    protected  abstract int getMaxAmount();

    public String getOwner() {
        return owner;
    }

    public int getCashAmount() {
        return cashAmount;
    }





}
