package me.lukman.sectiontwo;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        Account accountOne = new Account("account one", 1000);

        Account accountTwo = new Account("account two", 2000);

        Account accountThree = new Account("account three", 3000);

        HashSet<Account> accountList = new HashSet<Account>(); // using hashmap because each instance need unique
        accountList.add(accountOne);
        accountList.add(accountTwo);
        accountList.add(accountThree);

        for (Account i : accountList) {
            System.out.println("Account: " + i.name + ", " + " Balance:" + i.balance);
        }
    }
}
