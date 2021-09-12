package com.assignment.drivers;

import com.assignment.models.Balance;
import com.assignment.models.Bank;
import com.assignment.models.Borrower;
import com.assignment.services.BalanceService;
import com.assignment.services.CreateUserService;
import com.assignment.services.GrantLoanService;
import com.assignment.services.PaymentInLumpSum;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class driver {

    public static  void main(String[] args) throws IOException {
        Bank IDIDI = new Bank("IDIDI");
        CreateUserService createUserService = new CreateUserService();
        GrantLoanService grantLoanService = new GrantLoanService();
        PaymentInLumpSum paymentInLumpSum = new PaymentInLumpSum();
        BalanceService balanceService = new BalanceService();

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Input File Path");
        String inputPath = sc.nextLine();

        File file = new File(inputPath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null)
        {
            String[] command = st.split(" ");
            if(Objects.equals(command[0], "LOAN"))
            {
                try{
                    Borrower Dale = createUserService.createNewUser(command[2], IDIDI);
                    grantLoanService.grantLoan(Dale,Float.parseFloat(command[3]),Float.parseFloat(command[5]),Float.parseFloat(command[6]),IDIDI);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
            else if(Objects.equals(command[0], "PAYMENT"))
            {
                try{
                    Borrower borrower = IDIDI.getBankCustomerMap().get(command[2]);
                    paymentInLumpSum.addLumpSum(borrower,Integer.parseInt(command[4]),Float.parseFloat(command[3]));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
            else if(Objects.equals(command[0], "BALANCE"))
            {
                try{
                    Borrower borrower = IDIDI.getBankCustomerMap().get(command[2]);
                    Balance balance = balanceService.getBalance(borrower,Integer.parseInt(command[3]));
                    System.out.println(IDIDI.getBankName() + " " + borrower.getName() + " " + balance.getAmtPaid() + " " + balance.getNumEMILeft());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        }



//        Borrower Dale = createUserService.createNewUser("Dale", IDIDI);
//        grantLoanService.grantLoan(Dale,5000f,6f,1f,IDIDI);
//        paymentInLumpSum.addLumpSum(Dale,5,1000f);
//        Balance balance = balanceService.getBalance(Dale,6);
//
//        Borrower Shelly = createUserService.createNewUser("Shelly", IDIDI);
//        grantLoanService.grantLoan(Shelly,15000f,9f,2f,IDIDI);
//        paymentInLumpSum.addLumpSum(Shelly,12,7000f);
//        Balance balance2 = balanceService.getBalance(Shelly,12);
//
//        System.out.println(balance.getNumEMILeft());
//        System.out.println(balance2.getNumEMILeft());
    }

}
