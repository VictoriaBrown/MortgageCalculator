/* Mortgage Calculator - Calculate the monthly payments of a fixed term mortgage
over given Nth terms at a given interest rate. Also figure out how long it will
take the user to pay back the loan. For added complexity, I will be adding an
option for users to select the compounding interval (Monthly, Weekly, Daily).
Programmer:       Victoria Brown
Date:             September 2016
MortgageCalculator.java */

// Import Scanner class
import java.util.Scanner;

public class MortgageCalculator {

  public static void main(String[] args) {

    // Scanner object to accept input
    Scanner input = new Scanner(System.in);

    // Variables:
    int term;
    double loanAmount;
    double interestRate;
    double totalCost = 0.0;
    double totalInterest;
    String answer;

    System.out.print("Please enter the term (number of years) for your loan: ");
    term = input.nextInt();
    System.out.println();

    System.out.print("Please enter the loan amount: ");
    loanAmount = input.nextDouble();
    System.out.println();

    System.out.print("Please enter the interest rate in the format of a decimal: ");
    interestRate = input.nextDouble();
    System.out.println();

    totalInterest = loanAmount * interestRate * term;
    totalCost = loanAmount + totalInterest;

    System.out.printf("Total cost for mortgage is $ %.2f", totalCost );
    System.out.println();
    System.out.println("Please enter 'monthly', 'daily', or 'weekly' to know " +
      "how much it will cost per month/day/week: ");
    answer = input.next();

    if(answer.equals("Monthly") || answer.equals("monthly")) {
      System.out.printf("Monthly cost: %.2f", (totalCost/(term*12)));
    } else if (answer.equals("Daily") || answer.equals("daily")) {
      System.out.printf("Daily cost: %.2f", (totalCost/(term*365)));
    } else if (answer.equals("weekly") || answer.equals("Weekly")) {
      System.out.printf("Weekly cost: %.2f", (totalCost/(term*52)));
    }
  }
}
