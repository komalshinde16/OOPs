package com.itshaala.inheritance;

public class BankAccount {

        int customerId;
        int accountNumber;
        double balance;
        String accountHolderName;

        public void deposit(double amount){
            balance += amount;
        }
        public void withdraw(double amount){
            balance -= amount;
        }
        public double checkBalance(){
            return balance;
        }
    }

