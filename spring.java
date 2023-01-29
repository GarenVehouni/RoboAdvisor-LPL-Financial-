package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        //bellow are parameters that are specified by the client looking for a personalized portfolio
        String name;
        int age;
        int income;
        int risk;
        int amountToInvest;
        int amountToWithdraw;
        String cashNeeded;
        String additionalComments;

        System.out.println("What is your name?");
        name = scnr.nextLine();
        System.out.println("What is your age?");
        age = scnr.nextInt();
        System.out.println("How much would you like to invest initially into your account?");
        amountToInvest = scnr.nextInt();
        System.out.println("How much risk would you like to take with your investment (Rate 1 (low) - 3 (high))?");
        risk = scnr.nextInt();
        System.out.println("What is your income?");
        income = scnr.nextInt();
        System.out.println("Additional Comments?");
        additionalComments = scnr.nextLine();
        
        if ((age >= 20 && age <=25) && (income >= 50000 && income <= 100000) && (risk == 1) ) {
            System.out.println("Hello! I would recommend that you use the bond as age strategy");
            int stocks = 100 - age;
            System.out.println("You should invest " + age + "% in bonds and " + stocks + "% into stocks.");

            System.out.println("Would you like cash immediately? (Enter 1 for yes, 0 for no)");
            cashNeeded = scnr.nextLine();

            if (cashNeeded == "Yes" || cashNeeded == "yes") {
                System.out.println("How much would you like to withdraw?");
                amountToWithdraw = scnr.nextInt();

                int newBalance = amountToInvest - amountToWithdraw;
                double bondAmount = newBalance * 0.25;
                double stockAmount = newBalance * 0.75;
                System.out.println("You have $" + bondAmount + " invested in bonds and $" + stockAmount + " invested in stocks");


            }

        }
    }
}

