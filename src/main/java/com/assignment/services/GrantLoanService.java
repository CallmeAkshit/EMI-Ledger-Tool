package com.assignment.services;

import com.assignment.models.Bank;
import com.assignment.models.Borrower;
import com.assignment.models.Loan;

public class GrantLoanService {

    Borrower borrower;

    public Loan grantLoan(Borrower borrower, float principle, float interest, float term, Bank bank)
    {
        this.borrower = borrower;
        Loan loan = new Loan(principle,interest,term,bank);
        borrower.setLoan(loan);
        return loan;
    }
}
