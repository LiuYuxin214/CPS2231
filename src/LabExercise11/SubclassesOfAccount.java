package LabExercise11;

import LabExercise09.Account;

class CheckingAccount extends Account {
    private final double overdraftLimit;

    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            super.withdraw(amount);
        } else System.out.println("Insufficient funds");
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            super.withdraw(amount);
        } else System.out.println("Insufficient funds");
    }
}

class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1, 100);
        System.out.println(account);
        CheckingAccount checkingAccount = new CheckingAccount(2, 100, 50);
        System.out.println(checkingAccount);
        SavingsAccount savingsAccount = new SavingsAccount(3, 100);
        System.out.println(savingsAccount);
    }
}

