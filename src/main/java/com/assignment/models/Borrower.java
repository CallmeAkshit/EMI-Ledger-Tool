package com.assignment.models;

public class Borrower {

    private String name;
    private Loan loan;
    private LumpSum lumpSum;
    private Bank bank;
    private Balance balance;

    public Balance getBalance() {
        return balance;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    public Bank getBank() {
        return bank;
    }

    public Borrower(Loan loan) {
        this.loan = loan;
        this.lumpSum = new LumpSum();
    }

    public Borrower(String name, Bank bank) {
        this.name = name;
        this.bank = bank;
        this.lumpSum = new LumpSum();
        this.balance = new Balance();
    }

    public LumpSum getLumpSum() {
        return lumpSum;
    }

    public void setLumpSum(LumpSum lumpSum) {
        this.lumpSum = lumpSum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }
}
