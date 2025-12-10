// Eren Kaya, Car Loan Calculator, 09/26/2025
/*
 * ***************************************
 * Car Loan Calculator
 * 
 * This program calculates the monthly car payment for a
 * car loan based on user input.
 * 
 * The program checks user input to ensure correct data types.
 * ***************************************
 */
import java.util.Scanner;

public class CarLoanCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking for the loan amount
        System.out.print("How much is the car loan: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a whole number amount: ");
            scanner.next();
            continue;
        }
        int carLoan = scanner.nextInt();

        // Asking for the length of the loan
        System.out.print("How long is your loan? (in years): ");
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a whole number of years: ");
            scanner.next();
            continue;
        }
        int loanLength = scanner.nextInt();

        int interestRate = 5;

        // Asking for the down payment
        System.out.print("How much is the down payment: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a whole number amount: ");
            scanner.next();
            continue;
        }
        int downPayment = scanner.nextInt();

        scanner.close();

        // Conditions to make sure every data given is valid or if the car can be paid in full
        if (loanLength <= 0) {
            System.out.println("Error! You must take out a valid car loan.");
        } else if (downPayment >= carLoan) {
            System.out.println("The car can be paid in full.");
        } else {
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = (monthlyBalance * interestRate) / 100;
            int monthlyPayment = monthlyBalance + interest;

            System.out.println("Your monthly payment will be: " + monthlyPayment);
        }
    }
}