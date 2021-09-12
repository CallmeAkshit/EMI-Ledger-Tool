package com.assignment.models;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

import java.util.HashMap;

public class Bank {

    private final String bankName;
    //private HashMap<String,String> bankCustomerMap = new HashMap<>();
    private HashMap<String,Borrower> bankCustomerMap = new HashMap<>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public HashMap<String, Borrower> getBankCustomerMap() {
        return bankCustomerMap;
    }

    //    public void setBankName(String bankName) {
//        this.bankName = bankName;
//    }

    public boolean userExistsInBank(String name) throws ExceptionHasMessage {

        if (this.bankCustomerMap.containsKey(name)) {
            return true;
        }
        return false;
    }

    public void addNewUser(Borrower borrower)
    {
        //bankCustomerMap.put(borrower.getName(),borrower.getBank().getBankName());
        bankCustomerMap.put(borrower.getName(),borrower);
    }

}
