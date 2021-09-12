package com.assignment.services;

import com.assignment.models.Bank;
import com.assignment.models.Borrower;

public class CreateUserService {

    String name;
    Borrower borrower;

    public Borrower createNewUser(String name, Bank bank)
    {
        if(bank.userExistsInBank(name))
        {
            System.out.println("User Already exists!");
            return null;
        }
        borrower = new Borrower(name,bank);
        bank.addNewUser(borrower);
        return borrower;
    }
}
