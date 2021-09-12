package com.assignment.models;

public class Balance {

    private String bank;
    private String borrowerName;
    private float amtPaid;
    private int numEMILeft;

    public String getBank() {
        return bank;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public float getAmtPaid() {
        return amtPaid;
    }

    public int getNumEMILeft() {
        return numEMILeft;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public void setAmtPaid(float amtPaid) {
        this.amtPaid = amtPaid;
    }

    public void setNumEMILeft(int numEMILeft) {
        this.numEMILeft = numEMILeft;
    }
}
