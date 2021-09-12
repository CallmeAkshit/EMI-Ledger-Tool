package com.assignment.services;

import com.assignment.models.Balance;
import com.assignment.models.Borrower;

public class BalanceService {

    float amountPaid(Borrower borrower, int emiNo)
    {
        float emiValue = new EMIService().getEMIValue(borrower);
        float amountThroughEMIs = emiValue * emiNo;
        float amountThroughLumpSum = borrower.getLumpSum().sumPaidTillEMI(emiNo);

        return amountThroughEMIs + amountThroughLumpSum;
    }
    public Balance getBalance(Borrower borrower, int emiNo)
    {
        borrower.getBalance().setBank(borrower.getBank().getBankName());
        borrower.getBalance().setBorrowerName(borrower.getName());
        borrower.getBalance().setAmtPaid(amountPaid(borrower, emiNo));
        borrower.getBalance().setNumEMILeft(new EMIService().getNumLeftEMI(borrower,emiNo));

        return borrower.getBalance();

    }



}
