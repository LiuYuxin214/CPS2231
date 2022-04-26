package LabExercise09;

import java.util.Date;

public class Account {
    final java.util.Date dateCreated;
    int id = 0;
    double balance = 0;
    double annualInterestRate = 0;

    public Account() {
        dateCreated = new java.util.Date();
    }

    public Account(int newid, double newbalance) {
        id = newid;
        balance = newbalance;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int newid) {
        id = newid;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newbalance) {
        balance = newbalance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double newannualInterestRate) {
        annualInterestRate = newannualInterestRate / 100;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return (annualInterestRate / 12) * balance;
    }

    public String getDateCreate() {
        return dateCreated.toString();
    }

    public void withdraw(double money) {
        balance -= money;
    }

    public void deposit(double money) {
        balance += money;
    }

    public static void main(String[] args) {
        Account a = new Account(1122, 20000);
        a.setAnnualInterestRate(4.5);
        a.withdraw(2500);
        a.deposit(3000);
        System.out.println(a.getBalance());
        System.out.println(a.getMonthlyInterest());
        System.out.println(a.getDateCreate());

    }

}
