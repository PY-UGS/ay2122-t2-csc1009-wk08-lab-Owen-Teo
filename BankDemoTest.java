package com.lab.lab8Q2;
import java.util.*;

public class BankDemoTest {
    public static void main(String[] arg) throws InsufficientFundsException {
        int choice, number;



        CheckingAccount acc = new CheckingAccount(0, "Tom");
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to bank");


        do {

            System.out.println("1. Deposit ");
            System.out.println("2. Withdraw ");
            System.out.println("3. Exit ");
            System.out.println("Enter choice: ");

            number = sc.nextInt();
            choice = number ;



                switch (choice) {
                    case 1:
                        System.out.println("Enter amount to deposit: ");
                        double amount = sc.nextDouble();
                        System.out.println(amount);
                        acc.deposit(amount);
                        break;

                    case 2:
                        System.out.println("Enter amount to withdraw: ");
                        double amt = sc.nextDouble();
                        System.out.println(amt);
                        acc.withdraw(amt);
                        break;

                    case 3:
                        System.out.println("Thanks");
                        break;


                }



    }while(choice != 3);


    }


}
