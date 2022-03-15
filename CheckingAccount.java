package com.lab.lab8Q2;

public class CheckingAccount {
    private double balance;
    private String number;

    public CheckingAccount(){}


    public CheckingAccount(double balance, String number){
        this.balance = balance;
        this.number = number;
    }

    public void deposit(double amount){
        balance += amount;

    }

    public void withdraw(double amount) throws InsufficientFundsException {

        try {
            if (amount < balance) {
                System.out.println(" The balance after withdraw is: $" + balance);
                balance -= amount;
            } else {
                throw new InsufficientFundsException(amount);
            }


        } catch (InsufficientFundsException e) {
            System.out.println(" Sorry, account is short by: $" + (amount - balance));
        }
    }

    public double getBalance(){
        return balance;
    }

    public String getNumber(){
        return number;
    }

}
