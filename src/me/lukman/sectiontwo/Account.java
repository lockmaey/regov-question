package me.lukman.sectiontwo;

abstract class Account {

    String name;
    int balance;

    Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public abstract void deposit(int amount);

    public abstract void withdraw(int amount);

    public void viewBalance() {
        System.out.println(name + "'s account. Balance: " + balance);
    }

}
