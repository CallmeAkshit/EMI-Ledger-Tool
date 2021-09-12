package com.assignment.services;

import com.assignment.models.Borrower;
import com.assignment.models.LumpSum;

public class PaymentInLumpSum {

    //Borrower borrower;

//    public PaymentInLumpSum(Borrower borrower) {
//        this.borrower = borrower;
//    }

    public void addLumpSum(Borrower borrower, int emiNo, float lumpsAmount)
    {
        if(!borrower.getBank().userExistsInBank(borrower.getName()))
        {
            System.out.println("User Doesn't exist in Bank Records!");
            return;
        }
        LumpSum lumpSum = borrower.getLumpSum();
        lumpSum.addLumpSum(emiNo,lumpsAmount);
    }


}
