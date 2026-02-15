package com.itshaala.inheritance;

public class Demo1 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.customerId = 101;
        savingsAccount.accountNumber = 1122;
        savingsAccount.accountHolderName = "Komal";
        savingsAccount.balance = 5000;

        savingsAccount.withdraw(1000);
        System.out.println("current balance is " +savingsAccount.balance);

    }
}
