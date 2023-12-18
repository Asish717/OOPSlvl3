package com.java;

public class BankAccount {
    public static void main(String[] args) {
        // Creating an object of the outer class BankAcct
        BankAcc acc=new BankAcc("asish",7000);
        // Creating an object of the inner class Interest
        BankAcc.Interest rate=acc.new Interest(10);
        // Accessing variables from the outer class using inner class
        double balance=acc.getBalance();
        double interest=rate.calInterest();
        String holderName=acc.getAccountHolder();
        System.out.println("Account holder name: "+holderName);
        System.out.println("Account balance: "+balance);
        System.out.println("Interest rate: "+rate.interestRate);
        System.out.println("Interest amount: "+interest);
    }
}
class BankAcc{
    public String accountHolder;
    public double balance;
    public BankAcc(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    class Interest{
        public double interestRate;
        public Interest(double interestRate){
            this.interestRate=interestRate;
        }
        public double calInterest(){
            double interestAmt=balance * (interestRate / 100);
            return interestAmt;
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }
}
