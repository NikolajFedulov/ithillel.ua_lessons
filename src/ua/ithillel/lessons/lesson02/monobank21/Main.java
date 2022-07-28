package ua.ithillel.lessons.lesson02.monobank21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int intRate = 8;                                        // Interest rate

        System.out.println("WE ARE GLAD TO WELCOME YOU TO OUR BANK");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your first name: ");
        String fName = scanner.nextLine();                      // First name of the contributor
        System.out.print("Please enter your last name: ");
        String lName = scanner.nextLine();                      // Last name of the contributor
        System.out.print("Please enter your deposit amount: ");
        double depAmount = scanner.nextDouble();                // Deposit amount of the contributor

        double depAmountEnd = depAmount + ((depAmount/100)*intRate);       // Final amount

        System.out.printf("Dear %s %s you deposit is %.2f UAH\n", fName, lName, depAmount);
        System.out.printf("At the end of 1 year you will receive %.2f UAH\n", depAmountEnd);
        System.out.printf("At the end of 5 years you will receive %.2f UAH\n", depAmountEnd*5);
        System.out.printf("At the end of 10 years you will receive %.2f UAH\n", depAmountEnd*10);
    }
}
