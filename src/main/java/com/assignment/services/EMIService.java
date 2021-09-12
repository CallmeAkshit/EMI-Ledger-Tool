package com.assignment.services;

import com.assignment.models.Borrower;

public class EMIService {

    int EMINumber;
    int EMIValue;
    Borrower borrower;

    int getNumTotalEMI(Borrower borrower)
    {
        return (int) Math.ceil(borrower.getLoan().getTerm() * 12);
    }

    float getEMIValue(Borrower borrower)
    {
        int totalEMIs = getNumTotalEMI(borrower);
        return borrower.getLoan().getAmount()/totalEMIs;
    }

    int getNumLeftEMI(Borrower borrower, int numPaidEMI)
    {
        float initialAmt = borrower.getLoan().getAmount();
        float amountPaid = new BalanceService().amountPaid(borrower,numPaidEMI);
        float emiValue = getEMIValue(borrower);

        return (int) Math.ceil((initialAmt - amountPaid)/emiValue);
    }

}
