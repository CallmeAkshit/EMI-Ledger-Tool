package com.assignment.models;

public class Loan {

    private float principle;
    private float interest;
    private float term;
    private float amount;
    private Bank bank;

    public Loan(float principle, float interest, float term, Bank bank) {
        this.principle = principle;
        this.interest = interest;
        this.term = term;
        this.bank = bank;
        this.amount = principle + (principle * interest *term)/100;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public float getPrinciple() {
        return principle;
    }

    public float getInterest() {
        return interest;
    }

    public float getTerm() {
        return term;
    }

    public void setPrinciple(float principle) {
        this.principle = principle;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public void setTerm(float term) {
        this.term = term;
    }
}
