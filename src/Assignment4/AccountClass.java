package Assignment4;

import java.util.Date;

class Account {
    private final Date dateCreated;
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;

    Account() {
        dateCreated = new Date();
    }

    Account(int newid, double newbalance) {
        id = newid;
        balance = newbalance;
        dateCreated = new Date();
    }

    int getId() {
        return id;
    }

    void setId(int newid) {
        id = newid;
    }

    double getBalance() {
        return balance;
    }

    void setBalance(double newbalance) {
        balance = newbalance;
    }

    double getAnnualInterestRate() {
        return annualInterestRate;
    }

    void setAnnualInterestRate(double newannualInterestRate) {
        annualInterestRate = newannualInterestRate / 100;
    }

    double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    double getMonthlyInterest() {
        return (annualInterestRate / 12) * balance;
    }

    String getDateCreate() {
        return dateCreated.toString();
    }

    void withdraw(double money) {
        balance -= money;
    }

    void deposit(double money) {
        balance += money;
    }


}

public class AccountClass {

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
