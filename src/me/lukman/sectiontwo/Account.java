package me.lukman.sectiontwo;

class Account {

    String name;
    int balance;

    Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        this.balance -= amount;
    }

    @Override
    public String toString() {
        System.out.println(name + "'s account. Balance: " + balance);
        return super.toString();
    }

}
