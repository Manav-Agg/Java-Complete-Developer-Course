package com.manav;

public class Main {

    public static void main(String[] args) {
	    Account manavAccount = new Account("Manav");
        manavAccount.deposit(1000);
        manavAccount.withdraw(500);
        manavAccount.withdraw(-200);
        manavAccount.deposit(-20);
        manavAccount.calculateBalance();
        manavAccount.balance = 5000;
        System.out.println("Balance on account is " + manavAccount.getBalance());
        manavAccount.transactions.add(4500);
        manavAccount.calculateBalance();
    }
}
