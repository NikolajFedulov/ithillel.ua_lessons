package ua.ithillel.lessons.lesson2.monobank2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Array of terms for the deposit and the corresponding arrays of rates
        int[] term = {1, 2, 5, 8, 11, 12, 24} ;                             // Deposit terms
        double[] intRate = {4, 5, 7.5, 8, 8.5, 9, 10};                      // Interest rate
        double[] intRateTax = {3.22, 4.02, 6.04, 6.44, 6.84, 7.24, 8.05};   // Interest rate after taxes

        // Greeting Output
        System.out.println("WE ARE GLAD TO WELCOME YOU TO OUR BANK");
        System.out.println();
        System.out.println("Please read the information on deposits");
        System.out.println("Term\t| Interest rate\t| Interest rate after taxes");
        for (int i = 0; i<term.length; i++){
            System.out.println(String.format("%s mth\t| %s\t\t\t| %s\t", term[i], intRate[i], intRateTax[i]));
        }

        // Offer to open your deposit
        System.out.println();
        System.out.println("Do you want to open a deposit?");
        System.out.print("yes( y )/no( n ): ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine().toLowerCase(Locale.ROOT);            // Answer to the question (y/n)
        char fsOfAnswer = answer.charAt(0);                                     // First symbol of answer
        while ( answer.length()!=1 || (fsOfAnswer!='y' && fsOfAnswer!='n')) {   // Must be one character: 'y' or 'n'
            System.out.println("Input is invalid!");
            System.out.println("Do you want to open a deposit?");
            System.out.print("yes( y )/no( n ): ");
            answer = scanner.nextLine().toLowerCase(Locale.ROOT);
            fsOfAnswer = answer.charAt(0);
        }

        // If the answer is yes, then enter the data of the contributor
        if (fsOfAnswer == 'n') {
            System.out.println("We will be glad to see you again :)");
        }
        else{
            System.out.print("Please enter your first name: ");
            String fName = scanner.nextLine();                      // First name of the contributor
            System.out.print("Please enter your last name: ");
            String lName = scanner.nextLine();                      // Last name of the contributor
            System.out.print("Please enter your deposit amount: ");
            double depAmount = scanner.nextDouble();                // Deposit amount of the contributor
            System.out.print("Please enter your deposit term: ");
            int depTerm = scanner.nextInt();                        // Deposit term of the contributor
            //System.out.println(fName + " " + lName + " " + depAmount + " " + depTerm);

            // Calculation of the final amount for the contributor and data output
            int index = 0;
            if(depTerm > 24) index = term.length-1;
            else{
                for(int i = 0; i<(term.length-1); i++ ){
                    if (term[i] < depTerm && depTerm <= term[i+1]) {index = i+1; break;}
                    //System.out.println(i + " " + term[i] + " " + depTerm + " " + term[i+1] + " " + index);
                }
            }
            //System.out.println(index);
            double depAmountEnd = depAmount + ((((depAmount/100)*intRateTax[index])/12)*depTerm);       // Final amount
            //System.out.println(depAmountEnd);
            System.out.printf("Dear %s %s you deposit is %.2f UAH\n", fName, lName, depAmount);
            System.out.printf("At the end of %d months you will receive %.2f UAH\n", depTerm, depAmountEnd);
        }
    }
}
