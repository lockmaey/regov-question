package me.lukman.sectiontwo;

public class DevAccount extends Account {

    DevAccount(String name, int balance) {
        super(name, balance);
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int amount) {
        deposit(amount);
    }

    public boolean transfer(int amount, DevAccount otherAccount) {
        int currentBalance = getBalance();
        int otherCurrentBalance = otherAccount.getBalance();

        withdraw(amount);
        otherAccount.deposit(amount);

        return getBalance() == (currentBalance - amount) && otherAccount.getBalance() == (otherCurrentBalance + amount);
    }
}
