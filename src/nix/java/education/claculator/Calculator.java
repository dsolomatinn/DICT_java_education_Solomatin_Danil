package nix.java.education.claculator;

import nix.java.education.coffemachine.CoffeeType;

import java.lang.annotation.ElementType;

public class Calculator {

    int loan;
    int months;
    int payment;

    public void countingMonth() {
        System.out.println("Enter the monthly payment:");
        int monthPay = Main.scanner.nextInt();
        ;
        if (loan % monthPay ==0){
            months = loan / monthPay;
        }
        else {
            months = loan / monthPay +1;
        }
        System.out.println("it will take " + months + " month to repay the loan");
    }

    public void countingPayment(){
        System.out.println("Enter number of month");
        months = Main.scanner.nextInt();
        if (loan % months ==0){
            payment = loan / months;
            System.out.println("Your monthly payment = " + payment);
        }
        else {
            payment = loan / months + 1;
            int lastPayment = loan-(months-1)*payment;
            System.out.println("Your monthly payment = " + payment + " and the last payment = " + lastPayment);
        }
    }

    public void chooseAction() {
        System.out.println("Enter the loan principal");
        loan = Main.scanner.nextInt();
        System.out.println("""
                What do you want to calculate?
                type "m" - for number of monthly payments,
                type "p" - for the monthly payment:""");
        String action = Main.scanner.next();
        if (action.equals("m")) {
            countingMonth();
        }
        if (action.equals("p")) {
            countingPayment();
        }
    }
}